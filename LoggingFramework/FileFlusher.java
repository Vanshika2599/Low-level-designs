package LoggingFramework;

import java.io.FileWriter;
public class FileFlusher implements LogFlusher {
    private final String filePath;

    FileFlusher(String filePath) {
      this.filePath = filePath;
    }

    @Override
    public void flushLog(LoggerMessage loggerMessage) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(loggerMessage.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
