package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;
import ru.netology.service.CashbackHackService;

class CashbackHackServiceTest {

    @Test
    void shouldBoundaryLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    void shouldBoundary1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

    @Test
    void shouldBoundaryAbove1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);

    }
}