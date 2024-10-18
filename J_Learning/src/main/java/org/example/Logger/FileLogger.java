package org.example.Logger;

public class FileLogger extends AbstractLogger{
    @Override
    void logEvent(String value) {
        System.out.println("Logger via :"+value);
    }
}
