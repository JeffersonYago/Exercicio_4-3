package controller;

public class BinarioController {

	public BinarioController() {
		super();
	}
	public int binario(int a) {
		if (a == 0) {
			return 0;
//para evitar divisão por 0, a chamada da recursiva é interrompida quando "a" chega a zero
		}
		else {
			return (a % 2 + 10 * binario(a / 2)); }
//enquanto for possível, o resto de "a" dividido por 2 é multiplicado pela recursiva 
	}
}
