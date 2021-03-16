package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtEscribeTuNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Juan fran");
		lblNombre.setBounds(134, 61, 86, 27);
		contentPane.add(lblNombre);
		
		txtEscribeTuNombre = new JTextField();
		txtEscribeTuNombre.setText("Escribe tu nombre");
		txtEscribeTuNombre.setBounds(123, 100, 165, 19);
		contentPane.add(txtEscribeTuNombre);
		txtEscribeTuNombre.setColumns(10);
		
		JButton btnNombre = new JButton("Enviar");
		btnNombre.addMouseListener(new BtnNombreMouseListener());
		btnNombre.setBounds(300, 97, 117, 25);
		contentPane.add(btnNombre);
	}
	private class BtnNombreMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			String nombre= "";
		}
	}
}
