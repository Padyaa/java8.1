package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            this.currentStation = 9;
            return;
        }
        if (currentStation > 9) {
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 10) {
            this.currentVolume = 10;
            return;
        }
        if (currentVolume <= 0) {
            this.currentVolume = 0;
            return;
        }
            this.currentVolume = currentVolume + 1;
    }
}
