package hw1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("HW1 - MathUtils Tests")
class MathUtilsTest {

    // ── add ──────────────────────────────────────────────
    @Test
    @DisplayName("add: 3 + 5 = 8")
    void testAddPositive() {
        assertEquals(8, MathUtils.add(3, 5));
    }

    @Test
    @DisplayName("add: negative + positive")
    void testAddNegative() {
        assertEquals(-2, MathUtils.add(-5, 3));
    }

    @Test
    @DisplayName("add: 0 + 0 = 0")
    void testAddZero() {
        assertEquals(0, MathUtils.add(0, 0));
    }

    // ── multiply ─────────────────────────────────────────
    @Test
    @DisplayName("multiply: 4 * 6 = 24")
    void testMultiplyBasic() {
        assertEquals(24, MathUtils.multiply(4, 6));
    }

    @Test
    @DisplayName("multiply: anything * 0 = 0")
    void testMultiplyByZero() {
        assertEquals(0, MathUtils.multiply(99, 0));
    }

    @Test
    @DisplayName("multiply: negative * negative = positive")
    void testMultiplyBothNegative() {
        assertEquals(6, MathUtils.multiply(-2, -3));
    }

    // ── isEven ───────────────────────────────────────────
    @Test
    @DisplayName("isEven: 4 is even")
    void testIsEvenTrue() {
        assertTrue(MathUtils.isEven(4));
    }

    @Test
    @DisplayName("isEven: 7 is odd")
    void testIsEvenFalse() {
        assertFalse(MathUtils.isEven(7));
    }

    @Test
    @DisplayName("isEven: 0 is even")
    void testIsEvenZero() {
        assertTrue(MathUtils.isEven(0));
    }

    @Test
    @DisplayName("isEven: -6 is even")
    void testIsEvenNegativeEven() {
        assertTrue(MathUtils.isEven(-6));
    }

    // ── square ───────────────────────────────────────────
    @Test
    @DisplayName("square: 5^2 = 25")
    void testSquarePositive() {
        assertEquals(25, MathUtils.square(5));
    }

    @Test
    @DisplayName("square: 0^2 = 0")
    void testSquareZero() {
        assertEquals(0, MathUtils.square(0));
    }

    @Test
    @DisplayName("square: (-3)^2 = 9")
    void testSquareNegative() {
        assertEquals(9, MathUtils.square(-3));
    }

    // ── max ──────────────────────────────────────────────
    @Test
    @DisplayName("max: 10 > 3")
    void testMaxFirstBigger() {
        assertEquals(10, MathUtils.max(10, 3));
    }

    @Test
    @DisplayName("max: 2 < 9")
    void testMaxSecondBigger() {
        assertEquals(9, MathUtils.max(2, 9));
    }

    @Test
    @DisplayName("max: equal numbers")
    void testMaxEqual() {
        assertEquals(7, MathUtils.max(7, 7));
    }

    // ── abs ──────────────────────────────────────────────
    @Test
    @DisplayName("abs: abs(-5) = 5")
    void testAbsNegative() {
        assertEquals(5, MathUtils.abs(-5));
    }

    @Test
    @DisplayName("abs: abs(3) = 3")
    void testAbsPositive() {
        assertEquals(3, MathUtils.abs(3));
    }

    @Test
    @DisplayName("abs: abs(0) = 0")
    void testAbsZero() {
        assertEquals(0, MathUtils.abs(0));
    }
}
