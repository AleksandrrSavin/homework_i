public class Radio {
    private int currentRadioStation;

    private int currentRadioVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }

        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume < 0) {
            return;
        }
        if (newCurrentRadioVolume > 100) {
            return;
        }

        currentRadioVolume = newCurrentRadioVolume;
    }

    public void increaseStationHigher() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        else if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void increaseStationDown() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void increaseVolumeHigher() {
        if (currentRadioVolume < 100) {
            currentRadioVolume = currentRadioVolume + 1;
        }
    }

    public void increaseVolumeDown() {
        if (currentRadioVolume > 0) {
            currentRadioVolume = currentRadioVolume - 1;
        }
    }
}
