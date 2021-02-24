package br.com.java;

import java.io.IOException;
import java.net.UnknownHostException;

public class RodaCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		new Cliente ("192.168.1.253", 12345).executa();

	}

}
