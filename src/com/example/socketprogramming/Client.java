package com.example.socketprogramming;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        String host = Constants.SERVER_HOST;
        int port = Constants.PORT;
        Socket socket = new Socket(host, port);

        String data = "Hello from Client\n";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
        outputStreamWriter.write(data);
        outputStreamWriter.flush();
    }
}
