import java.net.*;
 import java.io.*;

 public class ChatClientProtocol {

 	BufferedReader user = new BufferedReader(new InputStreamReader(System.in));

 	public String sendMessage() throws IOException {

      	logger.info("Send message, CLOSE for exit:");
 		String theOutput = user.readLine();

 			return theOutput;
         }

 	public String receiveMessage(String theInput) throws IOException {

		logger.info("Received message: " + theInput);
		logger.info("Send a reply, CLOSE for exit:");
		
 			return theInput;
 	}
 }
