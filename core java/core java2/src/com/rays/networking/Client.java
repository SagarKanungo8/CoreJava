package com.rays.networking;

import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket s= new Socket("Localhost",4444);
		InputStream in=s.getInputStream();
		DataInputStream din= new DataInputStream(in);
		OutputStream out=s.getOutputStream();
		DataOutputStream dout= new DataOutputStream(out)
		
	}

	}


