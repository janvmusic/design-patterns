import bridge.RemoteButton;
import bridge.TelevisionDevice;
import bridge.TelevisionRemoteMute;
import bridge.TelevisionRemotePause;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class BridgePatternTest {

    @Test
    public void bridgePatterTest() {
        TelevisionDevice televisionDevice = new TelevisionDevice(1, 200);
        TelevisionDevice televisionDevice2 = new TelevisionDevice(1, 200);

        RemoteButton television = new TelevisionRemoteMute(televisionDevice);

        television.buttonFivePressed();
        assertThat(television.getDevice().getDeviceState(), is(0));

        television.buttonSixPressed();
        assertThat(television.getDevice().getDeviceState(), is(1));

        television.buttonSevenPressed();
        assertThat(television.getDevice().getVolumeLevel(), is(1));

        television.buttonSevenPressed();
        assertThat(television.getDevice().getVolumeLevel(), is(2));

        television.buttonSevenPressed();
        assertThat(television.getDevice().getVolumeLevel(), is(3));

        television.buttonSevenPressed();
        assertThat(television.getDevice().getVolumeLevel(), is(4));

        television.buttonNinePressed();
        assertThat(television.getDevice().getVolumeLevel(), is(0));
    }
}
