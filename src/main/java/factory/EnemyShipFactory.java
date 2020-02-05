package factory;

public class EnemyShipFactory {

    public BaseEnemyShip makeEnemyShip(String enemyType) {
        switch (enemyType) {
            case "Rocket":
                return new RocketEnemyShip();
            case "Boss":
            case "Big UFO":
                return new BigUfoEnemyShip();
            case "UFO":
            default:
                return new UfoEnemyShip();
        }
    }
}
