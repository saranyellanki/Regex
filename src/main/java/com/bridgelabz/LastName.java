package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    /**
     * This method takes Last Name which starts with Cap
     * and has minimum of 3 characters
     * @param name is used for comparing with regex
     * @return boolean true if matches else false
     */
    public boolean isLastName(String name) {
        String regex = "^[A-Z][a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LastName fm = new LastName();
        System.out.println(fm.isLastName("Yellanki"));
        System.out.println(fm.isLastName("YellaNki"));
    }
}
