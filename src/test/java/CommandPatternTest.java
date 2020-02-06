import command.RadioRemote;
import command.TvRemote;
import command.device.ElectronicDevice;
import command.device.Radio;
import command.device.Television;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommandPatternTest {
    @Test
    public void defaultTelevisionStateTest() {
        ElectronicDevice television = TvRemote.getDevice();
        assertDefaultDeviceState(television, "TV is off");
    }

    @Test
    public void televisionIncreaseVolumeTest() {
        ElectronicDevice television = TvRemote.getDevice();
        assertDefaultDeviceState(television, "TV is off");

        television.increaseVolume();
        assertThat("Does nothing when television if off", television.currentVolume(), is(0));

        television.turnOn();
        television.increaseVolume();
        assertThat("Should increase the volume by 1", television.currentVolume(), is(1));

        television.increaseVolume();
        assertThat("Should increase the volume by 1", television.currentVolume(), is(2));

        television.turnOff();
        television.increaseVolume();
        assertThat("Does nothing when television if off and maintains current volume", television.currentVolume(), is(2));
    }

    @Test
    public void televisionDecreaseVolumeTest() {
        ElectronicDevice television = TvRemote.getDevice();
        assertDefaultDeviceState(television, "TV is off");

        television.increaseVolume();
        assertThat("Does nothing when television if off", television.currentVolume(), is(0));

        television.turnOn();
        television.increaseVolume();
        assertThat("Should increase the volume by 1", television.currentVolume(), is(1));

        television.increaseVolume();
        assertThat("Should increase the volume by 1", television.currentVolume(), is(2));

        television.decreaseVolume();
        assertThat("Should decrease the volume by 1", television.currentVolume(), is(1));

        television.turnOff();
        television.increaseVolume();
        assertThat("Does nothing when television if off and maintains current volume", television.currentVolume(), is(1));
    }

    @Test
    public void increaseMaxTelevisionVolumeTest() {
        ElectronicDevice television = TvRemote.getDevice();
        assertDefaultDeviceState(television, "TV is off");

        television.increaseVolume();
        assertThat("Does nothing when television if off", television.currentVolume(), is(0));

        television.turnOn();
        for (int i = 0; i < 10; i++) {
            television.increaseVolume();
        }

        assertThat("Validate that current volume is 10", television.currentVolume(), is(10));
        television.increaseVolume();
        assertThat("Validate that current is at max which is 10", television.currentVolume(), is(10));

    }

    @Test
    public void decreaseMinTelevisionVolumeTest() {
        ElectronicDevice television = TvRemote.getDevice();
        assertDefaultDeviceState(television, "TV is off");

        television.increaseVolume();
        assertThat("Does nothing when television if off", television.currentVolume(), is(0));

        television.turnOn();
        television.decreaseVolume();
        assertThat("Validate that current volume is 10", television.currentVolume(), is(0));
    }

    @Test
    public void turnOnAndOffTelevisionTest() {
        ElectronicDevice television = TvRemote.getDevice();
        assertDefaultDeviceState(television, "TV is off");

        television.turnOn();
        assertThat("Television should be on", television.isOn(), is("TV is on"));

        television.turnOff();
        assertThat("Television should be off", television.isOn(), is("TV is off"));
    }

    @Test
    public void changeTelevisionChannelTest() {
        Television television = (Television) TvRemote.getDevice();
        assertDefaultDeviceState(television, "TV is off");
        assertThat("Initial channel should be 0", television.getCurrentChannel(), is(0));

        television.turnOn();
        television.changeChannel(5);
        assertThat("New channel should be 5", television.getCurrentChannel(), is(5));

        television.turnOff();
        television.changeChannel(7);
        assertThat("When television is off, should keep current channel", television.getCurrentChannel(), is(5));
    }

    @Test
    public void defaultRadioStateTest() {
        ElectronicDevice radio = RadioRemote.getDevice();
        assertDefaultDeviceState(radio, "Radio is off");
    }

    @Test
    public void radioIncreaseVolumeTest() {
        ElectronicDevice radio = RadioRemote.getDevice();
        assertDefaultDeviceState(radio, "Radio is off");

        radio.increaseVolume();
        assertThat("when radio if off increase volume", radio.currentVolume(), is(1));

        radio.turnOn();
        radio.increaseVolume();
        assertThat("Should increase the volume by 1", radio.currentVolume(), is(2));

        radio.increaseVolume();
        assertThat("Should increase the volume by 1", radio.currentVolume(), is(3));

        radio.turnOff();
        radio.increaseVolume();
        assertThat("Increases volume when radio if off", radio.currentVolume(), is(4));
    }

    @Test
    public void radioDecreaseVolumeTest() {
        ElectronicDevice radio = RadioRemote.getDevice();
        assertDefaultDeviceState(radio, "Radio is off");

        radio.increaseVolume();
        assertThat("when radio if off increase volume", radio.currentVolume(), is(1));

        radio.turnOn();
        radio.increaseVolume();
        assertThat("Should increase the volume by 1", radio.currentVolume(), is(2));

        radio.increaseVolume();
        assertThat("Should increase the volume by 1", radio.currentVolume(), is(3));

        radio.decreaseVolume();
        assertThat("Should decrease the volume by 1", radio.currentVolume(), is(2));

        radio.turnOff();
        radio.decreaseVolume();
        assertThat("Decreases volume when radio if off", radio.currentVolume(), is(1));
    }

    @Test
    public void increaseMaxRadioVolumeTest() {
        ElectronicDevice radio = RadioRemote.getDevice();
        assertDefaultDeviceState(radio, "Radio is off");

        radio.increaseVolume();
        assertThat("when radio if off increase volume", radio.currentVolume(), is(1));

        radio.turnOn();
        for (int i = 0; i < 5; i++) {
            radio.increaseVolume();
        }

        assertThat("Validate that current volume is 10", radio.currentVolume(), is(5));
        radio.increaseVolume();
        assertThat("Validate that current is at max which is 10", radio.currentVolume(), is(5));

    }

    @Test
    public void decreaseMinRadioVolumeTest() {
        ElectronicDevice radio = RadioRemote.getDevice();
        assertDefaultDeviceState(radio, "Radio is off");

        radio.increaseVolume();
        assertThat("when radio if off increase volume", radio.currentVolume(), is(1));

        radio.turnOn();
        radio.decreaseVolume();
        assertThat("Validate that current volume is 10", radio.currentVolume(), is(0));
    }

    @Test
    public void turnOnAndOffRadioTest() {
        ElectronicDevice radio = RadioRemote.getDevice();
        assertDefaultDeviceState(radio, "Radio is off");

        radio.turnOn();
        assertThat("Radio should be on", radio.isOn(), is("Radio is on"));

        radio.turnOff();
        assertThat("Radio should be off", radio.isOn(), is("Radio is off"));
    }

    @Test
    public void changeRadioChannelTest() {
        Radio radio = (Radio) RadioRemote.getDevice();
        assertDefaultDeviceState(radio, "Radio is off");
        assertThat("Initial channel should be 0", radio.getCurrentStation(), is(0.0));

        radio.turnOn();
        radio.changeStation(94.9);
        assertThat("New channel should be 94.9", radio.getCurrentStation(), is(94.9));

        radio.turnOff();
        radio.changeStation(99.7);
        assertThat("When radio is off, should change current channel", radio.getCurrentStation(), is(99.7));
    }

    private void assertDefaultDeviceState(ElectronicDevice electronicDevice, String expectedState) {
        assertThat("Initial state should be off", electronicDevice.isOn(), is(expectedState));
        assertThat("Initial volume should be 0", electronicDevice.currentVolume(), is(0));
    }
}
