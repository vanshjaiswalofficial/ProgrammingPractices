package EXP15;

import java.io.*;
import java.net.*;

public class RPCServer {

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
            System.out.println("RPC Server Started...");

            Socket socket = server.accept();

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            int a = dis.readInt();
            int b = dis.readInt();

            int sum = a + b;

            dos.writeInt(sum);

            dis.close();
            dos.close();
            socket.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}