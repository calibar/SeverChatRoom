package com.lmx.TestMyServerSocket.main;

import java.util.Hashtable;

public class MySeverSocket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  	
		new ServerListener().start();
		new CheckRooms().start();
	}

}
