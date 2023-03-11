public class Radio {
    private int currentRadioStation;

    private int currentRadioVolume;

    private int quantityRadioStation = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
    }

    public Radio(int quantityRadioStation) {
        this.quantityRadioStation = quantityRadioStation;
    }

    public Radio() {

    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > quantityRadioStation - 1) {
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
        if (currentRadioStation < quantityRadioStation - 1) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == quantityRadioStation - 1) {
            currentRadioStation = 0;
        }
    }

    public void increaseStationDown() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = quantityRadioStation - 1;
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
