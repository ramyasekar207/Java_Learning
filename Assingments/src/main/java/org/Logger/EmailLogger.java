package org.Logger;

public class EmailLogger extends AbstractLogger{
    @Override
    void logEvent(String value) {
        System.out.println("Logger via :"+value);
    }
}
