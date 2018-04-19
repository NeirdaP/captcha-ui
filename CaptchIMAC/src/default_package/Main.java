package default_package;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import fr.upem.captcha.images.*;
import fr.upem.captcha.images.panneaux.*;
import fr.upem.captcha.images.panneaux.ronds.*;
import fr.upem.captcha.images.ponts.*;
import fr.upem.captcha.images.ville.*;

public class Main {

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame("CapchImac"); // Création de la fenêtre principale
		
		GridLayout layout = Fenetre.createLayout();  // Création d'un layout de type Grille avec 4 lignes et 3 colonnes
		
		frame.setLayout(layout);  // affection du layout dans la fenêtre.
		frame.setSize(1024, 768); // définition de la taille
		frame.setResizable(false);  // On définit la fenêtre comme non redimentionnable
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Lorsque l'on ferme la fenêtre on quitte le programme.
		 
		
		JButton okButton = Fenetre.createOkButton();

		frame.add(Fenetre.createLabelImage("CaptchIMAC\\src\\fr\\upem\\captcha\\images\\panneaux\\panneau_rectangulaire_1.png"));

			
		frame.add(new JTextArea("Cliquez n'importe ou ... juste pour tester l'interface !"));
		
		
		frame.add(okButton);
		
		frame.setVisible(true);
	}
}

