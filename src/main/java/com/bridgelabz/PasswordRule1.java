package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule1 {
    /**
     * This method takes password with minimum of 8 chars
     * @param password is used for comparing with regex
     * @return boolean true if matches else false
     */
    public boolean isPassword(String password) {
        String regex = "^[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PasswordRule1 pass = new PasswordRule1();
        System.out.println(pass.isPassword("nfgoi32i"));
        System.out.println(pass.isPassword("#4piwjr@"));
    }
}
