package org.launchcode.studio7;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseDisc {

    private double storageCapacityMB;
    private String name;
    private HashMap<String, Double> storageFile;
    private boolean discBurned = false;
    private int rpmLow;
    private int rpmHigh;


    BaseDisc(double aStorageCapacityMB, String aName){
        this.storageCapacityMB = aStorageCapacityMB;
        this.name = aName;
    }

    public int getRpmHigh() {
        return rpmHigh;
    }

    public void setRpmHigh(int rpmHigh) {
        this.rpmHigh = rpmHigh;
    }

    public int getRpmLow() {
        return rpmLow;
    }

    public void setRpmLow(int rpmLow) {
        this.rpmLow = rpmLow;
    }

    public boolean isDiscBurned() {
        return discBurned;
    }

    public HashMap<String, Double> getFiles(){
        return storageFile;
    }

    public double getStorageCapacityMB() {
        return storageCapacityMB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void loadDisc();

    public void writeDisc(){
        if(this.discBurned){
            System.out.println("Can't overwrite disc");
        } else {
            for (Map.Entry<String, Double> files : this.storageFile.entrySet()) {
                this.storageCapacityMB -= files.getValue();
                System.out.println(files.getKey() + ": " + files.getValue() + " burned to disc");
            }
            this.discBurned = true;
        }
    }

    public void storeData(HashMap<String, Double> dataToStore){

        for(Map.Entry<String, Double> dataFile : dataToStore.entrySet()){
            if(this.storageCapacityMB - dataFile.getValue() < 0) {
                System.out.println("Not enough space on disc");
            } else {
                storageFile.put(dataFile.getKey(), dataFile.getValue());
                System.out.println(dataFile.getKey() + ": " + dataFile.getValue() + " prepped for writing.");
            }
        }
    }


}
