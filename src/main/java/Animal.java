import fly.Fly;

public class Animal {
    private String _name;
    private double _height;
    private int _weight;
    private String _favFood;
    private double _speed;
    private String _sound;

    private Fly _flyingType; // composition

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public double getHeight() {
        return _height;
    }

    public void setHeight(double newHeight) {
        if (newHeight <= 0) {
            System.out.println("Weight needs to be greater than 0");
            return;
        }
        _height = newHeight;
    }

    public int getWeight() {
        return _weight;
    }

    public void setWeight(int newWeight) {
        if (newWeight <= 0) {
            System.out.println("Weight needs to be greater than 0");
            return;
        }
        _weight = newWeight;
    }

    public String getSound() {
        return _sound;
    }

    public void setSound(String newSound) {
        _sound = newSound;
    }

    public String getFavFood() {
        return _favFood;
    }

    public void setFavFood(String newFavFood) {
        _favFood = newFavFood;
    }

    public double getSpeed() {
        return _speed;
    }

    public void setSpeed(double newSpeed) {
        _speed = newSpeed;
    }

    public Fly getFlyingType() {
        return _flyingType;
    }

    public void setFlyingType(Fly flyingType) {
        _flyingType = flyingType;
    }

    public String tryToFly() {
        return _flyingType.fly();
    }
}
