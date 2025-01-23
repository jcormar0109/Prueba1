package gui;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.OperacionesMatematicas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaOperaciones extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	private final JLabel lblTitulo = new JLabel("OPERACIONES MATEMATICAS");
	private JTextField textNum1;
	private JTextField textNum2;
	private JButton btnSumar;
	private JButton btnRestar;
	private JButton btnMultiplicar;
	private JButton btnDividir;
	private JLabel lblResultado;
	
	OperacionesMatematicas misOperaciones;
	/**
	 * Create the frame.
	 */
	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setTitle("OPERACIONES MATEMATICAS");
		setResizable(false);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
	}
		
	private void iniciarComponentes() {
			setBounds(100, 100, 319, 454);
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(panelPrincipal);
			panelPrincipal.setLayout(null);
			
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setFont(new Font("Ramaraja", Font.BOLD, 18));
			lblTitulo.setBounds(22, 0, 258, 32);
			panelPrincipal.add(lblTitulo);
			
			textNum1 = new JTextField();
			textNum1.setBounds(166, 75, 114, 19);
			panelPrincipal.add(textNum1);
			textNum1.setColumns(10);
			
			textNum2 = new JTextField();
			textNum2.setColumns(10);
			textNum2.setBounds(166, 149, 114, 19);
			panelPrincipal.add(textNum2);
			
			JLabel lblNum1 = new JLabel("Numero 1");
			lblNum1.setBounds(66, 77, 70, 15);
			panelPrincipal.add(lblNum1);
			
			JLabel lblNum2 = new JLabel("Numero 2");
			lblNum2.setBounds(66, 151, 70, 15);
			panelPrincipal.add(lblNum2);
			
			btnSumar = new JButton("SUMAR");
			btnSumar.addActionListener(this);
			/*btnSumar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Has pulsado el boton de sumar");
				}
			});*/
			btnSumar.setBounds(22, 204, 114, 25);
			panelPrincipal.add(btnSumar);
			
			btnRestar = new JButton("RESTAR");
			btnRestar.addActionListener(this);
			btnRestar.setBounds(165, 204, 115, 25);
			panelPrincipal.add(btnRestar);
			
			btnMultiplicar = new JButton("MULTIPLICAR");
			btnMultiplicar.addActionListener(this);
			btnMultiplicar.setBounds(22, 267, 114, 25);
			panelPrincipal.add(btnMultiplicar);
			
			btnDividir = new JButton("DIVIDIR");
			btnDividir.addActionListener(this);
			btnDividir.setBounds(165, 267, 115, 25);
			panelPrincipal.add(btnDividir);
			
			lblResultado = new JLabel("");
			lblResultado.setBounds(22, 331, 258, 32);
			panelPrincipal.add(lblResultado);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (btnSumar == e.getSource()) {
			int num1 = Integer.parseInt(textNum1.getText());
			int num2 = Integer.parseInt(textNum2.getText());
			int resp = misOperaciones.sumar(num1,num2);
			lblResultado.setText("La suma es: " + resp);
		}
		
		if (btnRestar == e.getSource()) {
			int num1 = Integer.parseInt(textNum1.getText());
			int num2 = Integer.parseInt(textNum2.getText());
			int resp = misOperaciones.restar(num1,num2);
			lblResultado.setText("La resta es: " + resp);
		}
		
		if (btnMultiplicar == e.getSource()) {
			int num1 = Integer.parseInt(textNum1.getText());
			int num2 = Integer.parseInt(textNum2.getText());
			int resp = misOperaciones.multiplicar(num1,num2);
			lblResultado.setText("La multiplicacion es: " + resp);
		}
		
		if (btnDividir == e.getSource()) {
			int num1 = Integer.parseInt(textNum1.getText());
			int num2 = Integer.parseInt(textNum2.getText());
			String resp = misOperaciones.dividir(num1,num2);
			lblResultado.setText("La division es: " + resp);
		}
	}

	public void asignarOperaciones(OperacionesMatematicas misOperaciones) {
		// TODO Auto-generated method stub
		this.misOperaciones = misOperaciones;
	}
}
