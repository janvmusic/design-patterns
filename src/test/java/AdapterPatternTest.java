import adapter.EnemyAttacker;
import adapter.EnemyRobot;
import adapter.EnemyRobotAdapter;
import adapter.EnemyTank;
import org.junit.Test;

public class AdapterPatternTest {

    @Test
    public void adapterPatternTest() {
        EnemyRobot enemyRobot = new EnemyRobot();
        EnemyAttacker attacker = new EnemyRobotAdapter(enemyRobot);
        attacker.assignDriver("Jorge");
        attacker.driveForward();
        attacker.fireAWeapon();

        EnemyAttacker attacker2 = new EnemyTank();
        attacker2.assignDriver("Jorge");
        attacker2.driveForward();
        attacker2.fireAWeapon();
    }
}
