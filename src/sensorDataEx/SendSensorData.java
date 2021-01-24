package sensorDataEx;

import sensor.SensorData;

import java.io.IOException;
import java.io.OutputStream;

public interface SendSensorData {
    void SendOutputstream(SensorData testSensor, OutputStream os) throws IOException;

}
