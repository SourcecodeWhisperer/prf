package sensor;

public interface SensorData {
    /**
     *
     * @return Time Stampe
     */
    long getTimeStamp();
    /**
     *
     * @return Value from sensor.Sensor
     */
    float getValue();
    /**
     *
     * @return Name of sensor.Sensor
     */
    String getSensorName();
}
