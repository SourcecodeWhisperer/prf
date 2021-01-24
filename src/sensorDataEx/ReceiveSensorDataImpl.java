package sensorDataEx;

import sensor.SensorData;
import sensor.SensorDataImpl;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReceiveSensorDataImpl implements ReceiveSensorData {
    @Override
    public SensorData ReceiveInputstream(InputStream is) throws IOException {
        DataInputStream dis = new DataInputStream(is);

        return new SensorDataImpl(dis.readLong(),dis.readFloat(),dis.readUTF());
    }
}
