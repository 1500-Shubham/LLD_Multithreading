package Patterns.ChainOfResponsibility;

public class ErrorProcessor extends LoggerProcessor{

    public ErrorProcessor(int level, LoggerProcessor nextLogger) {
        this.level= level;
        this.nextLoggerProcessor = nextLogger;
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR" + message);
    }
}
