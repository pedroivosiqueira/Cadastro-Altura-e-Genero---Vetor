package entities;

public class Main {
	
	private double altura;
	private char genero;
	
	public Main(double altura, Character genero) {
		this.altura = altura;
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getGenenro() {
		return genero;
	}

	public void setGenenro(char genero) {
		this.genero = genero;
	}		
	
}
