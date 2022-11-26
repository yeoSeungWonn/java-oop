package org.study.logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    void given_List_whenExecution_ThenReturnSortedList() {
        JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> integerList = javaSort.sort(List.of(3, 2, 4, 5, 1));

        assertEquals(List.of(1, 2, 3, 4, 5), integerList);
    }

}