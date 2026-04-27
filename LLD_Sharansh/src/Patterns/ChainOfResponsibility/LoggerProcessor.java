package Patterns.ChainOfResponsibility;

public abstract class LoggerProcessor {
    public static final int DEBUG=1;
    public static final int INFO=2;
    public static final int ERROR=3;
    int level;
    LoggerProcessor nextLoggerProcessor;

    public void logMessage(int level, String message){
        if(this.level == level){
            write(message);
            return;
        }
        if(this.nextLoggerProcessor!=null){
            this.nextLoggerProcessor.logMessage(level,message);
        }
    }

    abstract protected void write(String message);
}
