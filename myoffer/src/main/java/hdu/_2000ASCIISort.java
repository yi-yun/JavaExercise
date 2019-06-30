package hdu;

import java.util.Scanner;

public class _2000ASCIISort {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=null;
        while (cin.hasNext()) {
            s = cin.nextLine();
            char[] chars = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length() - 1 - i; j++) {
                    if (chars[j] > chars[j + 1]) {
                        char tmp = chars[j];
                        chars[j] = chars[j + 1];
                        chars[j + 1] = tmp;
                    }
                }
            }
            int i=0;
            for (i = 0; i < chars.length-1; i++) {
                System.out.print(chars[i]+" ");
            }
            System.out.println(chars[i]);
        }
    }
}
