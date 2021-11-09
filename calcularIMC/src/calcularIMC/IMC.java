package calcularIMC;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		String peso = JOptionPane.showInputDialog("Qual seu peso em quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual sua altura em metros?");
		
		double pesoEmQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilogramas / (alturaEmMetros *  alturaEmMetros);
		String mensagem = "";
		
		if(imc < 20)
		{
			mensagem = "Abaixo do peso!";
		}
		else if(imc >= 20 && imc < 25)
		{
			mensagem = "Peso Ideal";
		}
		else if(imc >= 25 && imc < 30)
		{
			mensagem = "Sobrepeso";
		}
		else if(imc >= 30 && imc < 35)
		{
			mensagem = "Obesidade Moderada";
		}
		else if(imc >= 35 && imc < 40)
		{
			mensagem = "Obesidade Severa";
		}
		else if(imc >= 40 && imc < 50)
		{
			mensagem = "Obesidade Mórbida";
		}
		else
		{
			mensagem = "Super Obesidade";
		}
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
