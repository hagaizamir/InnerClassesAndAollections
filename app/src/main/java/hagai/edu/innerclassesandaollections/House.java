package hagai.edu.innerclassesandaollections;

/**
 * Created by Hagai Zamir on 23-May-17.
 */

//class in a class

public class House {
    private String address;
    //No room without house
    //a room always knows the house it's in.(IE a reference)

    public House(String address) {
        this.address = address;
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
