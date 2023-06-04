package vehicles;

public abstract class AirVehicle extends vehicle {
    private String use;
    public AirVehicle(String model , long speed_max ,long maximum_passengers , String use ){
        super(model,  speed_max, maximum_passengers);
        this.use = use;
    }
    public String get_use(){
          /*
        return the use of AirVehicle
         */
        return use;
    }
    public boolean set_use(String u){
           /*
        Updates the use variable of the object
        @param m the A string that you want to update to be the use of the object
        return true When the operation completes successfully
         */
        this.use = u;
        return true;
    }
    public String toString() {
         /*
        A string representation of the object
         */
        return super.toString() + " use: " + use;
    }
    public boolean equals(Object other) {
        /*
        The function compares two objects to see if they are equal
        @param other The object you want to compare
        return True if the objects are equal and false if not
         */
        boolean ans = false;
        if (other instanceof AirVehicle) {
            ans = super.equals(other) && use.equals(((AirVehicle) other).use);
        }
        return ans;
    }


}
