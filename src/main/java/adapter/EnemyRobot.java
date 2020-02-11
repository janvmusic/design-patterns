package adapter;

public class EnemyRobot {

    public void smashAttack() {
        int attackDamage = 7;
        System.out.println("Robot attacks and does: " + attackDamage + " damage");
    }

    public void walkForward() {
        int steps = 8;
        System.out.println("Robot moves " + steps + " steps");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Robot's cannot be driven by humans!");
    }
}
