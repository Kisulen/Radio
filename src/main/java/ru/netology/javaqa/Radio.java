package ru.netology.javaqa;

public class Radio {
    private int numberOfStations = 10;
    private int maxStationNumber;
    private int minStationNumber = 0;
    private int currentStationNumber;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.maxStationNumber = numberOfStations -1;
        this.minStationNumber = minStationNumber;
    }

    public Radio () {
        this.numberOfStations = 10;
        this.maxStationNumber = 9;
        this.minStationNumber = 0;
    }

    public Radio (int maxVolume, int minVolume) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getStationNumber() {
        return currentStationNumber;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber < minStationNumber || newStationNumber > maxStationNumber) {
            return;
        }
        currentStationNumber = newStationNumber;
    }

    public int getMaxStationNumber () {
        return maxStationNumber;
    }

    public int getMinStationNumber () {
        return minStationNumber;
    }

    public void next() {
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber = currentStationNumber + 1;
        }
        if (currentStationNumber >= maxStationNumber) {
            currentStationNumber = minStationNumber;
        }
    }

    public void prev() {
        if (currentStationNumber > minStationNumber) {
            currentStationNumber = currentStationNumber - 1;
        }
        if (currentStationNumber <= minStationNumber) {
            currentStationNumber = maxStationNumber;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < minVolume) {
            newVolume = minVolume;
        }
        if (newVolume > maxVolume) {
            newVolume = maxVolume;
        }
        currentVolume = newVolume;
    }

    public int getMaxVolume () {
        return maxVolume;
    }
    public int getMinVolume () {
        return minVolume;
    }

    public void increaseVolume() {

        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {

        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }
}
