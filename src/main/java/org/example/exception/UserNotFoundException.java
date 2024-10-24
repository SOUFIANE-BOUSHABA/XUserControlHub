// src/main/java/org/example/exception/UserNotFoundException.java
package org.example.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User not found: " + id);
    }
}
