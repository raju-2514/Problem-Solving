Java
public class Singleton {

  // Private constructor to prevent external instantiation
  private Singleton() {
    // Optional initialization code here
  }

  // Public static variable to hold the single instance
  private static Singleton instance = null;

  // Public static method to retrieve the single instance
  public static Singleton getSingleInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  // Example method to demonstrate usage (can be any method)
  public void someSingletonMethod(String message) {
    System.out.println("Hello I am a singleton! Let me say " + message + " to you");
  }
}