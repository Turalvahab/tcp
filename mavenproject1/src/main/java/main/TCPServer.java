/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author User
 */
public class TCPServer {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
     
ServerSocket ourFirstServerSocket=new ServerSocket(6789);
  while(true){
      System.out.println("yeni soket ucun ve ya yeni musteri ucun gozleyirem...");
    Socket connection =ourFirstServerSocket.accept();
      System.out.println("urra yeni musteri geldi...");
    InputStream is=connection.getInputStream();
    InputStreamReader reader=new InputStreamReader(is);
    BufferedReader bReader=new BufferedReader(reader);
    
    String messageFromClient=bReader.readLine();
    System.out.println("musteri deyirki"+messageFromClient);
    }      
}
}
