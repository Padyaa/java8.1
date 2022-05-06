package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = calculateMaxStation();
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberStation = 10;

    private int calculateMaxStation() {
        return numberStation - 1;
    }


    public Radio() {
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getMaxStation() {
        return calculateMaxStation();
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = minStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setPreviousStation() {
        this.currentStation = currentStation - 1;
        if (currentStation < minStation) {
            this.currentStation = maxStation;
        }
    }

    public void setNextStation() {
        this.currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        }
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setPreviousVolume() {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        }
    }

    public void setNextVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
    }
}
