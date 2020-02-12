package bridge;

public class TelevisionRemoteMute extends RemoteButton {

    public TelevisionRemoteMute(EntertainmentDevice device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        getDevice().setVolumeLevel(0);
    }


}
