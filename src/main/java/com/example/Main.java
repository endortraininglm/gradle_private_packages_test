package com.example;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Gradle Artifactory project!");
        
        // Using Apache Commons Lang to demonstrate the dependency
        String text = "   Hello World   ";
        System.out.println("Original text: '" + text + "'");
        System.out.println("Trimmed text: '" + StringUtils.trim(text) + "'");
    }
} 