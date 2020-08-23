/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import util.FileUtility;

/**
 *
 * @author User
 */
public class TCPServer {
         /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception  {
    
       readAsByte(); 
    }
    public static void readAsByte()throws Exception{
        
      ServerSocket ourFirstServerSocket=new ServerSocket(6789);
  while(true){
      System.out.println("yeni soket ucun ve ya yeni musteri ucun gozleyirem...");
    Socket connection =ourFirstServerSocket.accept();
      System.out.println("urra yeni musteri geldi...");
      
      DataInputStream dataStream=new  DataInputStream(connection.getInputStream());
   byte[] arr=readMessage(dataStream);
      System.out.println("message length2="+arr.length);
    FileUtility.writeBytes(arr,"C:/Users/User/Desktop/screen.png");
    }
    }
    public static byte[]readMessage(DataInputStream din) throws Exception{
    int msgLen=din.readInt();
        System.out.println("message length1="+msgLen);
    byte[]msg=new byte[msgLen];
    din.readFully(msg);
    return msg;
    
    }
public static void readAsString() throws Exception{

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
