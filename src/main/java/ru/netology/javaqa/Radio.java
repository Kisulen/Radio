package ru.netology.javaqa;

public class Radio {
    public int currentStationNumber;
    public int currentVolume;

    public int getStationNumber() {
        return currentStationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < 0 || newStationNumber > 9) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public void next() {
        if (currentStationNumber < 9) {
            currentStationNumber = currentStationNumber + 1;
        }
        if (currentStationNumber >= 9) {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber > 0) {
            currentStationNumber = currentStationNumber - 1;
        }
        if (currentStationNumber <= 0) {
            currentStationNumber = 9;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0 || newVolume > 10) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }
}
