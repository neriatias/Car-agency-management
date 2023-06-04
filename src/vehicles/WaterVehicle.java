package vehicles;

public abstract class WaterVehicle extends vehicle {
    private boolean with_the_wind;
    private String flag;
    public WaterVehicle(String model , long speed_max ,long maximum_passengers ,boolean with_the_wind , String flag ){
        super(model, speed_max, maximum_passengers);
        this.flag = flag;
        this.with_the_wind = with_the_wind;
    }

    @Override
    public String toString() {
         /*
        A string representation of the object
         */
        if (get_with_the_wind()) {
            return super.toString() + " under " + flag + " flag " + " with the wind ";
        }
        return super.toString() + " under " + flag + " flag " ;
    }
    public boolean equals(Object other) {
        /*
        The function compares two objects to see if they are equal
        @param other The object you want to compare
        return True if the objects are equal and false if not
         */
        boolean ans = false;
        if (other instanceof WaterVehicle) {
            ans = super.equals(other) && flag.equals(((WaterVehicle) other).flag) && with_the_wind == ((WaterVehicle) other).with_the_wind;
        }
            return ans;
    }
    public boolean get_with_the_wind(){
         /*
        return the with_the_wind of WaterVehicle
         */
        return with_the_wind;
    }
    public String get_flag(){
         /*
        return the flag of WaterVehicle
         */
        return flag;
    }
    public boolean set_with_the_wind(boolean w){
           /*
        Updates the with_the_wind variable of the object
        @param w the boolean  that you want to update to be the with_the_wind of the object
        return true When the operation completes successfully
         */
        this.with_the_wind = w;
        return true;
    }
    public boolean set_flag(String f){
           /*
        Updates the flag variable of the object
        @param f the  string that you want to update to be the flag of the object
        return true When the operation completes successfully
         */
        this.flag = f;
        return true;
    }

}
