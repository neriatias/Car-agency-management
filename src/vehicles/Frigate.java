package vehicles;

public class Frigate extends WaterVehicle implements motorized {
    private double averageFuelConsumption;
    private double averageEngineLifetime;

    public Frigate(String model,  long speed_max, long maximum_passengers, boolean with_the_wind) {
        super(model,  speed_max, maximum_passengers, with_the_wind, "israel");
        averageEngineLifetime = 500;
        averageEngineLifetime = 4;
    }

    public boolean SetFuelConsumption(double averageFuelConsumption) {
       /*
        Updates the averageFuelConsumption variable of the object
        @param averageFuelConsumption the  double that you want to update to be the double of the object
        return true When the operation completes successfully
         */
        this.averageFuelConsumption = averageFuelConsumption;
        return true;
    }

    public double getFuelConsumption() {
         /*
        return the FuelConsumption of WaterVehicle
         */
        return averageFuelConsumption;
    }

    public double getEngineLifetime() {
         /*
        return the EngineLifetime of WaterVehicle
         */
        return averageEngineLifetime;
    }

    @Override
    public String toString() {
         /*
        A string representation of the object
         */
        return " Frigata " + super.toString() + " Engine: " + averageFuelConsumption + ", lifetime of " + averageEngineLifetime + " years ";
    }
    public boolean equals(Object other) {
        /*
        The function compares two objects to see if they are equal
        @param other The object you want to compare
        return True if the objects are equal and false if not
         */
        boolean ans = false;
        if (other instanceof Frigate) {
            ans = super.equals(other) && averageFuelConsumption == ((Frigate) other).averageFuelConsumption && averageEngineLifetime  == ((Frigate) other).averageEngineLifetime ;
        }
        return ans;
    }
}
