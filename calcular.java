package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

public class calcular {

	private JFrame frame;
	private JTextField Importe;
	private JTextField TituloPrograma;
	private JTextField PropinaDato;
	private JTextField ImporteCompletoDato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcular window = new calcular();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public calcular() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setBounds(new Rectangle(5, 0, 0, 0));
		frame.setAutoRequestFocus(false);
		frame.setBounds(100, 100, 371, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Importe = new JTextField();
		Importe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Importe.setText("");
			}
		});
		Importe.setHorizontalAlignment(SwingConstants.CENTER);
		Importe.setText("Ingresa importe aqui...");
		Importe.setToolTipText("");
		Importe.setBounds(10, 84, 335, 49);
		frame.getContentPane().add(Importe);
		Importe.setColumns(10);
		
		JButton BotonReinicio = new JButton("Reiniciar");
		BotonReinicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});


		BotonReinicio.setBounds(211, 378, 134, 23);
		frame.getContentPane().add(BotonReinicio);
		BotonReinicio.setForeground(new Color(0, 0, 0));
		
				
				JLabel TituloImportedeCuenta = new JLabel("Importe de la cuenta:");
				TituloImportedeCuenta.setHorizontalAlignment(SwingConstants.CENTER);
				TituloImportedeCuenta.setBounds(10, 47, 335, 36);
				frame.getContentPane().add(TituloImportedeCuenta);
				TituloImportedeCuenta.setMinimumSize(new Dimension(100, 14));
				TituloImportedeCuenta.setMaximumSize(new Dimension(100, 14));
				
				TituloPrograma = new JTextField();
				TituloPrograma.setForeground(new Color(255, 255, 255));
				TituloPrograma.setBackground(new Color(0, 0, 0));
				TituloPrograma.setFont(new Font("Times New Roman", Font.BOLD, 15));
				TituloPrograma.setHorizontalAlignment(SwingConstants.CENTER);
				TituloPrograma.setText("CALCULADORA DE PROPINAS");
				TituloPrograma.setBounds(0, 0, 355, 36);
				frame.getContentPane().add(TituloPrograma);
				TituloPrograma.setColumns(10);
				
				PropinaDato = new JTextField();
				PropinaDato.setHorizontalAlignment(SwingConstants.CENTER);
				PropinaDato.setEditable(false);
				PropinaDato.setBounds(10, 282, 134, 85);
				frame.getContentPane().add(PropinaDato);
				PropinaDato.setColumns(10);
				
				ImporteCompletoDato = new JTextField();
				ImporteCompletoDato.setHorizontalAlignment(SwingConstants.CENTER);
				ImporteCompletoDato.setEditable(false);
				ImporteCompletoDato.setBounds(211, 282, 134, 85);
				frame.getContentPane().add(ImporteCompletoDato);
				ImporteCompletoDato.setColumns(10);
				
				JLabel TituloPropina = new JLabel("Propina");
				TituloPropina.setHorizontalAlignment(SwingConstants.CENTER);
				TituloPropina.setBounds(10, 258, 134, 23);
				frame.getContentPane().add(TituloPropina);
				
				JLabel TituloImporteFinal = new JLabel("Importe completo");
				TituloImporteFinal.setHorizontalAlignment(SwingConstants.CENTER);
				TituloImporteFinal.setBounds(211, 258, 134, 23);
				frame.getContentPane().add(TituloImporteFinal);
				
				JButton CalcularPropina5 = new JButton("5%");
				CalcularPropina5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Calculadora(CalcularPropina5.getText());
					}
				});
				CalcularPropina5.setBounds(10, 175, 134, 36);
				frame.getContentPane().add(CalcularPropina5);
				
				JButton CalcularPropina10 = new JButton("10%");
				CalcularPropina10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Calculadora(CalcularPropina10.getText());
					}
				});
				CalcularPropina10.setBounds(10, 222, 134, 36);
				frame.getContentPane().add(CalcularPropina10);
				
				JButton CalcularPropina15 = new JButton("15%");
				CalcularPropina15.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Calculadora(CalcularPropina15.getText());
					}
				});
				CalcularPropina15.setBounds(211, 175, 134, 36);
				frame.getContentPane().add(CalcularPropina15);
				
				JButton CalcularPropina20 = new JButton("20%");
				CalcularPropina20.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Calculadora(CalcularPropina20.getText());
					}
				});
				CalcularPropina20.setBounds(211, 222, 134, 36);
				frame.getContentPane().add(CalcularPropina20);
				
				JLabel SeleccionTitulo = new JLabel("Cuanta propina desea dar");
				SeleccionTitulo.setMinimumSize(new Dimension(100, 14));
				SeleccionTitulo.setMaximumSize(new Dimension(100, 14));
				SeleccionTitulo.setHorizontalAlignment(SwingConstants.CENTER);
				SeleccionTitulo.setBounds(10, 138, 335, 36);
				frame.getContentPane().add(SeleccionTitulo);
				
					}
				
				private void reiniciar() {
					Importe.setText("Ingrese importe aqui...");
					PropinaDato.setText(" ");
					ImporteCompletoDato.setText(" ");
					
				}	
				private void Calculadora(String propinaElegida) {
					try {
					double importe = Double.parseDouble(Importe.getText().replace(",","."));
					double propinaBruto = Double.parseDouble(propinaElegida.replace("%", "")) /100.0;
					
					double propina = importe * propinaBruto;
					double PrecioTotal = importe + propina;
					
					DecimalFormat df = new DecimalFormat("#0.00");
					
					ImporteCompletoDato.setText(df.format(PrecioTotal) + " €");
					PropinaDato.setText(df.format(propina) + " €");
					
					} catch (Exception e) {
						reiniciar();
					}
					
				}
				
			}

