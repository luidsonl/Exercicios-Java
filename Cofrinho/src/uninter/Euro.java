package uninter;

public class Euro extends Moeda {

	public Euro(double valorMoeda, int ID) {
		super(valorMoeda, ID);
		nomeMoeda = "Euro";	
		}
	
	@Override
	public double converterReal() {
		return valorMoeda* 5.1;
		
	}


}
