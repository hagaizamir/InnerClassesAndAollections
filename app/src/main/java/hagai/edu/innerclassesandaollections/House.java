package hagai.edu.innerclassesandaollections;

import android.support.v7.app.AlertDialog;

import java.util.ArrayList;

/**
 * Created by Hagai Zamir on 23-May-17.
 */

//Class in a class
public class House  {
    private String address;

    private ArrayList<Room> rooms = new ArrayList<>();
    //No room without a house.
    //A Room Always knows the house it's in. (IE A Reference).

    //No Constructor: Must have a factory or builder
    private House() {
        //new Room(10, 10);
    }



    public static class Builder{
        private House h;

        public Builder() {
            this.h = new House(); //empty house, no rooms, no address.
        }

        public Builder addRoom(double width, double height){
            Room r = h.new Room(width, height);
            h.rooms.add(r);
            return this;
        }

        public Builder setAddress(String address){
            h.address = address;
            return this;
        }

        public House build(){
            return h;
        }
    }

    public class Room{
        private double width;
        private double height;

        public Room(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public String toString() {
            return "Room: Width: " + width +
                    " Height: " + height +
                    " Address: " + address;
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
