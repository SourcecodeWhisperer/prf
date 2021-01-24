package sensor;



public class SensorDataImpl implements SensorData {
    long timeStamp;
    float value;
    String sensorName;

    public SensorDataImpl(long timeStamp, float value, String sensorName) {
        this.timeStamp = timeStamp;
        this.value = value;
        this.sensorName = sensorName;
    }

    @Override
    public long getTimeStamp() {
        return this.timeStamp;
    }

    @Override
    public float getValue() {
        return this.value;
    }

    @Override
    public String getSensorName() {
        return this.sensorName;
    }
}