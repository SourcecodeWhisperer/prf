package dataStorage;

import dataStorage.Datenspeicher;
import sensor.SensorData;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

public class DatenspeicherImpl implements Datenspeicher {
    List<SensorData> sd = new LinkedList<SensorData>();
    private final String filename;

    public DatenspeicherImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void saveData(SensorData data) throws Exception {
        FileOutputStream fos = new FileOutputStream(this.filename);
        DataOutputStream daos = new DataOutputStream(fos);

        sd.add(data);

        daos.writeUTF(data.getSensorName());
        daos.writeFloat(data.getValue());
        daos.writeLong(data.getTimeStamp());

        daos.close();
        fos.close();
    }

    @Override
    public float avg(String sensorName) throws Exception {
        float erg = 0;
        int i = 0;
        for(int x = 0; x < sd.size();x++){
            if(sd.get(x).getSensorName().equals(sensorName)){
                erg +=  sd.get(x).getValue();
                i++;
            }

        }

        return erg/i;
    }

    @Override
    public float avg() throws Exception {

        float erg = 0;
        if(sd.size() == 1){
            return sd.get(0).getValue();
        }else{
            for(int x = 0; x < sd.size();x++){
                erg += (int) sd.get(x).getValue();
            }
        }

        return erg/sd.size();
    }

    @Override
    public List<SensorData> getData() throws Exception {
        return sd;
    }
}
