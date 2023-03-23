package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CashbackHackServiceTest {
    @Test

    public void test1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 990;
        int expected = 10;
        int actual = service.remain(990);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }

    @Test

    public void test3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 0;
        int actual = service.remain(1500);
        Assert.assertEquals(actual, expected);
    }




}
