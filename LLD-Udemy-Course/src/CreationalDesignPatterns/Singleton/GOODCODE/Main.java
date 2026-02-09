package CreationalDesignPatterns.Singleton.GOODCODE;

public  class Main{
    public static void main(String[] args) {
        AppSettings instance1 = AppSettings.getInstance();
        AppSettings instance2 = AppSettings.getInstance();
        instance1.getKey();
        instance2.setKey("!2ewsae345");
        instance1.getKey();
        instance2.getKey();
    }
}
