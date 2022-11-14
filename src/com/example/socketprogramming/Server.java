package com.example.socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        int port = Constants.PORT;
        System.out.println("Server is started...");
        ServerSocket serverSocket = new ServerSocket(port);

        System.out.println("Server is waiting for the client...");
        Socket socket = serverSocket.accept();
        System.out.println("Client is connected...");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String data = bufferedReader.readLine();

        System.out.println(data);
    }
}

/*
OUTPUT:
Server is started...
Server is waiting for the client...
Client is connected...
Hello from Client
 */
