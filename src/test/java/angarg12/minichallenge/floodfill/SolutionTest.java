package angarg12.minichallenge.floodfill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSameColour() {
        Solution solution = new Solution();
        int[][] image = {{0, 0, 0}, {0, 1, 1}};
        int[][] expectedResult = {{0, 0, 0}, {0, 1, 1}};
        assertArrayEquals(solution.floodFill(image, 1, 1, 1), expectedResult);
    }

    @Test
    public void testPaintOnlyTargetColour() {
        Solution solution = new Solution();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] expectedResult = {{2,2,2},{2,2,0},{2,0,1}};
        assertArrayEquals(solution.floodFill(image, 1, 1, 2), expectedResult);
    }

    @Test
    public void testEdges() {
        Solution solution = new Solution();
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] expectedResult = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        assertArrayEquals(solution.floodFill(image, 1, 1, 2), expectedResult);
    }

    @Test
    public void testEmptyInput() {
        Solution solution = new Solution();
        int[][] image = {{}};
        int[][] expectedResult = {{}};
        assertArrayEquals(solution.floodFill(image, 0, 0, 0), expectedResult);
    }

    @Test
    public void testIndexOutOfBoundsInput() {
        Solution solution = new Solution();
        int[][] image = {{1}};
        int[][] expectedResult = {{1}};
        assertArrayEquals(solution.floodFill(image, 1, 2, 0), expectedResult);
    }
}
