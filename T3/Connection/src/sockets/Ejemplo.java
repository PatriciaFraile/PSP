package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class Ejemplo {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            String mensaje = "mensaje desde el emisor";
            InetAddress addr = InetAddress.getByName("localhost");
            DatagramPacket datagrama = new DatagramPacket(mensaje.getBytes(),
                    mensaje.getBytes().length, addr, 5555);
            datagramSocket.send(datagrama);
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


