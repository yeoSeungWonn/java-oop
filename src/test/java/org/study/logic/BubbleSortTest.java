package org.study.logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void given_List_whenExecution_ThenReturnSortedList() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> integerList = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        assertEquals(List.of(1, 2, 3, 4, 5), integerList);
    }

}