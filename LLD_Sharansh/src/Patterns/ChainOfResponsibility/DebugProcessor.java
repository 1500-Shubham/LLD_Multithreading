package Patterns.ChainOfResponsibility;

public class DebugProcessor extends LoggerProcessor{

    public DebugProcessor(int level, LoggerProcessor nextLogger) {
        this.level= level;
        this.nextLoggerProcessor = nextLogger;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG" + message);
    }
}
