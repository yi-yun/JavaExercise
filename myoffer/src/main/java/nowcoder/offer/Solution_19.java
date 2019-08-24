package nowcoder.offer;

import java.util.ArrayList;

/**
 * @class: Solution_19
 * @description: 逆序打印矩阵
 * @author: yi-yun
 * @create: 2019-08-24 23:08
 **/
public class Solution_19 {

    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int start = 0;
        while(rows > start*2 && columns > start*2){
            printMatrixInCircle(matrix, rows, columns, start);
            start++;
        }
        return list;
    }

    /**
     * 功能：打印一圈
     */
    public void printMatrixInCircle(int [][] matrix, int rows, int columns, int start){
        // 从左到右打印一行
        for(int i = start; i < columns - start; i++)
            list.add(matrix[start][i]);
        // 从上到下打印一列
        for(int j = start + 1; j < rows - start; j++)
            list.add(matrix[j][columns - start - 1]);
        // 从右到左打印一行
        for(int m = columns - start - 2; m >= start && rows - start - 1 > start; m--)
            list.add(matrix[rows - start - 1][m]);
        // 从下到上打印一列
        for(int n = rows - start - 2; n >= start + 1 && columns - start - 1 > start; n--)
            list.add(matrix[n][start]);
    }
}
