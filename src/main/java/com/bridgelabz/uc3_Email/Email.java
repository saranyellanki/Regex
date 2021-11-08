package com.bridgelabz.uc3_Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    /**
     * This method takes email with 3 mandatory parts and 2 optional parts
     * and has minimum of 3 characters
     * @param email is used for comparing with regex
     * @return boolean true if matches else false
     */
    public boolean isEmail(String email) {
        String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Email email = new Email();
        System.out.println(email.isEmail("abc@yahoo.com"));
        System.out.println(email.isEmail("abc-100@yahoo.com"));
        System.out.println(email.isEmail("abc.100@yahoo.com"));
        System.out.println(email.isEmail("abc111@abc.com"));
        System.out.println(email.isEmail("abc-100@abc.net"));
        System.out.println(email.isEmail("abc.100@abc.com.au"));
        System.out.println(email.isEmail("abc@1.com"));
        System.out.println(email.isEmail("abc@yahoo.com.com"));
        System.out.println(email.isEmail("abc+100@yahoo.com"));
    }
}
