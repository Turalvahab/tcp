/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import util.FileUtility;

/**
 *
 * @author User
 */
public class TCPClient {
    public static void main (String[]args) throws  Exception{
    Socket socket=new Socket("localhost",6789);
    OutputStream outputStream=socket.getOutputStream();
    DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
    byte[] bytes=FileUtility.readBytes("C:\\Users\\User\\Desktop\\screen.png");
    outputStream.write(bytes);
    socket.close();
    }
}
