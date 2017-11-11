import java.util.Scanner;

public class Testing {

    public static void main(String[] args){

        // Create the factory object
        Factory shipFromFactory = new Factory();

        // Enemy ship object

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.print("What type of ship? Type:(UFO / Rocket / Boss)");

        if (userInput.hasNextLine()){

            String typeOfShip = userInput.nextLine();

            theEnemy = shipFromFactory.createEnemyShip(typeOfShip);

            if(theEnemy != null){

                doStuffEnemy(theEnemy);

            } else System.out.print("Please enter 'UFO' or 'Rocket' or 'Boss' next time");

        }


    }

    // Executes methods of the super class

    public static void doStuffEnemy(EnemyShip anEnemyShip){

        anEnemyShip.displayEnemyShip();

        anEnemyShip.followPlayerShip();

        anEnemyShip.enemyShipShoots();

    }

}