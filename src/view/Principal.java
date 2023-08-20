package view;

import javax.swing.JOptionPane;

import controller.BinarioController;

public class Principal {

	public static void main(String[] args) {
		BinarioController pc = new BinarioController();
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira um numero para a conversão em binario"));
		System.out.println(a+" em binario = "+pc.binario(a));
	}

}
