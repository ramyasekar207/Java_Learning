package org.Logger;


public class Main {
    public static void main(String[] args) {
        FileLogger file = new FileLogger();
        file.logEvent("File Event");

        EmailLogger email = new EmailLogger();
        email.logEvent("Email Event");

        DatabaseLogger db = new DatabaseLogger();
        db.logEvent("DB Event");
    }
}
