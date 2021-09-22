package br.com.decision.model;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class NovoUsuarioPassos {
	private Usuario usuario;
	private String mensagem;
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@BeforeClass
	private void initialize() {
		System.out.println("initialize()");
	}
	
	@Dado("O Registro de Usuário")
	public void o_registro_de_usuário() {
		System.out.println("novoUsuario()");
		usuario.novoUsuario(usuario);
	}
	
	@Quando("Todos os dados são preenchidos")
	public void todos_os_dados_são_preenchidos() {
		usuario = new Usuario("test@test.com", "123456789", "user_test", "test123", "test123", "testestestesteste");
	}
	@Entao("Um Popup com a mensagem {string} deve ser exibida")
	public void um_popup_com_a_mensagem_deve_ser_exibida(String string) {
		assertEquals("Sending e-mail success!", this.mensagem);
	}
	
	@AfterClass
	private void fim() {
		System.out.println("fim()");
	}
}
