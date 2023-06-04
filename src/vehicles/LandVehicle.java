package vehicles;
public abstract class LandVehicle extends vehicle {
    private int num_of_wheels;
    private String kind_of_way;

    public LandVehicle(String model,  long speed_max, long maximum_passengers, int num_of_wheels, String kind_of_way) {
        super(model,  speed_max, maximum_passengers);
        this.num_of_wheels = num_of_wheels;
        this.kind_of_way = kind_of_way;
    }

    public int get_num_of_wheels() {
         /*
        return the num_of_wheels of LandVehicle
         */
        return num_of_wheels;
    }

    public String get_kind_of_way() {
         /*
        return the kind_of_way of LandVehicle
         */
        return kind_of_way;
    }


    public String toString(){
         /*
        A string representation of the object
         */
        return super.toString() + " num of wheels: " + num_of_wheels + " kind_of_way: " + kind_of_way;
    }

    public boolean equals(Object other) {
        /*
        The function compares two objects to see if they are equal
        @param other The object you want to compare
        return True if the objects are equal and false if not
         */
        boolean ans = false;
        if (other instanceof LandVehicle) {
            ans = super.equals(other) && num_of_wheels == ((LandVehicle) other).num_of_wheels && kind_of_way.equals(((LandVehicle) other).kind_of_way);
        }
        return ans;
    }
}

