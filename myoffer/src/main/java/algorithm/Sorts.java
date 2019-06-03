package algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Consumer;

public class Sorts {

    //冒泡排序
    public void bubbleSort(int[] a) {
        int n = a.length;
        if (n == 1)
            return;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }

    }

    @Test
    public void funbubbleSort() {
        int[] a = {4, 5, 6, 3, 2, 1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    //插入排序
    public void insertSort(int[] a) {
        int length = a.length;
        if (length <= 1)
            return;
        for (int i = 1; i < length; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else break;
            }
            a[j + 1] = value;
        }
    }

    @Test
    public void funinsertSort() {
        int[] a = {4, 5, 6, 3, 2, 1};
        insertSort(a);
        System.out.println(Arrays.toString(a));
    }

    //选择排序
    public void selectionSort(int[] a) {
        int length = a.length;
        if (length <= 1) return;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

    @Test
    public void funselectionSort() {
        int[] a = {4, 5, 6, 3, 2, 1};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }

    //快速排序
    public void quickSort(int[] a) {
        quickInternally(a, 0, a.length - 1);
    }

    private void quickInternally(int[] a, int p, int r) {
        if (p >= r) return;
        int q = partion(a, p, r);
        quickInternally(a, p, q - 1);
        quickInternally(a, q + 1, r);
    }

    private int partion(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                if (i == j) {
                    i++;
                } else {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                }
            }
        }
        int temp = a[r];
        a[r] = a[i];
        a[i] = temp;
        return i;
    }

    @Test
    public void funquickSort() {
        int[] a = {4, 5, 6, 3, 2, 1};

        quickSort(a);
        System.out.println(Arrays.toString(a));
    }

    //堆排序
    public void buildHeap(int[] a, int size) {
        for (int i = size / 2 - 1; i >= 0; --i) {
            heapify(a, i, size);
        }
    }

    private void heapify(int[] arrays, int currentRootNode, int size) {
        if (currentRootNode < size) {
            //左右子树的位置
            int left = currentRootNode * 2 + 1;
            int right = currentRootNode * 2 + 2;
            //把当前父节点当成最大
            int max = currentRootNode;
            if (left < size) {
                //左节点碧根节点大记录位置
                if (arrays[left] > arrays[max]) {
                    max = left;
                }
            }
            if (right < size) {
                //左节点碧根节点大记录位置
                if (arrays[right] > arrays[max]) {
                    max = right;
                }
            }
            //如果根节点不是最大的就交换
            if (max != currentRootNode) {
                int temp = arrays[max];
                arrays[max] = arrays[currentRootNode];
                arrays[currentRootNode] = temp;
                //继续比较
//                heapify(arrays, left, size);
                heapify(arrays, max, size);
            }
        }
    }

    @Test
    public void funHeap() {
//        int[] arrays = {4, 5, 6, 3, 2, 1};
        int[] arrays = {1, 6, 5, 2, 3, 4, 7};
        for (int i = 0; i < arrays.length; i++) {
            //每次建堆就可以排除一个元素了
            buildHeap(arrays, arrays.length - i);
            //交换
            int temp = arrays[0];
            arrays[0] = arrays[(arrays.length - 1) - i];
            arrays[(arrays.length - 1) - i] = temp;
        }
        System.out.println(Arrays.toString(arrays));
    }
    
}
