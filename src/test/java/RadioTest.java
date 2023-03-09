import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioAboveStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioDownStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolume() {
        Radio volume = new Radio();

        volume.setCurrentRadioVolume(50);

        int expected = 50;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioAboveVolume() {
        Radio volume = new Radio();

        volume.setCurrentRadioVolume(101);

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioDownVolume() {
        Radio volume = new Radio();

        volume.setCurrentRadioVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioVolumeHigher() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(10);

        volume.increaseVolumeHigher();

        int expected = 11;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioVolumeDown() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(10);

        volume.increaseVolumeDown();

        int expected = 9;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationHigher() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.increaseStationHigher();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationDown() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.increaseStationDown();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioAboveVolumeHigher() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(100);

        volume.increaseVolumeHigher();

        int expected = 100;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioVolumeDown() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(-1);

        volume.increaseVolumeDown();

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioAboveStationHigher() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.increaseStationHigher();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStationDown() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);

        radio.increaseStationDown();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
