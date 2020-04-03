package com.example.srikate.ibeacondemo.model;

import java.util.List;

/**
 * Created by srikate on 10/9/2017 AD.
 */

public class BeaconDeviceModel implements Comparable {
    private int minor, major, signal;

    public BeaconDeviceModel(int major, int minor, int signal){
        this.minor = minor;
        this.major = major;
        this.signal = signal;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getSignal() {
        return signal;
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }

    @Override
    public int compareTo(Object b) {
        if (b instanceof BeaconDeviceModel){
            int compareSignal = ((BeaconDeviceModel) b).getSignal();
            return this.getSignal() - compareSignal;
        }
        return 0;
    }
}
