package br.univel.cadastro.telaLogin;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TelaCadastroCliente extends AbstratcPanel {

	/**
	 * Create the panel.
	 */
	public TelaCadastroCliente() {
		super();
	}

	@Override
	protected void configuraMiolo() {
		super.add(new PainelCadastroCliente(),BorderLayout.CENTER);
	}

}
