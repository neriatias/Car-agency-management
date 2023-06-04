package vehicles;

public abstract class vehicle {
    private String model;
    private double KM;
    private long speed_max;
    private long maximum_passengers;
    public vehicle (String model , long speed_max ,long maximum_passengers){
        this.model = model;
        this.KM = 0;
        this.speed_max = speed_max;
        this.maximum_passengers = maximum_passengers;
    }public boolean movement (double K){
        if (KM >= 0){
            KM += K;
            return true;
        }
        return false;
    }
    public boolean equals(Object other) {
        /*
        The function compares two objects to see if they are equal
        @param other The object you want to compare
        return True if the objects are equal and false if not
         */
        boolean ans = false;
        if (other instanceof vehicle) {
            ans = (model.equals(((vehicle)other).model) && KM == ((vehicle)other).KM && speed_max == ((vehicle)other).speed_max && maximum_passengers == ((vehicle)other).maximum_passengers);
        }
        return ans;
    }

    @Override
    public String toString() {
        return "model:" + model + " traveled: " + KM + " Max speed of " + speed_max + " Mph , can carry max of " + maximum_passengers + " pepole ";
    }
    public String get_model(){
        /*
        return the model of vehicle
         */
        return model;
    }
    public double get_KM(){
         /*
        return the KM of vehicle
         */
        return  KM;
    }
    public long get_Speed_max(){
         /*
        return the Speed_max of vehicle
         */
        return speed_max;
    }
    public long get_Maximum_passengers(){
         /*
        return the Maximum_passengers of vehicle
         */
        return maximum_passengers;
    }
    public boolean set_model (String m){
        /*
        Updates the model variable of the object
        @param m the A string that you want to update to be the model of the object
        return true When the operation completes successfully
         */
        model = m;
        return true;
    }
    public boolean set_KM(double K){
          /*
        Updates the KM variable of the object
        @param KM the A double that you want to update to be the KM of the object
        return true When the operation completes successfully
         */
        KM = K;
        return true;
    }
    public boolean set_Speed_max(long s){
         /*
        Updates the speed_max variable of the object
        @param KM the A long that you want to update to be the Speed_max of the object
        return true When the operation completes successfully
         */
        speed_max = s;
        return true;
    }
    public boolean set_maximum_passengers(long max){
         /*
        Updates the maximum_passengers variable of the object
        @param KM the A long that you want to update to be the maximum_passengers of the object
        return true When the operation completes successfully
         */
        maximum_passengers = max;
        return true;
    }
}
