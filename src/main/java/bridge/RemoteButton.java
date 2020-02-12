package bridge;

public abstract class RemoteButton {
    private EntertainmentDevice _device;

    public RemoteButton(EntertainmentDevice device) {
        _device = device;
    }

    public void buttonFivePressed() {
        _device.buttonFivePressed();
    }

    public void buttonSixPressed() {
        _device.buttonSixPressed();
    }

    public void buttonEightPressed() {
        _device.buttonEightPressed();
    }

    public void buttonSevenPressed() {
        _device.buttonSevenPressed();
    }

    public EntertainmentDevice getDevice() {
        return _device;
    }

    public abstract void buttonNinePressed();


}
