package com.example;

import java.nio.file.Files;
import java.nio.file.Path;

public class BackendApp {

    public static void main(String[] args) throws Exception {

        // 👇 THIS IS WHERE SECRET IS READ
        String dbPassword = Files.readString(
                Path.of("/mnt/secrets/db-password")
        ).trim();

        System.out.println("DB password successfully loaded from GCP Secret Manager");

        // Example usage (DO NOT PRINT IN REAL APPS)
        // System.out.println(dbPassword);

        // Keep app running (for demo)
        while (true) {
            Thread.sleep(10000);
        }
    }
}
