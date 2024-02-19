package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Car car = null;
        Plane plane = null;
        Ship ship = null;
      
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        
       
      


        while(!exit)    {

            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");


            if(sc.hasNext())    {

                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {

                    case 1:

                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");

                        String vehicleTypeString = sc.nextLine();
                        int vehicleType = Integer.parseInt(vehicleTypeString);
                    
                        System.out.println("Anna kulkuneuvon valmistaja:");
                        String manufacturer = sc.nextLine();
                        System.out.println("Anna kulkuneuvon malli:");
                        String model = sc.nextLine();
                        System.out.println("Anna kulkuneuvon huippunopeus:");
                        String maxSpeedString = sc.nextLine();
                        int maxSpeed = Integer.parseInt(maxSpeedString);


                        if (vehicleType == 1) {
                        vehicles.add(new Car(manufacturer, model, maxSpeed));
                        } else if (vehicleType == 2) {
                        vehicles.add(new Plane(manufacturer, model, maxSpeed));
                        } else if (vehicleType == 3) {
                        vehicles.add(new Ship(manufacturer, model, maxSpeed));
                        }
                        


                        break;

                    case 2:

                        for (Vehicle vehicle : vehicles) {
                            System.out.println(vehicle);
                            System.out.println();
                    }
                        break;


                    case 0:

                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;


                        break;

                
                    default:

                        System.out.println("Syöte oli väärä");
                        break;
                }







            }

        }

        sc.close();

        

    }
}
