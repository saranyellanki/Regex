package com.bridgelabz;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    /**
     * This method takes email with 3 mandatory parts and 2 optional parts
     * and has minimum of 3 characters
     * @param email is used for comparing with regex
     * @return boolean true if matches else false
     */
    public boolean isEmail(String email) {
        String regex = "^(?!.*@.*@)[a-z-+_0-9]+.[a-z0-9]+@[a-z0-9]+.[a-z]*.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Predicate<Pattern> matcherPredicate = match -> match.matcher(email).matches();
        return matcherPredicate.test(pattern);
    }

    public static void main(String[] args) {
        EmailValidation email = new EmailValidation();
        System.out.println(email.isEmail("abc@yahoo.com"));
    }
}
