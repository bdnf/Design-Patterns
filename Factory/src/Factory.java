// This is a factory that is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications

public class Factory{

    // This could be used as a static method if we
    // are willing to give up subclassing it

    public EnemyShip createEnemyShip(String newShipType){

        EnemyShip newShip = null;

        if (newShipType.equals("UFO")){

            return new UFOEnemyShip();

        } else

        if (newShipType.equals("Rocket")){

            return new RocketEnemyShip();

        } else

        if (newShipType.equals("Boss")){

            return new BossUFOEnemyShip();

        } else return null;

    }

}