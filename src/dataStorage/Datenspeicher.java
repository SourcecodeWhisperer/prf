package dataStorage;

import sensor.SensorData;

import java.util.List;

public interface Datenspeicher {
    /**
     * saves data in a file and a list
     * @param data Expected data from type SensorData
     * @throws Exception when failed to open an File
     */
    void saveData(SensorData data) throws Exception;

    /**
     * calculate average from a specific sensor
     * @param sensorName  name of the Sensor
     * @return return the average float
     * @throws Exception
     */
    float avg(String sensorName) throws  Exception;

    /**
     * calculate average from all sensors
     * @return  return the average float
     * @throws Exception
     */
    float avg()throws Exception;

    /**
     *
     * @return returns a SensorData list
     * @throws Exception
     */
    List<SensorData> getData() throws Exception;
}
