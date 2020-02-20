package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    DVD(double aStorageCapacityMB, String aName) {
        super(aStorageCapacityMB, aName);
        this.setRpmHigh(1600);
        this.setRpmLow(570);
    }



    @Override
    public void loadDisc() {

    }


    // TODO: Implement your custom interface.


    @Override
    public void spin() {
        System.out.println("DVD spinning at " + this.getRpmLow() + " - " + this.getRpmHigh() + " rpm");
    }

    @Override
    public void readDisc() {

    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
