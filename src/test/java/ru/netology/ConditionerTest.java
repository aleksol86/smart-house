package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionTest {

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(15);
        condition.setCurrentTemperature(20);
        assertEquals(20, condition.getCurrentTemperature());
        condition.setIncreaseCurrentTemperature(21);
        assertEquals(21, condition.getIncreaseCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Condition condition = new Condition();
        condition.setMaxTemperature(30);
        condition.setMinTemperature(15);
        condition.setCurrentTemperature(20);
        assertEquals(20, condition.getCurrentTemperature());
        condition.setDecreaseCurrentTemperature(19);
        assertEquals(19, condition.getDecreaseCurrentTemperature());
    }
}
