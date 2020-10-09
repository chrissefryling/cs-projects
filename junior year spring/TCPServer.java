/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserverdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author aaron
 */
public class TCPServer {
    //this server is one use only.  It dies after servicing one client.  Will learn threading next week... 
    TCPServer(){
        try{
            System.out.println("Server Started");
            ServerSocket ss = new ServerSocket(8888);           
            Socket aSocket = ss.accept();
            //accept pauses until a client connects
            
            BufferedReader br = new BufferedReader(new InputStreamReader(aSocket.getInputStream()));
            System.out.println("---------------");
            String str;
            while ((str = br.readLine()) != null){
                if(str.equals("quit")){
                //set a shutdown notice to the client (not implememnted)    
                    break;
                }
                System.out.println(str);    
                //send a confirmation back to the client
            }
            System.out.println("---------------\n");
            aSocket.close();
           
            
        }catch(IOException e){
            System.out.println(e.toString());
        }        
    }
}
