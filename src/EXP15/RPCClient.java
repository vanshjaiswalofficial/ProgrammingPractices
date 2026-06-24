package EXP15;

import java.io.*;
import java.net.*;

public class RPCClient {

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
            Socket socket = new Socket("localhost", 5000);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            int num1 = 10;
            int num2 = 20;

            dos.writeInt(num1);
            dos.writeInt(num2);

            int result = dis.readInt();

            System.out.println("Addition = " + result);

            dis.close();
            dos.close();
            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}