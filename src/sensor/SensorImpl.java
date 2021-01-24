package sensor;



import dataStorage.Datenspeicher;
import dataStorage.DatenspeicherImpl;
import sensorDataEx.SendSensorData;
import sensorDataEx.SendSensorDataImpl;
import tcp.Client;
import tcp.Connection;
import tcp.TCPConnector;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SensorImpl implements Sensor {
    Datenspeicher ds;
    OutputStream os;

    public SensorImpl(Datenspeicher ds) {
        this.ds = ds;
    }

    @Override
    public void connecet(String hostname, int port) throws IOException {
        Client client = new TCPConnector();
        Connection ct = client.connect(hostname,port);
        this.os = ct.getOutputStream();
    }

    @Override
    public void save2File(SensorData data) throws Exception {
        ds.saveData(data);
    }

    @Override
    public void sendToCollector() throws Exception {
        DataOutputStream daos = new DataOutputStream(this.os);
        for (int x = 0;x < ds.getData().size(); x++){
            daos.

        }

    }
}
