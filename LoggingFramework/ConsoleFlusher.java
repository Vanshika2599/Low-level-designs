package LoggingFramework;

public class ConsoleFlusher implements LogFlusher {

    @Override
    public void flushLog(LoggerMessage loggerMessage) {
        System.out.println(loggerMessage);
    }
     
}
