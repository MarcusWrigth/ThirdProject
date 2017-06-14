package com.omsu.imit.thirdtask.balbenko;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {
    @Test
    public void humanTest() throws Exception {
        Human andrew = new Human("Andrew","Balbenko","Nikolaevich", "18");
        assertEquals("Andrew", andrew.getName());
        assertEquals("Balbenko", andrew.getSurname());
        assertEquals("Nikolaevich", andrew.getMiddleName());
        assertEquals("18", andrew.getYear());
    }

}