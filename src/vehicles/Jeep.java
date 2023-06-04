package vehicles;

public class Jeep extends LandVehicle implements  motorized,CommercialUse{
    private double averageFuelConsumption;
    private double averageEngineLifetime;
    private String license_type;
    public Jeep(String model,  long speed_max, double averageFuelConsumption ,double averageEngineLifetime ){
        super(model,  speed_max, 5,4,"dirt road");
        license_type = "MINI";
        this.averageEngineLifetime = averageEngineLifetime;
        this.averageFuelConsumption = averageFuelConsumption;
    }
    public boolean SetFuelConsumption(double averageFuelConsumption)
    {
         /*
        Updates the averageFuelConsumption variable of the object
        @param averageFuelConsumption the  double that you want to update to be the double of the object
        return true When the operation completes successfully
         */
        this.averageFuelConsumption = averageFuelConsumption;
        return true;
    }
    public double getFuelConsumption(){
        return  averageFuelConsumption;
    }
    public double getEngineLifetime(){
        return averageEngineLifetime;
    }
    public String toString(){
         /*
        A string representation of the object
         */
        return "jeep: " + super.toString() + " average fuel consumption: "+ averageFuelConsumption + " average engine lifetime: " + averageEngineLifetime + " license_type: " + license_type;
    }
    public String get_license_type(){
         /*
        return the license_type of Jeep
         */
        return license_type;
    }
    public boolean equals(Object other) {
        /*
        The function compares two objects to see if they are equal
        @param other The object you want to compare
        return True if the objects are equal and false if not
         */
        boolean ans = false;
        if (other instanceof Jeep) {
            ans = super.equals(other) && averageFuelConsumption == ((Jeep) other).averageFuelConsumption && averageEngineLifetime  == ((Jeep) other).averageEngineLifetime && license_type.equals(((Jeep) other).license_type);
        }
        return ans;
    }
}
