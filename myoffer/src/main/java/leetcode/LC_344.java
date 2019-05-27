package leetcode;

import org.junit.Test;

public class LC_344 {
    public void swap(char[] s, int i, int j) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }

    public void reverseString(char[] s) {
        int slow = 0;
        int fast = s.length - 1;
        while (slow <= fast) {
            swap(s, slow, fast);
            slow++;
            fast--;

        }
    }

    @Test
    public void fun() {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        reverseString(chars);
        System.out.println("chars = " + chars);
    }
}
