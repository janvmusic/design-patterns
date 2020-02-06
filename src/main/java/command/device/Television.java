package command.device;

public class Television implements ElectronicDevice {

    int _volume = 0;
    int _currentChannel = 0;
    boolean _isOn = false;

    @Override
    public void turnOn() {
        _isOn = true;
    }

    @Override
    public void turnOff() {
        _isOn = false;
    }

    @Override
    public void increaseVolume() {
        if (_isOn && _volume < 10) {
            _volume++;
        }
    }

    @Override
    public void decreaseVolume() {
        if (_isOn && _volume > 0) {
            _volume--;
        }
    }

    @Override
    public int currentVolume() {
        return _volume;
    }

    @Override
    public String isOn() {
        return _isOn ? "TV is on" : "TV is off";
    }

    public void changeChannel(int channel) {
        if (_isOn && channel > 0 && channel <= 10) {
            _currentChannel = channel;
        }
    }

    public int getCurrentChannel() {
        return _currentChannel;
    }
}
