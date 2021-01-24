package collector;

import sensor.SensorData;

import java.io.IOException;

public interface Collector {
    /**
     * accept a connnection from Sensor
     * @param portNumber Portnummber for tcp connection
     * @throws IOException throws when failed to build a connection
     */

    void acceptConnection(int portNumber) throws Exception;

}
