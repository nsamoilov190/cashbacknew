
package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    @Test
    public void test1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 990;
        int expected = 10;
        int actual = service.remain(990);
        assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);

    }

    @Test
    public void test3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 0;
        int actual = service.remain(1100);
        assertEquals(expected, actual);


    }
}
