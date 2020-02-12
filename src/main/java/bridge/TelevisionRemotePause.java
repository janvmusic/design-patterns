package bridge;

public class TelevisionRemotePause extends RemoteButton {

    public TelevisionRemotePause(EntertainmentDevice device) {
        super(device);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("DVD was paused");
    }


}
