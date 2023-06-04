package vehicles;

import vehicles.*;

public class GameGlider extends AirVehicle implements NonMotorized{
    private String Source_Power;
    private String Energy_score;
    public GameGlider(){
        super("toy" , 10 ,0 , "Civil" );
        Energy_score = "A";
        Source_Power = "manual";
    }
    public String get_Source_Power(){
        /*
        return the Source_Power of WaterVehicle
         */
        return Source_Power;
    }
    public String get_Energy_score(){
        /*
        return the Source_Power of WaterVehicle
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
        if (other instanceof GameGlider) {
            ans = super.equals(other) && Source_Power.equals(((GameGlider) other).Source_Power) && Energy_score.equals(((GameGlider) other).Energy_score);
        }
        return ans;
    }

    @Override
    public String toString() {
         /*
        A string representation of the object
         */
        return "Game Glider :" + super.toString() + " source power: " + Source_Power + " energy score: " + Energy_score;
    }
}