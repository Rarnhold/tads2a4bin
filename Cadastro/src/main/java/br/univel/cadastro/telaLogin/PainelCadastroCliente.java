package br.univel.cadastro.telaLogin;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

public class PainelCadastroCliente extends JPanel {
	protected JTextField txfId;
	protected JTextField txfNome;
	protected JTextField txfEndereco;
	protected JTextField txtTelefone;
	protected JTextField txtCidade;
	protected JTextField txtUF;
	private JLabel lblTelefone;
	private JLabel lblCidade;
	private JLabel lblUF;

	/**
	 * Create the panel.
	 */
	public PainelCadastroCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("Id");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		add(lblId, gbc_lblId);
		
		txfId = new JTextField();
		GridBagConstraints gbc_txfId = new GridBagConstraints();
		gbc_txfId.insets = new Insets(0, 0, 5, 0);
		gbc_txfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txfId.gridx = 1;
		gbc_txfId.gridy = 0;
		add(txfId, gbc_txfId);
		txfId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		add(lblNome, gbc_lblNome);
		
		txfNome = new JTextField();
		GridBagConstraints gbc_txfNome = new GridBagConstraints();
		gbc_txfNome.insets = new Insets(0, 0, 5, 0);
		gbc_txfNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txfNome.gridx = 1;
		gbc_txfNome.gridy = 1;
		add(txfNome, gbc_txfNome);
		txfNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		GridBagConstraints gbc_lblEndereco = new GridBagConstraints();
		gbc_lblEndereco.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereco.gridx = 0;
		gbc_lblEndereco.gridy = 2;
		add(lblEndereco, gbc_lblEndereco);
		
		txfEndereco = new JTextField();
		GridBagConstraints gbc_txfEndereco = new GridBagConstraints();
		gbc_txfEndereco.insets = new Insets(0, 0, 5, 0);
		gbc_txfEndereco.fill = GridBagConstraints.HORIZONTAL;
		gbc_txfEndereco.gridx = 1;
		gbc_txfEndereco.gridy = 2;
		add(txfEndereco, gbc_txfEndereco);
		txfEndereco.setColumns(10);
		
		lblTelefone = new JLabel("Telefone");
		GridBagConstraints gbc_lblTelefone = new GridBagConstraints();
		gbc_lblTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefone.gridx = 0;
		gbc_lblTelefone.gridy = 3;
		add(lblTelefone, gbc_lblTelefone);
		
		txtTelefone = new JTextField();
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.insets = new Insets(0, 0, 5, 0);
		gbc_txtTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefone.gridx = 1;
		gbc_txtTelefone.gridy = 3;
		add(txtTelefone, gbc_txtTelefone);
		txtTelefone.setColumns(10);
		
		lblCidade = new JLabel("Cidade");
		GridBagConstraints gbc_lblCidade = new GridBagConstraints();
		gbc_lblCidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblCidade.gridx = 0;
		gbc_lblCidade.gridy = 4;
		add(lblCidade, gbc_lblCidade);
		
		txtCidade = new JTextField();
		GridBagConstraints gbc_txtCidade = new GridBagConstraints();
		gbc_txtCidade.insets = new Insets(0, 0, 5, 0);
		gbc_txtCidade.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCidade.gridx = 1;
		gbc_txtCidade.gridy = 4;
		add(txtCidade, gbc_txtCidade);
		txtCidade.setColumns(10);
		
		lblUF = new JLabel("UF");
		GridBagConstraints gbc_lblUF = new GridBagConstraints();
		gbc_lblUF.insets = new Insets(0, 0, 0, 5);
		gbc_lblUF.gridx = 0;
		gbc_lblUF.gridy = 5;
		add(lblUF, gbc_lblUF);
		
		txtUF = new JTextField();
		GridBagConstraints gbc_txtUF = new GridBagConstraints();
		gbc_txtUF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUF.gridx = 1;
		gbc_txtUF.gridy = 5;
		add(txtUF, gbc_txtUF);
		txtUF.setColumns(10);

	}

}
