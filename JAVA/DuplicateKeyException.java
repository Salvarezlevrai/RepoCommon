package org.example;

public class DuplicateKeyException extends Exception {
    public DuplicateKeyException(String key) {
        super("Duplicate key: " + key);
    }
}
