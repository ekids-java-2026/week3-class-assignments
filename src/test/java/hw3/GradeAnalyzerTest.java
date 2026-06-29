package hw3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("HW3 - GradeAnalyzer Tests")
class GradeAnalyzerTest {

    // ── getLetterGrade ───────────────────────────────────
    @Test
    @DisplayName("getLetterGrade: 95 → A")
    void testGradeA() {
        assertEquals("A", GradeAnalyzer.getLetterGrade(95));
    }

    @Test
    @DisplayName("getLetterGrade: 90 → A (boundary)")
    void testGradeABoundary() {
        assertEquals("A", GradeAnalyzer.getLetterGrade(90));
    }

    @Test
    @DisplayName("getLetterGrade: 80 → B")
    void testGradeB() {
        assertEquals("B", GradeAnalyzer.getLetterGrade(80));
    }

    @Test
    @DisplayName("getLetterGrade: 75 → B (boundary)")
    void testGradeBBoundary() {
        assertEquals("B", GradeAnalyzer.getLetterGrade(75));
    }

    @Test
    @DisplayName("getLetterGrade: 72 → C")
    void testGradeC() {
        assertEquals("C", GradeAnalyzer.getLetterGrade(72));
    }

    @Test
    @DisplayName("getLetterGrade: 60 → C (boundary)")
    void testGradeCBoundary() {
        assertEquals("C", GradeAnalyzer.getLetterGrade(60));
    }

    @Test
    @DisplayName("getLetterGrade: 50 → D")
    void testGradeD() {
        assertEquals("D", GradeAnalyzer.getLetterGrade(50));
    }

    @Test
    @DisplayName("getLetterGrade: 30 → F")
    void testGradeF() {
        assertEquals("F", GradeAnalyzer.getLetterGrade(30));
    }

    @Test
    @DisplayName("getLetterGrade: 0 → F (boundary)")
    void testGradeFZero() {
        assertEquals("F", GradeAnalyzer.getLetterGrade(0));
    }

    // ── average ──────────────────────────────────────────
    @Test
    @DisplayName("average: {80, 90, 70} → 80")
    void testAverageBasic() {
        assertEquals(80, GradeAnalyzer.average(new int[]{80, 90, 70}));
    }

    @Test
    @DisplayName("average: {55, 65} → 60")
    void testAverageTwo() {
        assertEquals(60, GradeAnalyzer.average(new int[]{55, 65}));
    }

    @Test
    @DisplayName("average: single element returns itself")
    void testAverageSingle() {
        assertEquals(75, GradeAnalyzer.average(new int[]{75}));
    }

    @Test
    @DisplayName("average: rounds down (integer division)")
    void testAverageRoundsDown() {
        // (85 + 30 + 60 + 20 + 75) / 5 = 270 / 5 = 54
        assertEquals(54, GradeAnalyzer.average(new int[]{85, 30, 60, 20, 75}));
    }

    // ── findMax ──────────────────────────────────────────
    @Test
    @DisplayName("findMax: {70, 95, 60, 88} → 95")
    void testFindMaxBasic() {
        assertEquals(95, GradeAnalyzer.findMax(new int[]{70, 95, 60, 88}));
    }

    @Test
    @DisplayName("findMax: single element")
    void testFindMaxSingle() {
        assertEquals(42, GradeAnalyzer.findMax(new int[]{42}));
    }

    @Test
    @DisplayName("findMax: max is first element")
    void testFindMaxFirst() {
        assertEquals(100, GradeAnalyzer.findMax(new int[]{100, 50, 75}));
    }

    @Test
    @DisplayName("findMax: all equal")
    void testFindMaxAllEqual() {
        assertEquals(70, GradeAnalyzer.findMax(new int[]{70, 70, 70}));
    }

    // ── findMin ──────────────────────────────────────────
    @Test
    @DisplayName("findMin: {70, 95, 60, 88} → 60")
    void testFindMinBasic() {
        assertEquals(60, GradeAnalyzer.findMin(new int[]{70, 95, 60, 88}));
    }

    @Test
    @DisplayName("findMin: single element")
    void testFindMinSingle() {
        assertEquals(42, GradeAnalyzer.findMin(new int[]{42}));
    }

    @Test
    @DisplayName("findMin: min is last element")
    void testFindMinLast() {
        assertEquals(10, GradeAnalyzer.findMin(new int[]{100, 50, 10}));
    }

    // ── countPassed ──────────────────────────────────────
    @Test
    @DisplayName("countPassed: {85, 30, 60, 20, 75} → 3")
    void testCountPassedMixed() {
        assertEquals(3, GradeAnalyzer.countPassed(new int[]{85, 30, 60, 20, 75}));
    }

    @Test
    @DisplayName("countPassed: all pass")
    void testCountPassedAll() {
        assertEquals(3, GradeAnalyzer.countPassed(new int[]{50, 60, 70}));
    }

    @Test
    @DisplayName("countPassed: none pass")
    void testCountPassedNone() {
        assertEquals(0, GradeAnalyzer.countPassed(new int[]{10, 20, 39}));
    }

    @Test
    @DisplayName("countPassed: exactly 40 counts as passed")
    void testCountPassedBoundary() {
        assertEquals(1, GradeAnalyzer.countPassed(new int[]{40, 39}));
    }

    // ── allPassed ────────────────────────────────────────
    @Test
    @DisplayName("allPassed: {50, 60, 70} → true")
    void testAllPassedTrue() {
        assertTrue(GradeAnalyzer.allPassed(new int[]{50, 60, 70}));
    }

    @Test
    @DisplayName("allPassed: {50, 35, 70} → false")
    void testAllPassedFalse() {
        assertFalse(GradeAnalyzer.allPassed(new int[]{50, 35, 70}));
    }

    @Test
    @DisplayName("allPassed: one student exactly at 40 → true")
    void testAllPassedBoundary() {
        assertTrue(GradeAnalyzer.allPassed(new int[]{40}));
    }

    @Test
    @DisplayName("allPassed: one failure at the end → false")
    void testAllPassedFailureAtEnd() {
        assertFalse(GradeAnalyzer.allPassed(new int[]{90, 85, 78, 0}));
    }

    // ── summary (BONUS) ──────────────────────────────────
    @Test
    @DisplayName("summary: {85, 30, 60, 20, 75}")
    void testSummaryBasic() {
        String result = GradeAnalyzer.summary(new int[]{85, 30, 60, 20, 75});
        assertEquals("Max: 85 | Min: 20 | Avg: 54 | Passed: 3/5", result);
    }

    @Test
    @DisplayName("summary: single student who passed")
    void testSummarySinglePass() {
        String result = GradeAnalyzer.summary(new int[]{100});
        assertEquals("Max: 100 | Min: 100 | Avg: 100 | Passed: 1/1", result);
    }

    @Test
    @DisplayName("summary: all failed")
    void testSummaryAllFail() {
        String result = GradeAnalyzer.summary(new int[]{10, 20, 30});
        assertEquals("Max: 30 | Min: 10 | Avg: 20 | Passed: 0/3", result);
    }
}
