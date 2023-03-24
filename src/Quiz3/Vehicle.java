package Quiz3;

import java.util.Arrays;

public class Vehicle implements Comparable<Vehicle> {

    //Attributes
    private int numberOfWheels;
    private String type;
    private String color;
    private String owner;

    //Constructor
    public Vehicle(int wheels, String type,  String owner) {
        this.numberOfWheels = wheels;
        this.type = type;
        this.owner = owner;
    }

    //Other Methods
    public void changeOrder(String newName) {
        owner = newName;
    }

    //toString
    public String toString() {
        return "Vehicle owned by " +  owner + " with " + numberOfWheels+" wheels";
    }


    @Override
    public int compareTo(Vehicle otherVehicle) {
        // First, compare by owner
        int ownerCompare = this.owner.compareTo(otherVehicle.owner);
        if (ownerCompare != 0) {
            return ownerCompare;
        }

        // If owners are equal, compare by number of wheels
        return Integer.compare(this.numberOfWheels, otherVehicle.numberOfWheels);
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {new Vehicle(4, "car", "Suzy"),
                new Vehicle(2, "bicycle", "Tommy"),
                new Vehicle(4, "truck", "Adele")};

        System.out.println("List was originally");
        System.out.println(Arrays.toString(vehicles));
        Arrays.sort(vehicles);
        System.out.println("sorted by name first then number of wheels the list is now");
        System.out.println(Arrays.toString(vehicles));
    }
}
