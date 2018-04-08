package interfacesLTPPANHAN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dao.UsuarioDAO;
import modelo.Usuario;

public class CadastroUsuarioUI {

		public CadastroUsuarioUI() {
			final JFrame frameCadUser = 
					new JFrame("Cadastro de usuário");
			frameCadUser.setSize(800, 600);
			frameCadUser.setLocationRelativeTo(null);
			
			JPanel panel = new JPanel();
			frameCadUser.setContentPane(panel);
			
			JLabel labUsername = new JLabel();
			labUsername.setText("Username : ");
			panel.add(labUsername);

			final JTextField textFieldUsername = new JTextField(15);
			panel.add(textFieldUsername);
			
			JLabel labDat = new JLabel();
			labDat.setText("Data de nascimento : ");
			panel.add(labDat);

			final JTextField textFieldDat = new JTextField(15);
			panel.add(textFieldDat);
			
			JLabel labEmail = new JLabel();
			labEmail.setText("Email : ");
			panel.add(labEmail);
			
			final JTextField textFieldEmail = new JTextField(50);
			panel.add(textFieldEmail);
			
			JLabel labSenha = new JLabel();
			labSenha.setText("Senha : ");
			panel.add(labSenha);
			
			final JTextField textFieldSenha = new JTextField(20);
			panel.add(textFieldSenha);
			
			JLabel labPNome = new JLabel();
			labPNome.setText("Primeiro nome : ");
			panel.add(labPNome);
			
			final JTextField textFieldPNome = new JTextField(20);
			panel.add(textFieldPNome);
			
			JLabel labUNome = new JLabel();
			labUNome.setText("Ultimo nome : ");
			panel.add(labUNome);
			
			final JTextField textFieldUNome = new JTextField(20);
			panel.add(textFieldUNome);
			
			JButton cadButton = new JButton (" Cadastrar! ");
			cadButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				UsuarioDAO usDAO = new UsuarioDAO();
				
				Usuario us = new Usuario();
				us.setUsername(textFieldUsername.getText());
				us.setDataNascimento(textFieldDat.getText());
				us.setEmail(textFieldEmail.getText());
				us.setSenha(textFieldSenha.getText());
				us.setPrimeiroNome(textFieldPNome.getText());
				us.setUltimoNome(textFieldUNome.getText());
				
				try {
					usDAO.insereUsuario(us);
					JLabel labSuc = new JLabel();
					labSuc.setText("Usuário cadastrado com sucesso!");
					panel.add(labSuc);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
			});
			panel.add(cadButton);
		
			JButton cancelButton = new JButton (" Abortar Cadastro ");
			cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frameCadUser.dispose();
			}
			});
			panel.add(cancelButton);
		
			frameCadUser.setVisible(true);
		}
}
