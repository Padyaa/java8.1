package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation(int currentStation) {
        if (currentStation > 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void setPreviousStation(int currentStation) {
        if (currentStation < 0) {
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setRaiseTheVolume(int currentVolume) {
        if (currentVolume >= 10) {
            this.currentVolume = 10;
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void setLowerTheVolume(int currentVolume) {
        if (currentVolume <= 0) {
            this.currentVolume = 0;
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}
