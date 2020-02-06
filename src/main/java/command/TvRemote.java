package command;

import command.device.ElectronicDevice;
import command.device.Television;

public class TvRemote {
    public static ElectronicDevice getDevice() {
        return new Television();
    }
}
