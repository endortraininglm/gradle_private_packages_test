package com.example;

import org.apache.commons.lang3.StringUtils;
import com.endor.util.EndorUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Gradle Artifactory project!");
        
        // Using Apache Commons Lang
        String text = "   Hello World   ";
        System.out.println("Original text: '" + text + "'");
        System.out.println("Trimmed text: '" + StringUtils.trim(text) + "'");
        
        // Using our custom EndorUtils
        String number = "12345";
        String email = "test@example.com";
        
        System.out.println("\nTesting EndorUtils:");
        System.out.println("Is '" + number + "' numeric? " + EndorUtils.isNumeric(number));
        System.out.println("Is '" + email + "' a valid email? " + EndorUtils.isValidEmail(email));
    }
} 