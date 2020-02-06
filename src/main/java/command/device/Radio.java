package command.device;

public class Radio implements ElectronicDevice {

    int _volume = 0;
    boolean _isOn = false;
    double _currentStation = 0.0;

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
        if (_volume < 5) {
            _volume++;
        }
    }

    @Override
    public void decreaseVolume() {
        if (_volume > 0) {
            _volume--;
        }
    }

    @Override
    public String isOn() {
        return _isOn ? "Radio is on" : "Radio is off";
    }

    @Override
    public int currentVolume() {
        return _volume;
    }

    public void changeStation(double station) {
        if (station > 0 && station <= 100.0) {
            _currentStation = station;
        }
    }

    public double getCurrentStation() {
        return _currentStation;
    }
}
