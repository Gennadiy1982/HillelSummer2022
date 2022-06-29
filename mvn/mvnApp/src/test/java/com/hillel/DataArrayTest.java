package com.hillel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataArrayTest {

    int maxSize = 10;
    //  int maxSize2 = 15;

    @Test
    void add() {
        DataArray array = new DataArray(maxSize);
        assertTrue(array.add("111"));
        assertEquals(1, array.size());
    }

    @Test
    void testAdd() {
        DataArray array = new DataArray(maxSize);
        assertTrue(array.add(2, "222"));
        assertEquals(1, array.size());
    }

    @Test
    void delete() {
        DataArray array = new DataArray(maxSize);
        array.add("555");
        assertTrue(array.delete("555"));
        assertEquals(0, array.size());
    }

    @Test
    void get() {
        DataArray array = new DataArray(maxSize);
        array.add(1, "999");
        assertEquals("999", array.get(1));
    }

    @Test
    void contain() {
        DataArray array = new DataArray(maxSize);
        array.add("YYY");
        assertTrue(array.contain("YYY"));
    }

    @Test
    void testEquals() {
        DataArray array = new DataArray(maxSize);
        array.add("1");
        array.add("2");
        array.add("3");
        array.add("4");
        DataArray array2 = new DataArray(maxSize);
        array2.add("1");
        array2.add("2");
        array2.add("3");
        array2.add("4");
        assertTrue(array.equals(array2));
    }

    @Test
    void clear() {
        DataArray array = new DataArray(maxSize);
        array.add("PPP");
        array.clear();
        assertEquals(0, array.size());
    }

    @Test
    void size() {
        DataArray array = new DataArray(maxSize);
        array.add("mmm");
        array.add("mmm");
        array.add("mmm");
        array.add("mmm");
        array.delete("mmm");
        array.delete("mmm");
        assertEquals(2, array.size());
    }
}