package interfacesLTPPANHAN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modelo.Flashcard;
import modelo.Usuario;

public class CriacaoFlashcardUI {
	
	public CriacaoFlashcardUI(Usuario usuario) {
		final JFrame frameCadFlashcard = new JFrame("Criar Flashcard");
		frameCadFlashcard.setSize(800, 600);
		frameCadFlashcard.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		frameCadFlashcard.setContentPane(panel);
		
		JLabel rotuloNomeFlashcard = new JLabel();
		rotuloNomeFlashcard.setFont("Nome: ");
		
		final JTextField textFieldNome = new JTextField(30);
		panel.add(textFieldNome);
		
		
	}
}
