package br.univel.cadastro.telaLogin;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.Dimension;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.Closeable;

// Implementa o Abstract para conseguir utilizar a tela em outras telas
public abstract class AbstratcPanel extends JPanel {

	private JButton btnFechar;


	//instancia o m�todo abstrado desta forma quem for utilizar dever� implementar para a utiliza��o.
	protected abstract void configuraMiolo();
	
	//Verifica��o se o bot�o de fechar foi pressionado
	public void setCloseAction(ActionListener act){
		btnFechar.addActionListener(act);
	}
	
	
	/**
	 * Create the panel.
	 */
	public AbstratcPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblOl = new JLabel("Ol\u00E1");
		GridBagConstraints gbc_lblOl = new GridBagConstraints();
		gbc_lblOl.anchor = GridBagConstraints.EAST;
		gbc_lblOl.insets = new Insets(0, 0, 0, 5);
		gbc_lblOl.gridx = 0;
		gbc_lblOl.gridy = 0;
		panel.add(lblOl, gbc_lblOl);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		GridBagConstraints gbc_btnFechar = new GridBagConstraints();
		gbc_btnFechar.anchor = GridBagConstraints.EAST;
		gbc_btnFechar.gridx = 1;
		gbc_btnFechar.gridy = 0;
		panel.add(btnFechar, gbc_btnFechar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		add(panel_1, BorderLayout.SOUTH);

		//chama o m�todo
		configuraMiolo();
	}

}
