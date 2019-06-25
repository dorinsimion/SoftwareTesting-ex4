package com.company;

public class StringUtils {
    public boolean check(String str) {
        if(str==null) return false;
        return str.substring(0,2)
                .equals(str.substring(str.length()-2));
    }
}
