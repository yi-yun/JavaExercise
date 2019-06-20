package com.yiyun.Rule10;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        class Status {
            public String status;

            @Override
            public boolean equals(Object obj) {
                return Objects.equals(status, ((Status) obj).status);
            }
        }
        Status s1 = new Status();
        Status s2 = new Status();

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // false
    }
}
