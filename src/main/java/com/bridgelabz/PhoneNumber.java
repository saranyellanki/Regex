package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    /**
     * This method takes First Name which starts with Cap
     * and has minimum of 3 characters
     * @param name is used for comparing with regex
     * @return boolean true if matches else false
     */
    public boolean isPhoneNumber(String name) {
        String regex = "^[0-9]{2}+[ ][0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PhoneNumber number = new PhoneNumber();
        System.out.println(number.isPhoneNumber("91 9908934432"));
        System.out.println(number.isPhoneNumber("9908934432"));
    }
}
