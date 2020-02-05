import factory.BaseEnemyShip;
import factory.EnemyShipFactory;
import org.junit.Test;

public class FactoryPatternTest {

    @Test
    public void testFactoryPattern() {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        BaseEnemyShip enemyShip = enemyShipFactory.makeEnemyShip("UFO");
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShop();
        enemyShip.enemyShipAttack();
        System.out.println();

        enemyShip = enemyShipFactory.makeEnemyShip("Boss");
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShop();
        enemyShip.enemyShipAttack();
        System.out.println();

        enemyShip = enemyShipFactory.makeEnemyShip("Rocket");
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShop();
        enemyShip.enemyShipAttack();
        System.out.println();
    }
}
