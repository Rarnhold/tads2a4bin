package br.univel;

import java.util.HashMap;
import java.util.Map;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class SimpleReport {

	private String arq = "C:\\Users\\Arnhold\\JaspersoftWorkspace\\MyReports\\simples.jasper";
						  
	public SimpleReport() {

		TableModel tableModel = TableModelData();

		// JasperPrint é o responsavel pela impressao no relatorio
		JasperPrint jasperPrint = null;

		TableModelData();

		try {

			// Implementando variavel para parâmetro
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("empresa", "Nome Da Empresa");
			map.put("telefone", "Telefone da Empresa");

			// linha que preenche o relatório (nome ARQ = arquivo de relatório
			jasperPrint = JasperFillManager.fillReport(arq, null,
					new JRTableModelDataSource(tableModel));
			JasperViewer jasperViewer = new JasperViewer(jasperPrint);
			jasperViewer.setVisible(true);
		} catch (JRException ex) {
			ex.printStackTrace();
		}
	}

	//
	private TableModel TableModelData() {
		// cria vetor de colunas
		String[] columnNames = { "Id", "Nome", "Departamento", "Email" };

		// cria vertor de dados
		String[][] data = { 
				{ "1", "Hugo", "Financeiro", "hugod@univel.br" },
				{ "2", "José", "Comercial", "josed@univel.br" },
				{ "3", "Luiz", "Contábil", "luizd@univel.br" } };

		return new DefaultTableModel(data, columnNames);
	}

	public static void main(String[] args) {
		new SimpleReport();
	}
}