package CreationalDesignPatterns.Singleton.GOODCODE;

public class AppSettings {
    String key;
    private static AppSettings instance;

    private AppSettings(){
        this.key = "1234";
    }

    public static AppSettings getInstance(){
        if( instance== null){
            instance = new AppSettings();
        }
        return instance;
    }

    public void getKey(){
        System.out.println(this.key);
    }
    public void setKey(String newKey){
        this.key= newKey;
    }
}

