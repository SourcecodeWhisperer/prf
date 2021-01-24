package sensor;

import tcp.Connection;

import java.io.IOException;

public interface Sensor {
    /**
     * a methode to connect with a server
     * @param hostname Hostname for tcp Destination
     * @param port  Port for tcp Destination
     * @throws IOException throws exeption when failing to build connection
     */
    void connecet(String hostname, int port)throws IOException;

    /**
     * a methode to save Sensordata in a local file
     * @param data data from type sensor.SensorData
     */
    void save2File(SensorData data) throws Exception;

    /**
     * send sensor.SensorData to collector.Collector
     */
    void sendToCollector() throws Exception;
}
