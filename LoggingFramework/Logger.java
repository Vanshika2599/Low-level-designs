package LoggingFramework;

import java.util.List;

public class Logger {
    private static List<LogFlusher> logFlushers;
    private static Logger instance;
    public static Logger getInstance(List<LogFlusher> logFlusherList) {
     if(instance == null) {
        instance = new Logger();
        logFlushers = logFlusherList;
     }
     return instance;
   }
   
   private void log(LogLevel logLevel, String msg) {
       LoggerMessage loggerMessage = new LoggerMessage(logLevel, msg);
       logFlushers.forEach(logFlusher -> {
        logFlusher.flushLog(loggerMessage);
       });
   }

   public void info(String message) {
      log(LogLevel.INFO, message);
   }

   public void warn(String message) {
     log(LogLevel.WARN, message);
   }
}
