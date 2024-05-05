package hackerrank.singleton;

public class Singleton {
    static Singleton obj=new Singleton();
    public String str;
    private Singleton(){

    }

    public static Singleton getInstance(){

        return obj;
    }

    public static void main(String[] args) {
        String input="hello world";
        Singleton singleton=Singleton.getInstance();
        singleton.str=input;
        System.out.println("Hello I am a singleton! Let me say " + singleton.str + " to you");
    }
}
