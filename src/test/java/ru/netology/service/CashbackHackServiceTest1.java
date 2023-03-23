package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest1 {
    @Test
    public void test1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 990;
        int expected = 10;
        int actual = service.remain(990);
        assertEquals(expected, actual);

    }
}