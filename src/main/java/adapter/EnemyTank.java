package adapter;

public class EnemyTank implements EnemyAttacker {

    @Override
    public void fireAWeapon() {
        int attackDamage = 10;
        System.out.println("Enemy tank will fire his weapon and do: " + attackDamage + " damage");
    }

    @Override
    public void driveForward() {
        int movement = 5;
        System.out.println("Enemy tank moves " + movement + " spaces");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }
}
