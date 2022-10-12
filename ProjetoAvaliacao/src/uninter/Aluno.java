package uninter;

public class Aluno {
	String nome;
	String curso;
	Avaliacao notas;
	
	
	
	void info() {
		System.out.println("Nome do aluno:" + nome);
		System.out.println("Curso:" + curso);
		System.out.println("Média aritmética:" + notas.mediaAritmetica());
		System.out.println("Média ponderada:" + notas.mediaPonderada());

	}



	public Aluno(String nome, String curso, Avaliacao notas) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}
	
}
