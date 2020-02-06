package command.actions;

import command.device.ElectronicDevice;

public class IncreaseVolume implements ElectronicDeviceCommand {
    ElectronicDevice _currentDevice;

    public IncreaseVolume(ElectronicDevice currentDevice) {
        _currentDevice = currentDevice;
    }

    @Override
    public void execute() {
        _currentDevice.increaseVolume();
    }
}
