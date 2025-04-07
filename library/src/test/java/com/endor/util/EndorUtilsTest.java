package com.endor.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EndorUtilsTest {

    @Test
    void testIsNumeric() {
        assertTrue(EndorUtils.isNumeric("123"));
        assertTrue(EndorUtils.isNumeric("0"));
        assertFalse(EndorUtils.isNumeric("12.3"));
        assertFalse(EndorUtils.isNumeric("abc"));
        assertFalse(EndorUtils.isNumeric(""));
        assertFalse(EndorUtils.isNumeric(null));
    }

    @Test
    void testIsValidEmail() {
        assertTrue(EndorUtils.isValidEmail("test@example.com"));
        assertTrue(EndorUtils.isValidEmail("user.name@domain.co.uk"));
        assertFalse(EndorUtils.isValidEmail("invalid.email"));
        assertFalse(EndorUtils.isValidEmail(""));
        assertFalse(EndorUtils.isValidEmail(null));
    }
} 