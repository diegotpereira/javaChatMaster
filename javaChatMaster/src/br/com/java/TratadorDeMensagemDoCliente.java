package br.com.java;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TratadorDeMensagemDoCliente implements Runnable{
	
	private Socket cliente;
	private Servidor servidor;
	
	public TratadorDeMensagemDoCliente(Socket cliente, Servidor servidor) {
		this.cliente = cliente;
		this.servidor = servidor;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try (Scanner s = new Scanner(this.cliente.getInputStream())){
			while (s.hasNextLine()) {
				servidor.distribuiMensagem(this.cliente, s.nextLine());
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
