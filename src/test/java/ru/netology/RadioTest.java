package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetNumberStation() {
        radio.setNumberStation(9);

        assertEquals(9, radio.getNumberStation());
    }

    @Test
    public void shouldSetNumberStationUnderMin() {
        radio.setNumberStation(-1);

        assertEquals(10, radio.getNumberStation());
    }

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(9);

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        radio.setCurrentStation(-4);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationOverMax() {
        radio.setCurrentStation(13);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetVolumeUnderMinimum() {
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeOverMaximum() {
        radio.setCurrentVolume(105);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume0() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseStation() {
        radio.setCurrentStation(8);
        radio.increaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation0() {
        radio.setCurrentStation(9);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        radio.setCurrentStation(1);
        radio.decreaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationWhenCurrent0() {
        radio.decreaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNumberStation20() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);

        assertEquals(19, radio.getCurrentStation());
    }


    @Test
    public void shouldSetStationOverMax20() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation20() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(8);
        radio.increaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStationOverMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation20() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(1);
        radio.decreaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationWhenCurrent20() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        radio.decreaseStation();

        assertEquals(19, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolumeUnderMinimum20() {
        Radio radio = new Radio(20);
        radio.setCurrentVolume(-1);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeOverMaximum20() {
        Radio radio = new Radio(20);
        radio.setCurrentVolume(100);

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume20() {
        Radio radio = new Radio(20);
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseMaxVolume20() {
        Radio radio = new Radio(20);
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseMinVolume20() {
        Radio radio = new Radio(20);
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseUnderMinVolume20() {
        Radio radio = new Radio(20);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
}


