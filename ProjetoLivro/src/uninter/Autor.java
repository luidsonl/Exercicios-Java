package uninter;

public class Autor {
	private String nome;
	private String nacionalidade;
	private String email;
	
	
	public Autor(String nome,  String nacionalidade, String email) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.email = email;
	}
	
	public Autor () {}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void info() {
		System.out.println("Nome do Autor: " + nome);
		System.out.println("Nacionalidade do Autor: " + nacionalidade);
		System.out.println("Email do Autor: "+ email);
	}
}
	