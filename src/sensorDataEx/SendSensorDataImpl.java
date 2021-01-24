package sensorDataEx;

import sensor.SensorData;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SendSensorDataImpl implements SendSensorData{
    @Override
    public void SendOutputstream(SensorData testSensor, OutputStream os) throws IOException {
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeLong(testSensor.getTimeStamp());
        dos.writeFloat(testSensor.getValue());
        dos.writeUTF(testSensor.getSensorName());
    }
}
