package view;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.EnviarController;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;

public class EnviarView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textSerial;
	private JTextField textPatrimonio;
	private JTextField textIdade;
	private JTextField textData;
	private JTextField textValor;
	private JTextField textNF;
	private JTextField textResponsavel;
	private JTextField textOS;
	private JTextField textProblema;
	private JCheckBox chckbxNewCheckBox;
	private JButton btnNewButton;
	private JComboBox comboBox;
	public JCheckBox getChckbxNewCheckBox() {
		return chckbxNewCheckBox;
	}

	public void setChckbxNewCheckBox(JCheckBox chckbxNewCheckBox) {
		this.chckbxNewCheckBox = chckbxNewCheckBox;
	}

	


	private EnviarController controller;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	
	public void exibeMensagem(String msg) {
		JOptionPane.showMessageDialog(null,msg);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnviarView frame = new EnviarView();
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
	public EnviarView() {
		controller = new EnviarController(this);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 645, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textSerial = new JTextField();
		textSerial.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					textPatrimonio.requestFocus();
				}
			}
		});
		textSerial.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("serial number");
		
		JLabel lblNewLabel_1 = new JLabel("patrim\u00F4nio");
		
		textPatrimonio = new JTextField();
		textPatrimonio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					textIdade.requestFocus();
				}
			}
		});
		textPatrimonio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("idade");
		lblNewLabel_2.setToolTipText("");
		
		textIdade = new JTextField();
		textIdade.setText("01/01/2000");
		textIdade.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					comboBox.requestFocus();
				}
			}
		});
		textIdade.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("modelo");
		
		JLabel lblNewLabel_4 = new JLabel("empresa");
		
		JLabel lblNewLabel_5 = new JLabel("prestador");
		
		JLabel lblNewLabel_6 = new JLabel("data ocorrencia");
		
		textData = new JTextField();
		textData.setText("01/01/2020");
		textData.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					textValor.requestFocus();
				}
			}
		});
		textData.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("valor");
		
		textValor = new JTextField();
		textValor.setText("0,00");
		textValor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					textNF.requestFocus();
				}
			}
		});
		textValor.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("NF");
		
		textNF = new JTextField();
		textNF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					textResponsavel.requestFocus();
				}
			}
		});
		textNF.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("respons\u00E1vel");
		
		textResponsavel = new JTextField();
		textResponsavel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					textOS.requestFocus();
				}
			}
		});
		textResponsavel.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("OS");
		
		textOS = new JTextField();
		textOS.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					textProblema.requestFocus();
				}
			}
		});
		textOS.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("problema");
		
		textProblema = new JTextField();
		textProblema.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					btnNewButton.requestFocus();
				}
			}
		});
		textProblema.setColumns(10);
		
		chckbxNewCheckBox = new JCheckBox("com fonte?");
		
		JLabel lblNewLabel_12 = new JLabel("tipo");
		
		btnNewButton = new JButton("enviar");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					controller.lerDados();
					controller.comboBoxTipo();
					controller.comboBoxEmpresa();
					controller.comboBoxPrestador();
					controller.comboBoxModelo();
				}
			}			
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.lerDados();
			}
		});
		
		JLabel lblNewLabel_13 = new JLabel("R$");
		
		comboBox = new JComboBox();
		comboBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					comboBox_1.requestFocus();
				}
			}
		});
		comboBox.setEditable(true);
		controller.comboBoxModelo();
		
		comboBox_1 = new JComboBox();
		comboBox_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					comboBox_2.requestFocus();
				}
			}
		});
		comboBox_1.setEditable(true);
		controller.comboBoxEmpresa();
		
		comboBox_2 = new JComboBox();
		comboBox_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					comboBox_3.requestFocus();
				}
			}
		});
		comboBox_2.setEditable(true);
		controller.comboBoxTipo();
		
		comboBox_3 = new JComboBox();
		comboBox_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER) {
					textData.requestFocus();
				}
			}
		});
		comboBox_3.setEditable(true);
		controller.comboBoxPrestador();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_9)
								.addComponent(textResponsavel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel)
										.addComponent(lblNewLabel_5)
										.addComponent(comboBox_1, 0, 0, Short.MAX_VALUE)
										.addComponent(textSerial)
										.addComponent(comboBox_3, 0, 0, Short.MAX_VALUE))
									.addGap(98)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textPatrimonio)
										.addComponent(lblNewLabel_1)
										.addComponent(textData)
										.addComponent(lblNewLabel_10)
										.addComponent(textOS)
										.addComponent(lblNewLabel_12)
										.addComponent(comboBox_2, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
										.addComponent(lblNewLabel_6))))
							.addGap(57)
							.addComponent(lblNewLabel_13)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_11)
									.addContainerGap())
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(chckbxNewCheckBox)
										.addContainerGap())
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(textProblema, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblNewLabel_2)
													.addComponent(textIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_7)
													.addComponent(textValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
													.addComponent(textNF)
													.addComponent(lblNewLabel_3)
													.addComponent(lblNewLabel_8)
													.addComponent(comboBox, 0, 0, Short.MAX_VALUE)))
											.addComponent(btnNewButton))
										.addGap(62)))))
						.addComponent(lblNewLabel_4)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textSerial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPatrimonio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_12))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(chckbxNewCheckBox)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_7)
						.addComponent(lblNewLabel_8)
						.addComponent(lblNewLabel_6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_13)
						.addComponent(textNF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(53)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(lblNewLabel_10)
						.addComponent(lblNewLabel_11))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textResponsavel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textOS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textProblema, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(btnNewButton)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JTextField getTextResponsavel() {
		return textResponsavel;
	}

	public void setTextResponsavel(JTextField textResponsavel) {
		this.textResponsavel = textResponsavel;
	}

	public JTextField getTextSerial() {
		return textSerial;
	}

	public void setTextSerial(JTextField textSerial) {
		this.textSerial = textSerial;
	}

	public JTextField getTextPatrimonio() {
		return textPatrimonio;
	}

	public void setTextPatrimonio(JTextField textPatrimonio) {
		this.textPatrimonio = textPatrimonio;
	}

	public JTextField getTextIdade() {
		return textIdade;
	}

	public void setTextIdade(JTextField textIdade) {
		this.textIdade = textIdade;
	}


	

	public JComboBox getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public JComboBox getComboBox_2() {
		return comboBox_2;
	}

	public void setComboBox_2(JComboBox comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	public JComboBox getComboBox_3() {
		return comboBox_3;
	}

	public void setComboBox_3(JComboBox comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	public JTextField getTextData() {
		return textData;
	}

	public void setTextData(JTextField textData) {
		this.textData = textData;
	}

	public JTextField getTextValor() {
		return textValor;
	}

	public void setTextValor(JTextField textValor) {
		this.textValor = textValor;
	}

	public JTextField getTextNF() {
		return textNF;
	}

	public void setTextNF(JTextField textNF) {
		this.textNF = textNF;
	}

	public JTextField getTextOS() {
		return textOS;
	}

	public void setTextOS(JTextField textOS) {
		this.textOS = textOS;
	}

	public JTextField getTextProblema() {
		return textProblema;
	}

	public void setTextProblema(JTextField textProblema) {
		this.textProblema = textProblema;
	}

	
}
