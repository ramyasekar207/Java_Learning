package org.example.Logger;

public class DatabaseLogger extends AbstractLogger{
    @Override
    void logEvent(String value) {
        System.out.println("Logger via :"+value);
    }
}
