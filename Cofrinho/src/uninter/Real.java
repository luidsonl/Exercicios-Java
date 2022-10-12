package uninter;

public class Real extends Moeda{
	
	public Real(double valorMoeda, int ID) {
		super(valorMoeda, ID);
		nomeMoeda = "Real";
	}

	@Override
	public double converterReal() {
		return valorMoeda;
		
	}
}