package bridge;

public abstract class EntertainmentDevice {
    private int _deviceState;
    private int _maxSetting;
    private int _volumeLevel = 0;

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public void deviceFeedback() {
        if (_deviceState > _maxSetting || _deviceState < 0) {
            _deviceState = 0;
        }

        System.out.println("On: " + _deviceState);
    }

    public void buttonSevenPressed() {
        _volumeLevel++;
        System.out.println("Volume increased to: " + _volumeLevel);
    }

    public void buttonEightPressed() {
        _volumeLevel--;
        System.out.println("Volume decreased to: " + _volumeLevel);
    }

    public int getDeviceState() {
        return _deviceState;
    }

    public void setDeviceState(int deviceState) {
        _deviceState = deviceState;
    }

    public int getMaxSetting() {
        return _maxSetting;
    }

    public void setMaxSetting(int maxSetting) {
        _maxSetting = maxSetting;
    }

    public int getVolumeLevel() {
        return _volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        _volumeLevel = volumeLevel;
    }
}
