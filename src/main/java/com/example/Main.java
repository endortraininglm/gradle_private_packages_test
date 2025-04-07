package com.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Gradle Artifactory project!");
        
        // Using both Java's built-in and Apache Commons Lang
        String text = "   Hello World   ";
        System.out.println("Original text: '" + text + "'");
        System.out.println("Java trim: '" + text.trim() + "'");
        System.out.println("Apache Commons trim: '" + StringUtils.trim(text) + "'");
    }
} 