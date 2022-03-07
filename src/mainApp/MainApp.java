package mainApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainApp {
	
	// AGUA 		80,128,142
	// FUEGO		214,0,11
	// TIERRA		95,84,58
	// AIRE			238,246,247
	
	// VAPOR		191,209,229
	// LLUVIA		70,95,158
	// BARRO		113,49,0
	// HUMO			147,149,150
	// LAVA 		255,106,0
	// PLANTA		51,127,43
	// CRISTAL		217,233,255
	// 	ARENA 		214,200,168 
	// CERAMICA 	196,116,97	
	
	private int contador = 0;
	
	private boolean agua;
	private boolean fuego;
	private boolean tierra;
	private boolean aire;
	private boolean vapor;
	private boolean lluvia;
	private boolean barro;
	private boolean humo;
	private boolean lava;
	private boolean planta;
	private boolean cristal;
	private boolean arena;
	private boolean ceramica;
	
	private JFrame frame;
	private JButton btnAgua;
	private JButton btnFuego;
	private JButton btnTierra;
	private JButton btnAire;
	private JButton btnVapor;
	private JButton btnLava;
	private JButton btnArena;
	private JButton btnLluvia;
	private JButton btnHumo;
	private JButton btnBarro;
	private JButton btnCeramica;
	private JButton btnCristal;
	private JButton btnPlanta;
	private JButton btnChuletas;
	private JLabel lblReaccion_1;
	private JLabel lblReaccion_2;
	private JLabel lblReaccion_3;
	private JLabel lblReaccion_4;
	private JPanel panel;
	
	// Setters de los booleanos:
	public boolean isAgua() {
		return agua;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void setAgua(boolean agua) {
		this.agua = agua;
	}

	public boolean isFuego() {
		return fuego;
	}

	public void setFuego(boolean fuego) {
		this.fuego = fuego;
	}

	public boolean isTierra() {
		return tierra;
	}

	public void setTierra(boolean tierra) {
		this.tierra = tierra;
	}

	public boolean isAire() {
		return aire;
	}

	public void setAire(boolean aire) {
		this.aire = aire;
	}

	public boolean isVapor() {
		return vapor;
	}

	public void setVapor(boolean vapor) {
		this.vapor = vapor;
	}

	public boolean isLluvia() {
		return lluvia;
	}

	public void setLluvia(boolean lluvia) {
		this.lluvia = lluvia;
	}

	public boolean isBarro() {
		return barro;
	}

	public void setBarro(boolean barro) {
		this.barro = barro;
	}

	public boolean isHumo() {
		return humo;
	}

	public void setHumo(boolean humo) {
		this.humo = humo;
	}

	public boolean isLava() {
		return lava;
	}

	public void setLava(boolean lava) {
		this.lava = lava;
	}

	public boolean isPlanta() {
		return planta;
	}

	public void setPlanta(boolean planta) {
		this.planta = planta;
	}

	public boolean isCristal() {
		return cristal;
	}

	public void setCristal(boolean cristal) {
		this.cristal = cristal;
	}

	public boolean isArena() {
		return arena;
	}

	public void setArena(boolean arena) {
		this.arena = arena;
	}

	public boolean isCeramica() {
		return ceramica;
	}

	public void setCeramica(boolean ceramica) {
		this.ceramica = ceramica;
	}

	public JButton getBtnAgua() {
		return btnAgua;
	}

	public void setBtnAgua(JButton btnAgua) {
		this.btnAgua = btnAgua;
	}

	public JButton getBtnFuego() {
		return btnFuego;
	}

	public void setBtnFuego(JButton btnFuego) {
		this.btnFuego = btnFuego;
	}

	public JButton getBtnTierra() {
		return btnTierra;
	}

	public void setBtnTierra(JButton btnTierra) {
		this.btnTierra = btnTierra;
	}

	public JButton getBtnAire() {
		return btnAire;
	}

	public void setBtnAire(JButton btnAire) {
		this.btnAire = btnAire;
	}

	public JButton getBtnVapor() {
		return btnVapor;
	}

	public void setBtnVapor(JButton btnVapor) {
		this.btnVapor = btnVapor;
	}

	public JButton getBtnLava() {
		return btnLava;
	}

	public void setBtnLava(JButton btnLava) {
		this.btnLava = btnLava;
	}

	public JButton getBtnArena() {
		return btnArena;
	}

	public void setBtnArena(JButton btnArena) {
		this.btnArena = btnArena;
	}

	public JButton getBtnLluvia() {
		return btnLluvia;
	}

	public void setBtnLluvia(JButton btnLluvia) {
		this.btnLluvia = btnLluvia;
	}

	public JButton getBtnHumo() {
		return btnHumo;
	}

	public void setBtnHumo(JButton btnHumo) {
		this.btnHumo = btnHumo;
	}

	public JButton getBtnBarro() {
		return btnBarro;
	}

	public void setBtnBarro(JButton btnBarro) {
		this.btnBarro = btnBarro;
	}

	public JButton getBtnCeramica() {
		return btnCeramica;
	}

	public void setBtnCeramica(JButton btnCeramica) {
		this.btnCeramica = btnCeramica;
	}

	public JButton getBtnCristal() {
		return btnCristal;
	}

	public void setBtnCristal(JButton btnCristal) {
		this.btnCristal = btnCristal;
	}

	public JButton getBtnPlanta() {
		return btnPlanta;
	}

	public void setBtnPlanta(JButton btnPlanta) {
		this.btnPlanta = btnPlanta;
	}

	public JButton getBtnChuletas() {
		return btnChuletas;
	}

	public void setBtnChuletas(JButton btnChuletas) {
		this.btnChuletas = btnChuletas;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
		botonBlanco();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(221, 216, 196));
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(221, 216, 196));
		panel.setBounds(313, 24, 421, 274);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblReaccion = new JLabel("Fuego x Agua = Vapor     Agua x Tierra = Barro");
		lblReaccion.setHorizontalAlignment(SwingConstants.CENTER);
		lblReaccion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReaccion.setBounds(10, 27, 401, 45);
		panel.add(lblReaccion);
		
		lblReaccion_1 = new JLabel("Agua x Aire = Lluvia     Fuego x Aire = Humo");
		lblReaccion_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblReaccion_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReaccion_1.setBounds(10, 83, 401, 45);
		panel.add(lblReaccion_1);
		
		lblReaccion_2 = new JLabel("Fuego x Tierra = Lava     Fuego x Barro = Cerámica");
		lblReaccion_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblReaccion_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReaccion_2.setBounds(10, 132, 401, 45);
		panel.add(lblReaccion_2);
		
		lblReaccion_3 = new JLabel("Fuego x Arena = Cristal     Aire x Tierra = Arena");
		lblReaccion_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblReaccion_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReaccion_3.setBounds(10, 182, 401, 45);
		panel.add(lblReaccion_3);
		
		lblReaccion_4 = new JLabel("Lluvia x Tierra = Planta");
		lblReaccion_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblReaccion_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblReaccion_4.setBounds(10, 229, 401, 45);
		panel.add(lblReaccion_4);
		frame.setBounds(100, 100, 760, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setVisible(false);
		
		btnAgua = new JButton("Agua");
		btnAgua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAgua.setBackground(new Color(80,128,142));
				agua=true;
				reaccion();
			}
		});
		btnAgua.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnAgua);
		
		btnFuego = new JButton("Fuego");
		btnFuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFuego.setBackground(new Color(214,0,11));
				fuego = true;
				reaccion();
			}
		});
		btnFuego.setBounds(10, 61, 89, 23);
		frame.getContentPane().add(btnFuego);
		
		btnTierra = new JButton("Tierra");
		btnTierra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTierra.setBackground(new Color(95,84,58));
				tierra=true;
				reaccion();
			}
		});
		btnTierra.setBounds(10, 111, 89, 23);
		frame.getContentPane().add(btnTierra);
		
		btnAire = new JButton("Aire");
		btnAire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAire.setBackground(new Color(238,246,255));
				aire=true;
				reaccion();
			}
		});
		btnAire.setBounds(10, 161, 89, 23);
		frame.getContentPane().add(btnAire);
		
		btnVapor = new JButton("Vapor");
		btnVapor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnVapor.setBackground(new Color(191,209,229));
				vapor=true;
				reaccion();
			}
		});
		btnVapor.setBounds(115, 35, 89, 23);
		frame.getContentPane().add(btnVapor);
		
		btnLava = new JButton("Lava");
		btnLava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLava.setBackground(new Color(255,106,0));
				lava=true;
				reaccion();
			}
		});
		btnLava.setBounds(115, 88, 89, 23);
		frame.getContentPane().add(btnLava);
		
		btnArena = new JButton("Arena");
		btnArena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnArena.setBackground(new Color(214,200,168));
				arena=true;
				reaccion();
			}
		});
		btnArena.setBounds(115, 139, 89, 23);
		frame.getContentPane().add(btnArena);
		
		btnLluvia = new JButton("Lluvia");
		btnLluvia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnLluvia.setBackground(new Color(70,95,158));
				lluvia=true;
				reaccion();
			}
		});
		btnLluvia.setBounds(115, 185, 89, 23);
		frame.getContentPane().add(btnLluvia);
		
		btnHumo = new JButton("Humo");
		btnHumo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnHumo.setBackground(new Color(147,149,150));
				humo=true;
				reaccion();
			}
		});
		btnHumo.setBounds(10, 211, 89, 23);
		frame.getContentPane().add(btnHumo);
		
		btnBarro = new JButton("Barro");
		btnBarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnBarro.setBackground(new Color(113,49,0));
				barro=true;
				reaccion();
			}
		});
		btnBarro.setBounds(10, 261, 89, 23);
		frame.getContentPane().add(btnBarro);
		
		btnCeramica = new JButton("Cer\u00E1mica");
		btnCeramica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCeramica.setBackground(new Color(196,116,97));
				ceramica=true;
				reaccion();
			}
		});
		btnCeramica.setBounds(115, 237, 89, 23);
		frame.getContentPane().add(btnCeramica);
		
		btnCristal = new JButton("Cristal");
		btnCristal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCristal.setBackground(new Color(217,233,255));
				cristal=true;
				reaccion();
			}
		});
		btnCristal.setBounds(214, 111, 89, 23);
		frame.getContentPane().add(btnCristal);
		
		btnPlanta = new JButton("Planta");
		btnPlanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPlanta.setBackground(new Color(51,127,43));
				planta=true;
				reaccion();
			}
		});
		btnPlanta.setBounds(214, 161, 89, 23);
		frame.getContentPane().add(btnPlanta);
		
		btnChuletas = new JButton("Chuletas");
		btnChuletas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(!panel.isVisible());
			}
		});
		btnChuletas.setBounds(478, 367, 136, 42);
		frame.getContentPane().add(btnChuletas);
		
		btnLluvia.setVisible(false);
		btnVapor.setVisible(false);
		btnLava.setVisible(false);
		btnHumo.setVisible(false);
		btnArena.setVisible(false);
		btnBarro.setVisible(false);
		btnCeramica.setVisible(false);
		btnCristal.setVisible(false);
		btnPlanta.setVisible(false);
		
		frame.setVisible(true);
	}
	
	public void reaccion() {
		contador++;
		if(agua&&fuego) {
			if(!btnVapor.isVisible()) {
			btnVapor.setVisible(true);
			// JOptionPane.showMessageDialog(frame, "La reacción entre fuego y agua ha creado el botón vapor");
		}
		}
		if(agua&&aire) {
			if(!btnLluvia.isVisible()) {
			btnLluvia.setVisible(true);
			// JOptionPane.showMessageDialog(frame, "La reacción entre agua y aire ha creado el botón lluvia");
			}
		}
		if(agua&&tierra) {
			if(!btnBarro.isVisible()) {
			btnBarro.setVisible(true);
			// JOptionPane.showMessageDialog(frame, "La reacción entre agua y tierra ha creado el botón barro");
			}
		}
		if(fuego&&aire) {
			if(!btnHumo.isVisible()) {
			btnHumo.setVisible(true);
			// JOptionPane.showMessageDialog(frame, "La reacción entre fuego y aire ha creado el botón humo");
			}
		}
		if(fuego&&tierra) {
			if(!btnLava.isVisible()) {
			btnLava.setVisible(true);
			// JOptionPane.showMessageDialog(frame, "La reacción entre fuego y tierra ha creado el botón lava");
			}
		}
		if(tierra&&aire) {
			if(!btnArena.isVisible()) {
			btnArena.setVisible(true);
			// JOptionPane.showMessageDialog(frame, "La reacción entre tierra y aire ha creado el botón arena");
			}
		}
		if(tierra&&lluvia) {
			if(!btnPlanta.isVisible()) {
			btnPlanta.setVisible(true);
			// JOptionPane.showMessageDialog(frame, "La reacción entre tierra y lluvia ha creado el botón planta");
			}
		}
		if(fuego&&barro) {
			if(!btnCeramica.isVisible()) {
			btnCeramica.setVisible(true);
			// JOptionPane.showMessageDialog(frame, "La reacción entre fuego y barro ha creado el botón cerámica");
			}
		}
		if(fuego&&arena) {
			if(!btnCristal.isVisible()) {
			btnCristal.setVisible(true);
			// JOptionPane.showMessageDialog(frame, "La reacción entre fuego y arena ha creado el botón cristal");
			}
		}
		if(contador ==2) {
			contador=0;
			botonBlanco();
			todofalse();
		}
		if(btnCristal.isVisible()&&btnCeramica.isVisible()&&btnPlanta.isVisible()&&btnLava.isVisible()&&btnHumo.isVisible()&&btnVapor.isVisible()) {
			JOptionPane.showMessageDialog(frame, "Has ganado 👍");
		}
	}
	
	public void todofalse() {
		agua=false;
		fuego=false;
		tierra=false;
		aire=false;
		vapor=false;
		lluvia=false;
		barro=false;
		humo=false;
		lava=false;
		planta=false;
		cristal=false;
		arena=false;
		ceramica=false;
	}
	
	public void botonBlanco() {
		btnTierra.setBackground(new Color(240,240,240));
		btnAire.setBackground(new Color(240,240,240));
		btnFuego.setBackground(new Color(240,240,240));
		btnAgua.setBackground(new Color(240,240,240));
		btnArena.setBackground(new Color(240,240,240));
		btnHumo.setBackground(new Color(240,240,240));
		btnLluvia.setBackground(new Color(240,240,240));
		btnVapor.setBackground(new Color(240,240,240));
		btnLava.setBackground(new Color(240,240,240));
		btnBarro.setBackground(new Color(240,240,240));
		btnCeramica.setBackground(new Color(240,240,240));
		btnCristal.setBackground(new Color(240,240,240));
		btnPlanta.setBackground(new Color(240,240,240));
	}
}

