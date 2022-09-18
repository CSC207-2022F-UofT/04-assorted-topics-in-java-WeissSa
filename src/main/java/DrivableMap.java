/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /*
     */
    public boolean addDrivable(String ID, Drivable obj) {
        if (drivable_map.containsKey(ID)) {
            return false;
        } else {
            drivable_map.put(ID, obj);
            return true;
        }
    }




    /*
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */
    public boolean hasFasterThan(int speed) {
        for (Drivable drivable : drivable_map.values()) {
            if (drivable.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }





    /*
     */
    public ArrayList<Tradable> getTradable() {
        ArrayList<Tradable> tradableSoFar = new ArrayList<Tradable>();
        for (Drivable drivable : drivable_map.values()) {
            if (drivable instanceof Tradable) {
                tradableSoFar.add( (Tradable) drivable);
            }
        }
        return tradableSoFar;
    }



    
}