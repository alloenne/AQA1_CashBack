package ru.netology.service;

import static org.junit.Assert.*;

public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();
    @org.junit.Test
    public void shouldCalculateLessBoundary() {
        int actual = service.remain(750);
        int expected = 250;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateMoreBoundary() {
        int actual = service.remain(1650);
        int expected = 350;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateEqualsBoundary() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculate0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculate1() {
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculate999() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

}