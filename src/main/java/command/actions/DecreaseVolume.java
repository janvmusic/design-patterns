package command.actions;

import command.device.ElectronicDevice;

public class DecreaseVolume implements ElectronicDeviceCommand {
    ElectronicDevice _currentDevice;

    public DecreaseVolume(ElectronicDevice currentDevice) {
        _currentDevice = currentDevice;
    }

    @Override
    public void execute() {
        _currentDevice.decreaseVolume();
    }
}
