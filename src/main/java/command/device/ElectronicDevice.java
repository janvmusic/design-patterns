package command.device;

public interface ElectronicDevice {

    void turnOn();

    void turnOff();

    void increaseVolume();

    void decreaseVolume();

    String isOn();

    int currentVolume();
}
