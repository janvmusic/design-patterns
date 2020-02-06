package command.actions;

import command.device.ElectronicDevice;

public class TurnOn implements ElectronicDeviceCommand {
    ElectronicDevice _currentDevice;

    public TurnOn(ElectronicDevice currentDevice) {
        _currentDevice = currentDevice;
    }

    @Override
    public void execute() {
        _currentDevice.turnOn();
    }
}
