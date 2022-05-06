package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStationForTheUpperLimit() {
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldInitMaxStation() {
        assertEquals(9,radio.getMaxStation());
    }

    @Test
    public void shouldSetNextVolume() {
        radio.setCurrentVolume(3);
        radio.setNextVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPreviousVolume() {
        radio.setCurrentVolume(3);
        radio.setPreviousVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetOverMinVolume() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetOverMaxVolume() {
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetStationForTheLowerLimit() {
        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldSetPreviousStation() {
        radio.setCurrentStation(9);
        radio.setPreviousStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        radio.setCurrentStation(8);
        radio.setNextStation();
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldSetOverMinLimitStation() {
        radio.setCurrentStation(0);
        radio.setPreviousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMaxStation() {
        radio.setCurrentStation(8);
        radio.setNextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetMinStation() {
        radio.setCurrentStation(1);
        radio.setPreviousStation();
        assertEquals(0, radio.getCurrentStation());
    }
}




