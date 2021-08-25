package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;


public class ResolucaoTela {

	public static void main(String[] args) {
		
	// metodo para imprimir resolu��o de tela
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		Dimension d = tk.getScreenSize();
		
		System.out.println("A sua tela tem resolu��o " +d.width + " x " +d.height);

		// Idioma utilizado no SO
		Locale idioma = Locale.getDefault();
		
		System.out.print("O idioma do seu sistema est� configurado para: ");
		
		System.out.println(idioma.getDisplayLanguage());

	}

}
