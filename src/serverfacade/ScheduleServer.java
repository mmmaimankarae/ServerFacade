/* Kitthanya Teachanontkullawat (Mine) 64050027
    Facade Pattern
*/
package serverfacade;

// Hiding method from Client
public class ScheduleServer {
    private static final String reset = "\u001B[0m";
    private static final String red = "\u001B[31m";
    private static final String blue = "\u001B[34m";
    
    public String getBlue() {
        return blue;
    }
    
    public String getRed() {
        return red;
    }
    
    public String getReset() {
        return reset;
    }
    
    public void startBooting(){
	System.out.println(blue + "Starts booting..." + reset);
    }
     
    public void readSystemConfigFile(){
        System.out.println("Reading system config files...");
    }
    
    public void init(){
	System.out.println("Initializing...");
    }
    
    public void initializeContext(){
	System.out.println("Initializing context...");
    }
    
    public void initializeListeners(){
	System.out.println("Initializing listeners...");
    }
    
    public void createSystemObjects(){
        System.out.println("Creating system objects...");
    }
    
    public void releaseProcesses(){
        System.out.println("Releasing processes...");
    }
    
    public void destory(){
        System.out.println("Destorying...");
    }
    
    public void destroySystemObjects(){
	System.out.println("Destroying system objects...");
    }
    
    public void destoryListeners(){
        System.out.println("Destroying listeners...");
    }
    
    public void destoryContext(){
        System.out.println("Destroying context...");
    }
    
    public void shutdown(){
        System.out.println(red + "Shutting down...");
    }
}