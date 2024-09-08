package com.example;

import com.example.solution.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    // Testcase mapping:
    //    '#' -> ocean
    //    '.' -> island (no castaway)
    //    '*' -> island (with castaway)
    @Test
    void test1() {
        assertEquals(3, solution.solution(new String[] {".*#..*", ".*#*.#", "######", ".*..#.", "...###"}));
    }

    @Test
    void test2() {
        assertEquals(2, solution.solution(new String[] {"*#..", "#..#", ".##.", "...*"}));
    }

    @Test
    void test3() {
        assertEquals(5, solution.solution(new String[] {"**###**", "*#*#*#*", "##*#*##", "*#***#*", ".#####.", "..*#*.."}));
    }

    @Test
    void test4() {
        assertEquals(1, solution.solution(new String[] {"#.*.#", "..###", "#*#..", "###.#"}));
    }

    @Test
    void test5() {
        assertEquals(2, solution.solution(new String[] {"#.*.#", "..###", "#.#..", "###*#"}));
    }

    @Test
    void test6() {
        assertEquals(2, solution.solution(new String[] {"#.*.#..", ".*###..", "#.#..#.", "###*###", "##*.###"}));
    }
}