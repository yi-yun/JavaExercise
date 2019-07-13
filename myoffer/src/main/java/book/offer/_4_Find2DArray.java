package book.offer;

public class _4_Find2DArray {
    public boolean find(int[][] array, int target) {
        if (array == null) {
            return false;
        }
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
