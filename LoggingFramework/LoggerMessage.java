package LoggingFramework;

import java.security.Timestamp;

public class LoggerMessage {
     private final LogLevel logLevel;
     private final String message;
     private final long cTimestamp;
     
     LoggerMessage(LogLevel logLevel, String message) {
          this.logLevel = logLevel;
          this.message = message;
          this.cTimestamp = System.currentTimeMillis();
     }

     public LogLevel getLogLevel() 
     {
          return this.logLevel;
     }

     public long getTimestamp() {
          return this.cTimestamp;
     }
     
}
