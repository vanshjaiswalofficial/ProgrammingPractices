package EXP14;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        System.out.println(
                "Experiment No. : 15\n" +
                        "Name : Vansh Jaiswal\n" +
                        "Enrollment No.: 0832CS241215\n" +
                        "Branch: CSE\n" +
                        "Section: C\n" +
                        "Semester: 4th\n"
        );

        try {
            ServerSocket server = new ServerSocket(5000);

            System.out.println("Server is waiting...");

            Socket socket = server.accept();

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            String msg = dis.readUTF();

            System.out.println("Client says: " + msg);

            dis.close();
            socket.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}