import vehicles.*;
//neria atias 316118728
//nativ levi 209150879

import java.util.Scanner;

public class Main {
    public static vehicle insert() {
        /*
        The function creates an object vehicle
        return The object that the function created

        */
        Scanner sc = new Scanner(System.in);
        vehicle ob = null;
        System.out.println("Please enter object you want :\n 1-Jeep \n 2- Frigata \n 3- Spy Gilder \n 4- Game Gilder");
        int number = sc.nextInt();
        if (number == 1) {
            System.out.println("Please enter thr model of jeep");
            String model = sc.next();
            System.out.println("Please type the maximum speed of the jeep");
            long speed_max = sc.nextLong();
            System.out.println("Please type the average Fuel Consumption of the jeep");
            double averageFuelConsumption = sc.nextDouble();
            System.out.println("Please type the average Engine Life time of the jeep");
            double averageEngineLifetime = sc.nextDouble();
            ob = new Jeep(model, speed_max, averageFuelConsumption, averageEngineLifetime);
        }
        if (number == 2) {
            System.out.println("Please enter thr model of Frigate");
            String model = sc.next();
            System.out.println("Please type the maximum speed of the Frigate");
            long speed_max = sc.nextLong();
            System.out.println("Please type the maximum passengers of the Frigate");
            long maximum_passengers = sc.nextLong();
            System.out.println("Please type true if the Frigate is with the wind");
            boolean with_the_wind = sc.nextBoolean();
            ob = new Frigate(model, speed_max, maximum_passengers, with_the_wind);
        }
        if (number == 3) {
            System.out.println("Please enter thr Source Power of Spy Gilder");
            String Source_Power = sc.next();
            ob = new SpyGlider(Source_Power);
        }
        if (number == 4) {
            ob = new GameGlider();
        }
        return ob;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter how many objects you want to create");
        int object_size = sc.nextInt();
        vehicle[] objectArray = new vehicle[object_size];
        for (int i = 0; i < object_size; i++) {
            objectArray[i] = insert();
        }
        int count = 1;
        while (count == 1)
        {
            System.out.println("\t*****Welcome to the car dealership****\n 1-buy a car \n 2-Take a car for a test drive \n 3-Resetting the distance traveled by the vehicles \n 4-Changing the vessel's flag \n 5-exit \n");
            int num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("These are the vehicles we have at the dealership: \n");
                    for (int i = 0; i < object_size; i++) {
                        if(objectArray[i] == null){
                            continue;
                        }
                        System.out.println(objectArray[i].toString());
                    }
                    vehicle obj = insert();
                    for (int i = 0; i < object_size; i++) {
                        if(objectArray[i] == null){
                            continue;
                        }
                        if(objectArray[i].equals(obj) == true) {
                            System.out.println("The operation was successful");
                            objectArray[i] = null;
                            break;
                        }
                        if ( i == object_size - 1 ){
                            System.out.println("The operation failed, the vehicle does not exist in the system");
                        }
                    }
                    break;
                case 2:
                    vehicle ob = insert();
                    for (int i = 0; i < object_size; i++) {
                        if(objectArray[i] == null){
                            continue;
                        }
                        if(objectArray[i].equals(ob) == true) {
                            System.out.println("The vehicle was found, how far did you drive it?");
                            double KM_in_test = sc.nextDouble();
                            objectArray[i].movement(KM_in_test);
                            System.out.println(objectArray[i].toString());
                            break;
                        }
                        if ( i == object_size - 1 ){
                            System.out.println("The operation failed, the vehicle does not exist in the system");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < object_size; i++) {
                        if(objectArray[i] == null){
                            continue;
                        }
                        objectArray[i].set_KM(0);
                    }
                    break;
                case 4:
                    System.out.println("Please enter the name of the country");
                    for (int i = 0; i < object_size; i++) {
                        if(objectArray[i] == null){
                            continue;
                        }
                        if(objectArray[i] instanceof WaterVehicle) {
                            String flag = sc.next();
                            ((WaterVehicle) objectArray[i]).set_flag(flag);
                        }
                    }
                    break;
                case 5:
                    count = 2;
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }
    }
}







