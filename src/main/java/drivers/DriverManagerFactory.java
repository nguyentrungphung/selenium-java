package drivers;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            return new ChromeDriverManager();
        }else if (browserName.equalsIgnoreCase("firefox")){
            return new FireFoxDriverManager();
        }else{
            return new EdgeDriverManager();
        }
    }
}
