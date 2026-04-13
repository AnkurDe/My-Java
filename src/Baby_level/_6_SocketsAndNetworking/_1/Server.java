package Baby_level._6_SocketsAndNetworking._1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    /**
     *
     */
    static void main() throws IOException {
        // Declaring socket to read/recieve message - Server
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server waiting...");

        Socket socket = server.accept();
        System.out.println("User connected");

        // Network Socket → Byte Stream → Character Conversion → Buffered Text Reader
        /*
        A BufferedReader is used to:
        1) Read text efficiently
        2) Read line by line using readLine()
        3) Reduce costly low-level reads by buffering data internally

        InputStreamReader converts bytes to characters

        socket.getInputStream() returns stream of bytes being received from the connected client/server.
         */
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = in.readLine();

        System.out.println("Client: " + message);

        server.close();
        socket.close();
    }
}
