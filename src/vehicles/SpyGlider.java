package vehicles;

public class SpyGlider extends AirVehicle implements NonMotorized{
    private String Source_Power;
    private String Energy_score;
    public SpyGlider( String Source_Power){
        super("privileged", 50,1,"Army");
        Energy_score = "C";
        this.Source_Power = Source_Power;
    }
    public String get_Source_Power(){
        /*
        return the Source_Power of SpyGlider
         */
        return Source_Power;
    }
    public String get_Energy_score(){
        /*
        return the Energy_score of SpyGlider
         */
        return Energy_score;
    }
    public boolean equals(Object other) {
        /*
        The function compares two objects to see if they are equal
        @param other The object you want to compare
        return True if the objects are equal and false if not
         */
        boolean ans = false;
        if (other instanceof SpyGlider) {
            ans = super.equals(other) && Source_Power.equals(((SpyGlider) other).Source_Power) && Energy_score.equals(((SpyGlider) other).Energy_score);
        }
        return ans;
    }

    @Override
    public String toString() {
         /*
        A string representation of the object
         */
        return " Spy Glider :" + super.toString() + " source power: " + Source_Power + "energy score " + Energy_score;
    }
}
