package book.offer;

import org.junit.Test;

public class _5_ReplaceSpace {
    public String replace(String str) {
        if (str == null)
            return null;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equals(" ")) {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    @Test
    public void fun() {
        String we_are_happy = replace("We are happy");

    }
}
