package org.example.Logger;

public class LogManager {
    public static void getLogger(String value)
    {
        if(value.equalsIgnoreCase("File"))
        {
            FileLogger file = new FileLogger();
            file.logEvent("File Event");
        }
        else if(value.equalsIgnoreCase("Email"))
        {
            EmailLogger email = new EmailLogger();
            email.logEvent("Email Event");
        }
        else if(value.equalsIgnoreCase("DB"))
        {
            DatabaseLogger db = new DatabaseLogger();
            db.logEvent("DB Event");
        }
    }
}
