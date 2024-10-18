package org.example.Logger;

public class EmailLogger extends AbstractLogger{
    @Override
    void logEvent(String value) {
        System.out.println("Logger via :"+value);
    }
}
