package uninter;

public class Nota {
	private double nota1;
	private double nota2;
	private int faltas;
	
	public Nota() {}
	
	public Nota(double nota1, double nota2, int faltas) {
		setNota1(nota1);
		setNota2(nota2);
		setFaltas(faltas);
	}


	void resultado() {
		double media = (nota1 + nota2)/2;
		System.out.println(media);
		
		if (faltas > 7) {
			System.out.println("Reprovado por faltas");
		}
		
		else if (media < 4) {
			System.out.println("Reprovado");
		}
		else if(media < 7) {
			System.out.println("Exame final");
		}
		else {
			System.out.println("Aprovado");
		}
	}
	
	
	void setNota1(double nota) {
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inválida");
			return;
		}
		nota1 = nota;
	}
	void setNota2(double nota) {
		if(nota < 0 || nota > 10) {
			System.out.println("Nota inválida");
			return;
		}
		nota2 = nota;
	}

	void setFaltas (int faltas) {
		this.faltas = faltas;
		
	}
	
	
	double getNota1(){
		return nota1;
	}
	double getNota2(){
		return nota2;
	}
	int getFaltas() {
		return faltas;
	}
	
}
