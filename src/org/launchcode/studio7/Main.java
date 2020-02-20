package org.launchcode.studio7;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD album = new CD(700, "90s Hip Hop Mix");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(album.getStorageCapacityMB());
        album.spin();
        album.readDisc();
        album.loadDisc();
        HashMap<String, Double> file = new HashMap<>();
        file.put("The Choice Is Yours", 8.4);
        file.put("Pony", 11.3);
        file.put("Big Pimpin'", 10.0);
        album.storeData(file);

    }
}
