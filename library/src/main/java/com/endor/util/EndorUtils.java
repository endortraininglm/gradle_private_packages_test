package com.endor.util;

/**
 * Utility class providing common string and validation operations.
 */
public class EndorUtils {
    
    /**
     * Checks if a string contains only digits.
     *
     * @param str the string to check
     * @return true if the string contains only digits, false otherwise
     */
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);
    }
    
    /**
     * Validates if a string is a valid email address format.
     * This is a simple validation and not comprehensive.
     *
     * @param email the email address to validate
     * @return true if the email format is valid, false otherwise
     */
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
} 