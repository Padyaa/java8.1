package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldSetStationForTheLowerLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationForTheUpperLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setPreviousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.setNextStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetOverMaxLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetOverMinLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPreviousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.setNextVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPreviousVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.setPreviousVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetOverMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetOverMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setNextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setPreviousVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}




