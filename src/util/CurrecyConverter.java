package util;

public class CurrecyConverter {
	
	public static final double IOF = 0.06;
	
	public double dollar;
	public double reais;
	
	public double convencao() {
		return dollar * reais + (dollar * reais * IOF) ;
	}

}
