package sensorDataEx;

import sensor.SensorData;

import java.io.IOException;
import java.io.InputStream;

public interface ReceiveSensorData {
    SensorData ReceiveInputstream(InputStream is) throws IOException;
}
