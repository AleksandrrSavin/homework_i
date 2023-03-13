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

        volume.increaseVolume();

        int expected = 11;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioVolumeDown() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(10);

        volume.decreaseVolume();

        int expected = 9;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.increaseStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);

        radio.decreaseStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioAboveVolumeHigher() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioVolumeDown() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(-1);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationHigher() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.increaseStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationLast() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceRadioStationFromZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.decreaseStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}

