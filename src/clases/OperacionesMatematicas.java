package clases;

public class OperacionesMatematicas {

	public int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	public int restar(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public String dividir(int num1, int num2) {
		double div=0;
		if (num2!=0) {
			div = num1*1.0 / num2*1.0;
			return div+"";
		} else {
			return "ERROR, No se puede dividir entre 0";
		}
	}
}
