package br.com.java;

import java.io.InputStream;
import java.util.Scanner;

public class RecebedorDeMensagemDoServidor implements Runnable{
	
	private InputStream servidor;
	
	public RecebedorDeMensagemDoServidor(InputStream servidor) {
		this.servidor = servidor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try(Scanner s = new Scanner(this.servidor)){
			while (s.hasNextLine()) {
				System.out.println(s.hasNextLine());
			}
		}
		
	}

}
