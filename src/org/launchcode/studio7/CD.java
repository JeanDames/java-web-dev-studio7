package org.launchcode.studio7;

import java.util.Map;

public class CD extends BaseDisc implements OpticalDisc{


    CD(double aStorageCapacityMB, String aName) {
        super(aStorageCapacityMB, aName);
        this.setRpmHigh(500);
        this.setRpmLow(200);
    }


    // TODO: Implement your custom interface.
    @Override
    public void spin() {
        System.out.println("CD spinning at " + this.getRpmLow() + " - " + this.getRpmHigh() + " rpm");
    }

    @Override
    public void readDisc() {
        if(!this.isDiscBurned()){
            System.out.println("Disc contains no data");
        } else {
            System.out.println("Disc successfully read");
        }
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    @Override
    public void loadDisc() {
        if(this.getFiles() == null){
            System.out.println("No data to load");
        } else {
            System.out.println(this.getName() + " loaded");
            for (Map.Entry<String, Double> files : this.getFiles().entrySet()) {
                System.out.println(files.getKey() + " : " + files.getValue());
            }
        }
    }


}
