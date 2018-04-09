package interfacesLTPPANHAN;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.*;
import modelo.*;

public class EntrarContaUI {
	
	public EntrarContaUI() {
		final JFrame frameEntrar = new JFrame("Entrar na Conta");
		frameEntrar.setSize(800, 600);
		frameEntrar.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,10,20));
		frameEntrar.setContentPane(panel);
        
		JLabel labUsername = new JLabel();
		labUsername.setText("Username: ");
		
		JLabel labSenha = new JLabel();
		labSenha.setText("Senha: ");

        JTextField textFieldUsername = new JTextField(10);
        JTextField textFieldSenha = new JTextField(10);
		
		labUsername.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        labSenha.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        textFieldUsername.setMaximumSize(new Dimension(400,20));
        textFieldSenha.setMaximumSize(new Dimension(400,20));
        
        JButton cadButton = new JButton ("Entrar");
		cadButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}}
		);
        
        panel.add(labUsername);
		panel.add(textFieldUsername);
		panel.add(Box.createRigidArea(new Dimension(500,10)));
        panel.add(labSenha);
		panel.add(textFieldSenha);
		
		frameEntrar.setVisible(true);
	}
}
