package com.hillel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataArrayTest {

    int maxSize = 10;
    //  int maxSize2 = 15;

    DataArray array = new DataArray(maxSize);
    DataArray array1 = new DataArray(maxSize);

    @Test
    void add() {
        assertTrue(array.add("111"));
        assertEquals(1, array.size());
    }

    @Test
    void testAdd() {
        assertTrue(array.add(2, "222"));
        assertEquals(1, array.size());
    }

    @Test
    void delete() {
        array.add("555");
        assertTrue(array.delete("555"));
        assertEquals(0, array.size());
    }

    @Test
    void get() {
        array.add(1, "999");
        assertEquals("999", array.get(1));
    }

    @Test
    void contain() {
        array.add("YYY");
        assertTrue(array.contain("YYY"));
    }

    @Test
    void testEquals() {
        assertTrue(array.equals(array1));
    }

    @Test
    void clear() {
        array.add("PPP");
        array.clear();
        assertEquals(0, array.size());
    }

    @Test
    void size() {
        array.add("mmm");
        array.add("mmm");
        array.add("mmm");
        array.add("mmm");
        array.delete("mmm");
        array.delete("mmm");
        assertEquals(2, array.size());
    }
}