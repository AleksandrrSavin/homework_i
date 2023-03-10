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

    public void increaseStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void decreaseStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentRadioVolume < 100) {
            currentRadioVolume = currentRadioVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentRadioVolume > 0) {
            currentRadioVolume = currentRadioVolume - 1;
        }
    }
}
