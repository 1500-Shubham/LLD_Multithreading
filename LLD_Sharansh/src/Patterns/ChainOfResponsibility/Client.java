package Patterns.ChainOfResponsibility;

public class Client {

    public static void main(String[] args) {
        ErrorProcessor errorProcessor = new ErrorProcessor(LoggerProcessor.ERROR,null);
        InfoProcessor infoProcessor =new InfoProcessor(LoggerProcessor.INFO,errorProcessor);
        LoggerProcessor loggerProcessor = new DebugProcessor(LoggerProcessor.DEBUG,infoProcessor);

        loggerProcessor.logMessage(3,"Error message");
        loggerProcessor.logMessage(1,"Shubham will crack anything");
    }
}
