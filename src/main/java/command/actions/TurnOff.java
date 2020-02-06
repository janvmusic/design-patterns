package command.actions;

import command.device.ElectronicDevice;

public class TurnOff implements ElectronicDeviceCommand {
    ElectronicDevice _currentDevice;

    public TurnOff(ElectronicDevice currentDevice) {
        _currentDevice = currentDevice;
    }

    @Override
    public void execute() {
        _currentDevice.turnOff();
    }
}
