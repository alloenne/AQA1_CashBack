package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();

    @Test
    public void shouldCalculateLessBoundary() {
        int actual = service.remain(750);
        int expected = 250;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateMoreBoundary() {
        int actual = service.remain(1650);
        int expected = 350;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateEqualsBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }


    @Test
    public void shouldCalculate0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculate999() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculate1() {
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

}