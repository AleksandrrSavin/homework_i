public class Radio {
    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
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
    public void increaseStationHigher() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void increaseStationDown() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int currentRadioVolume;

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
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
