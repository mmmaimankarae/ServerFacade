/* Kitthanya Teachanontkullawat (Mine) 64050027
    Facade Pattern
*/
package serverfacade;

// Called by Client
public class Facade {  
    public void stratServer() {
        ScheduleServer start = new ScheduleServer();
        start.startBooting();
        processStart(start);
    }
    
    private void processStart(ScheduleServer server) {
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
        System.out.println(server.getBlue() + "Start working......\n");
    }
    
    public void stopServer() {
        ScheduleServer stop = new ScheduleServer();
        processStop(stop);
        stop.shutdown();
    }
    
    private void processStop(ScheduleServer server) {
        System.out.println(server.getRed() + "After work done.........");
	server.releaseProcesses();
	server.destory();
	server.destroySystemObjects();
	server.destoryListeners();
	server.destoryContext();
    }
}