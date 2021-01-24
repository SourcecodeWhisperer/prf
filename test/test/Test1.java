package test;

import collector.Collector;
import collector.CollectorImpl;
import dataStorage.Datenspeicher;
import dataStorage.DatenspeicherImpl;
import org.junit.Assert;
import org.junit.Test;
import sensor.Sensor;
import sensor.SensorData;
import sensor.SensorDataImpl;
import sensor.SensorImpl;

import java.io.IOException;

public class Test1 {
    Datenspeicher ds = new DatenspeicherImpl("test.txt");
    SensorData s1 = new SensorDataImpl(20,10,"Sensor1");
    SensorData s2 = new SensorDataImpl(10,20,"Sensor1");
    SensorData s3 = new SensorDataImpl(10,30,"Sensor3");
    SensorData s4 = new SensorDataImpl(20,Float.MAX_VALUE,"hello");
    SensorData s5 = new SensorDataImpl(10,Float.MIN_VALUE,"hello");
    SensorData s6 = new SensorDataImpl(10,Float.MAX_VALUE,"hello");
    SensorData s7 = new SensorDataImpl(20,10,"Sensor2");
    SensorData s8 = new SensorDataImpl(10,30,"Sensor1");
    SensorData s9 = new SensorDataImpl(10,30,"Sensor2");
    @Test
    public void goodTest() throws Exception {
        ds.saveData(s1);
        ds.saveData(s2);
        ds.saveData(s3);
        ds.saveData(s7);
        ds.saveData(s8);
        ds.saveData(s9);

        Assert.assertEquals(20,ds.avg(s2.getSensorName()),0.1);
    }
    @Test
    public void randtest() throws Exception {
        ds.saveData(s1);
        Assert.assertEquals(s1.getValue(),ds.avg("Sensor1"),0.1);
    }
    @Test
    public void randtest3() throws Exception {

    }

    @Test(expected = Exception.class)
    public void badtest2() throws Exception {
        //file = null
        Datenspeicher ds = new DatenspeicherImpl(null);
        SensorData s = new SensorDataImpl(0,0,"hello");
        ds.saveData(s);
    }
    @Test
    public void randtest2() throws Exception {
        //average only 1 float
        ds.saveData(s4);
        Assert.assertEquals(Float.MAX_VALUE,ds.avg(),0.1);

    }
    @Test
    public void randtest4() throws Exception {
        //average only 1 float
        ds.saveData(s5);
        Assert.assertEquals(Float.MIN_VALUE,ds.avg(),0.1);

    }
    @Test
    public void goodtest2() throws Exception {
        ds.saveData(s1);
        ds.saveData(s2);
        ds.saveData(s3);
        Assert.assertEquals(20,ds.avg(),0.1);
    }
    @Test
    public void goodtest3() throws Exception {
        //
        ds.saveData(s1);
        ds.saveData(s2);
        ds.saveData(s3);
        ds.saveData(s7);
        ds.saveData(s8);
        ds.saveData(s9);
        Assert.assertEquals(s7,ds.getData().get(3));

    }

}