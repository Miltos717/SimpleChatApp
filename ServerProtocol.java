import java.net.*;
import java.io.*;

public class ServerProtocol {
	
        // we have a simple protocol  that prints the message that the client send and
	// return it to the other client
	public String processRequest(String theInput) {
		System.out.println("Received message from client: " + theInput);
		String theOutput = theInput;
		System.out.println("Send message to client: " + theOutput);
		return theOutput;
	}
}
