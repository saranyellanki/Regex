package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule3 {
    /**
     * This method takes password with minimum of 8 chars
     * and has at least 1 numeric number
     * @param password is used for comparing with regex
     * @return boolean true if matches else false
     */
    public boolean isPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PasswordRule3 pass = new PasswordRule3();
        System.out.println(pass.isPassword("nfgo#2@4Yr"));
        System.out.println(pass.isPassword("eiunegtce"));
    }
}
