package ru.netology.service;

import static org.testng.AssertJUnit.*;
import org.testng.annotations.Test;


class CashbackHackServiceTest {

    @Test
    void boundaryLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }

    @Test
    void boundary1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void boundaryAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);

    }
}