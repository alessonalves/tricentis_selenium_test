package br.com.decision.model;

public class Usuario {
	
	private String email;
	private String phone;
	private String username;
	private String password;
	private String confirm_password;
	private String comments;
	private Usuario usuario;
		
	public Usuario(String email, String phone, String username, String password, String confirm_password,
			String comments) {
		super();
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
		this.confirm_password = confirm_password;
		this.comments = comments;
	}
	
	public void novoUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	 
}
