package command;

import command.device.ElectronicDevice;
import command.device.Radio;

public class RadioRemote {
    public static ElectronicDevice getDevice() {
        return new Radio();
    }
}
