package com.bridgelabz;

import java.util.function.Predicate;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}

public class EmailValidation {
    String regex;

    /**
     * This method takes email with 3 mandatory parts and 2 optional parts
     * and has minimum of 3 characters
     * @param email is used for comparing with regex
     * @return boolean true if matches else false
     */
    public boolean isEmail(String email) throws InvalidEmailException {
        regex = "^(?!.*@.*@)[a-z-+_0-9]+.[a-z0-9]+@[a-z0-9]+.[a-z]*.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Predicate<Pattern> matcherPredicate = match -> match.matcher(email).matches();
        boolean match = matcherPredicate.test(pattern);
        if (!match) {
            throw new InvalidEmailException("Invalid email");
        } else {
            return true;
        }
    }

    public static void main(String[] args) throws InvalidEmailException {
        EmailValidation email = new EmailValidation();
        System.out.println(email.isEmail("abc@yahoo.com"));
        try {
            System.out.println(email.isEmail("abc"));
        }catch (InvalidEmailException ie){
            System.out.println("Invalid email");
        }
        System.out.println(email.isEmail("abc123@yahoo.com"));
    }
}
