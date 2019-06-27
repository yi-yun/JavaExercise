package leetcode.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LC_950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        int length = deck.length;
        Arrays.sort(deck);
        int[] result = new int[length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            queue.add(i);
        }
        for (int i = 0; i < length; i++) {
            result[queue.poll()] = deck[i];
            queue.offer(queue.poll());
        }
        return result;
    }
    @Test
    public void fun(){
        int[] arrays = {17, 13, 11, 2, 3, 5, 7};
        int[] res = deckRevealedIncreasing(arrays);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }
}
