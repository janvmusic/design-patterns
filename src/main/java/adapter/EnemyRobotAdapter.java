package adapter;

public class EnemyRobotAdapter implements EnemyAttacker {
    EnemyRobot _attacker;


    public EnemyRobotAdapter(EnemyRobot attacker) {
        _attacker = attacker;
    }

    @Override
    public void fireAWeapon() {
        _attacker.smashAttack();
    }

    @Override
    public void driveForward() {
        _attacker.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        _attacker.reactToHuman(driverName);
    }
}
