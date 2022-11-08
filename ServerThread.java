package it.fi.itismeucci;

import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ServerThread extends Thread{
    ServerSocket server = null;
    Socket client = null;
    String s;
    Messaggio m;
    ArrayList<Socket> socket;

    
    public ServerThread(Socket client, ArrayList<Socket> socket, ServerSocket server, String s) {
        this.client = client;
        this.socket = socket;
        this.server = server;
        this.s = s;
    }

    public void run(){
        comunica();
    }

    public void comunica() {
        try {
            BufferedReader inDalClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
            DataOutput outVersoClient = new DataOutputStream(client.getOutputStream());
            outVersoClient.writeBytes(s + '\n');
            String StringaRicevuta = inDalClient.readLine();
            ObjectMapper objectMapper = new ObjectMapper();
            m = objectMapper.readValue(StringaRicevuta, Messaggio.class);

            System.out.println("ricevuta la stringa dal cliente: " + m);
                
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}

