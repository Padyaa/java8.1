package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldSetStationForTheLowerLimit() {
        Radio radio = new Radio();
        radio.setPreviousStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationForTheUpperLimit() {
        Radio radio = new Radio();
        radio.setNextStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setNextStation(5);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldSetPreviousStation() {
        Radio radio = new Radio();
        radio.setPreviousStation(5);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextVolume() {
        Radio radio = new Radio();
        radio.setRaiseTheVolume(3);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPreviousVolume() {
        Radio radio = new Radio();
        radio.setLowerTheVolume(5);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetOverMaxVolume() {
        Radio radio = new Radio();
        radio.setRaiseTheVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetUnderMinVolume() {
        Radio radio = new Radio();
        radio.setLowerTheVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolumeLimit() {
        Radio radio = new Radio();
        radio.setLowerTheVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolumeLimit() {
        Radio radio = new Radio();
        radio.setRaiseTheVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }
}