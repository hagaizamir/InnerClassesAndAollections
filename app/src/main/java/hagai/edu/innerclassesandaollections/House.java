package hagai.edu.innerclassesandaollections;

import android.support.v7.app.AlertDialog;

import java.util.ArrayList;

/**
 * Created by Hagai Zamir on 23-May-17.
 */

//class in a class


private class House {
    private String address;


    //No room without house
    //a room always knows the house it's in.(IE a reference)

    public static class Builder {
        private int room;
        private int walls;

        public Builder (int qt){
            this.room = qt;
            this.walls = qt;
        }

    }

    public House(String address, int numRooms) {
        this.address = address;
        for (int i = 0; i <numRooms ; i++) {
            rooms.add(new Room(10,10));

        }
    }

    public class Room{
        public Room(double width, double height) {

            this.width = width;
            this.height = height;
        }

        private House mHouse = House.this;
        private  double width;
        private  double height;
        @Override
        public String toString() {
            return "Room: width:" + width+
                    "Height:" + height+
                    "Address:" + address;

        }
    }
}
