package bridge;

public class TelevisionDevice extends EntertainmentDevice {

    public TelevisionDevice(int newDeviceState, int newMaxSetting) {
        setDeviceState(newDeviceState);
        setMaxSetting(newMaxSetting);
    }

    @Override
    public void buttonFivePressed() {
        System.out.println("Channel down");
        setDeviceState(getDeviceState() - 1);
    }

    @Override
    public void buttonSixPressed() {
        System.out.println("Channel up");
        setDeviceState(getDeviceState() + 1);
    }
}
