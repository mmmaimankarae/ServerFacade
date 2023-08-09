/* Kitthanya Teachanontkullawat (Mine) 64050027
    Facade Pattern
*/
package main;
import serverfacade.Facade;

/*
 * @author mmmaimankarae
*/

// Main program (Client)
public class ClientMain {
    public static void main(String[] args) {
        Facade client = new Facade();
        client.stratServer();
        client.stopServer();
    }
}