package Patterns.ChainOfResponsibility;

public class InfoProcessor extends LoggerProcessor{

    public InfoProcessor(int level, LoggerProcessor nextLogger) {
        this.level= level;
        this.nextLoggerProcessor = nextLogger;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO" + message);
    }
}
