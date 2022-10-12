package uninter;

public class Principal {

	public static void main(String[] args) {
		Nota luidson = new Nota();
		luidson.setNota1(10);
		luidson.setNota2(9);
		luidson.setFaltas(3);
		
		luidson.resultado();
		
		luidson.setNota1(6);
		luidson.setFaltas(8);
		
		luidson.resultado();
		
		Nota einstein = new Nota(7,6.5,0);
		einstein.resultado();
	}

}
