package br.com.dominio;

import javax.swing.JOptionPane;

import br.com.dominio.mensagem.Mensagem;
import br.com.dominio.mensagem.MensagemFactory;

public class Principal {

	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(null);
		
		//é criado uma classe que coordena a chamada mudando apenas o indice definido, 
		//não necessitando alterar o nome da classe. 
		Mensagem mensagem = MensagemFactory.getMensagem(1);
		mensagem.enviar(texto);

	}

}
