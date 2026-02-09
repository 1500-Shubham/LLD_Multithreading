package CreationalDesignPatterns.Singleton.BADCODE;

 class AppSettings {
    String key;
    public AppSettings(){
        this.key = "12355";
    }

    void getKey(){
        System.out.println(this.key);
    }

    void setKey(String key1y){
        this.key = key1y;
    }

}

public class Main{
    public static void main(String[] args) {
        AppSettings instace1 = new AppSettings();
        instace1.getKey();
        AppSettings instace2 = new AppSettings();
        instace2.setKey("345");
        instace1.getKey();
        instace2.getKey();
//        Both return different wanted same
//        Logger 1 looger 2 behaving differnetly
    }
}
