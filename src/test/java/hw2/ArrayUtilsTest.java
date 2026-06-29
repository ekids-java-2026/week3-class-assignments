package hw2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("HW2 - ArrayUtils Tests")
class ArrayUtilsTest {

    // ── sum ──────────────────────────────────────────────
    @Test
    @DisplayName("sum: {3, 7, 2, 9} → 21")
    void testSumBasic() {
        assertEquals(21, ArrayUtils.sum(new int[]{3, 7, 2, 9}));
    }

    @Test
    @DisplayName("sum: with negative numbers")
    void testSumWithNegative() {
        assertEquals(12, ArrayUtils.sum(new int[]{10, -3, 5}));
    }

    @Test
    @DisplayName("sum: single element")
    void testSumSingle() {
        assertEquals(42, ArrayUtils.sum(new int[]{42}));
    }

    @Test
    @DisplayName("sum: all zeros → 0")
    void testSumAllZeros() {
        assertEquals(0, ArrayUtils.sum(new int[]{0, 0, 0}));
    }

    // ── contains ─────────────────────────────────────────
    @Test
    @DisplayName("contains: target is in array → true")
    void testContainsTrue() {
        assertTrue(ArrayUtils.contains(new int[]{3, 7, 2, 9}, 7));
    }

    @Test
    @DisplayName("contains: target is NOT in array → false")
    void testContainsFalse() {
        assertFalse(ArrayUtils.contains(new int[]{3, 7, 2, 9}, 5));
    }

    @Test
    @DisplayName("contains: target is first element")
    void testContainsFirst() {
        assertTrue(ArrayUtils.contains(new int[]{10, 20, 30}, 10));
    }

    @Test
    @DisplayName("contains: target is last element")
    void testContainsLast() {
        assertTrue(ArrayUtils.contains(new int[]{10, 20, 30}, 30));
    }

    @Test
    @DisplayName("contains: single element array, target matches")
    void testContainsSingleMatch() {
        assertTrue(ArrayUtils.contains(new int[]{99}, 99));
    }

    @Test
    @DisplayName("contains: single element array, target doesn't match")
    void testContainsSingleNoMatch() {
        assertFalse(ArrayUtils.contains(new int[]{99}, 0));
    }

    // ── countEvens ───────────────────────────────────────
    @Test
    @DisplayName("countEvens: {1, 2, 3, 4, 6} → 3")
    void testCountEvensBasic() {
        assertEquals(3, ArrayUtils.countEvens(new int[]{1, 2, 3, 4, 6}));
    }

    @Test
    @DisplayName("countEvens: no even numbers → 0")
    void testCountEvensNone() {
        assertEquals(0, ArrayUtils.countEvens(new int[]{1, 3, 5}));
    }

    @Test
    @DisplayName("countEvens: all even")
    void testCountEvensAll() {
        assertEquals(4, ArrayUtils.countEvens(new int[]{2, 4, 6, 8}));
    }

    @Test
    @DisplayName("countEvens: 0 counts as even")
    void testCountEvensZero() {
        assertEquals(1, ArrayUtils.countEvens(new int[]{0, 1, 3}));
    }

    // ── reversed ─────────────────────────────────────────
    @Test
    @DisplayName("reversed: {1, 2, 3, 4} → {4, 3, 2, 1}")
    void testReversedBasic() {
        assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayUtils.reversed(new int[]{1, 2, 3, 4}));
    }

    @Test
    @DisplayName("reversed: {5, 10} → {10, 5}")
    void testReversedTwo() {
        assertArrayEquals(new int[]{10, 5}, ArrayUtils.reversed(new int[]{5, 10}));
    }

    @Test
    @DisplayName("reversed: single element stays same")
    void testReversedSingle() {
        assertArrayEquals(new int[]{7}, ArrayUtils.reversed(new int[]{7}));
    }

    @Test
    @DisplayName("reversed: original array is NOT changed")
    void testReversedDoesNotMutate() {
        int[] original = {1, 2, 3};
        ArrayUtils.reversed(original);
        assertArrayEquals(new int[]{1, 2, 3}, original);
    }

    // ── areAllPositive ───────────────────────────────────
    @Test
    @DisplayName("areAllPositive: all positive → true")
    void testAllPositiveTrue() {
        assertTrue(ArrayUtils.areAllPositive(new int[]{3, 7, 2, 9}));
    }

    @Test
    @DisplayName("areAllPositive: one negative → false")
    void testAllPositiveFalse() {
        assertFalse(ArrayUtils.areAllPositive(new int[]{3, -1, 2}));
    }

    @Test
    @DisplayName("areAllPositive: 0 is NOT positive → false")
    void testAllPositiveWithZero() {
        assertFalse(ArrayUtils.areAllPositive(new int[]{1, 0, 5}));
    }

    @Test
    @DisplayName("areAllPositive: single positive element → true")
    void testAllPositiveSingle() {
        assertTrue(ArrayUtils.areAllPositive(new int[]{1}));
    }

    @Test
    @DisplayName("areAllPositive: failure at the end → false")
    void testAllPositiveFailureAtEnd() {
        assertFalse(ArrayUtils.areAllPositive(new int[]{10, 20, 30, -1}));
    }
}
