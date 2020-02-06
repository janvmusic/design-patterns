package command;

import command.actions.ElectronicDeviceCommand;

public class DeviceButton {
    ElectronicDeviceCommand _action;

    public DeviceButton(ElectronicDeviceCommand action) {
        _action = action;
    }

    public void press() {
        _action.execute();
    }
}
