package Baby_level._6_SocketsAndNetworking._2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    static void main() throws IOException {
        // Declaring socket to send message - Client
        Socket socket = new Socket("localhost", 5000);

        /*
        A socket connection has two directions:

        Input stream = receive data
        Output stream = send data

        This line prepares a convenient object named out that can send text such as:
        out.println("Hello");
        out.print("OK");

        autoFlush = true means that the moment data is written it is sent over the network
         */
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("I am Ankur saying Hi from here");
        // This is not received hence we need to improvise
        out.println("I am doing okay :_(");

        socket.close();
    }
}
