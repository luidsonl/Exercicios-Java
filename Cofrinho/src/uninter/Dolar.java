package uninter;

public class Dolar extends Moeda {
	
	public Dolar(double valorMoeda, int ID) {
		super(valorMoeda, ID);
		nomeMoeda = "Dolar";
	}
	
	@Override
	public double converterReal() {
		return valorMoeda* 5.2;
		
	}

}
