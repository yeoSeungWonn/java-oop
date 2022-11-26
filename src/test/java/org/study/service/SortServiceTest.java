package org.study.service;

import org.junit.jupiter.api.Test;
import org.study.logic.BubbleSort;
import org.study.logic.JavaSort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sort = new SortService(new BubbleSort<String>());

    @Test
    void test() {
        List<String> strings = sort.doSort(List.of("3", "2", "1"));

        assertEquals(List.of("1", "2", "3"), strings);
    }

}
