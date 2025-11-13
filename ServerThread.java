import java.io.*;
 import java.net.*;

 class ServerThread extends Thread
 {
		private final Socket myDataSocket;
		private final Socket otherDataSocket;
		private final InputStream is;
		private final BufferedReader in;
		private final OutputStream os;
		private final PrintWriter out;
		private static final String EXIT = "CLOSE";

    	public ServerThread(Socket socket1, Socket socket2)
    	{
       		myDataSocket = socket1;
            otherDataSocket = socket2;
       		try {
 			is = myDataSocket.getInputStream();
 			in = new BufferedReader(new InputStreamReader(is));
 			os = otherDataSocket.getOutputStream();
 			out = new PrintWriter(os,true);
 		}
 		catch (IOException e)	{		
 	 		System.out.println("I/O Error " + e);
       		}
     	}

 	public void run()
 	{
    		String inmsg, outmsg;

 		try {
 			inmsg = in.readLine();
 			ServerProtocol app = new ServerProtocol();
 			outmsg = app.processRequest(inmsg);
 			while(!outmsg.equals(EXIT)) {
 				out.println(outmsg);
 				inmsg = in.readLine();
 				outmsg = app.processRequest(inmsg);
 			}		

 			myDataSocket.close();
 			System.out.println("Data socket closed");

 		} catch (IOException e)	{		
 	 		System.out.println("I/O Error " + e);
 		}
 	}	
 }	
