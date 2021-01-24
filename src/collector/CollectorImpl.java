package collector;



import dataStorage.Datenspeicher;
import sensor.SensorData;
import sensorDataEx.ReceiveSensorData;
import sensorDataEx.ReceiveSensorDataImpl;
import tcp.Connection;
import tcp.Server;
import tcp.TCPConnector;

import java.io.IOException;

public class CollectorImpl implements Collector {
    private Datenspeicher ds;



    @Override
    public void acceptConnection(int portNumber) throws Exception {
        Server server = new TCPConnector();
        Connection connect =  server.acceptConnection(portNumber);

        ReceiveSensorData rsd = new ReceiveSensorDataImpl();
        this.ds.saveData(rsd.ReceiveInputstream(connect.getInputStream()));

    }


}
