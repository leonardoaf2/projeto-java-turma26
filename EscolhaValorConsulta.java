package ConsultasPsicologia;

import java.util.Scanner;

public class EscolhaValorConsulta extends ConsultaValor {
	
	ConsultaValor consultavalor = new ConsultaValor();
	Psicologos psicologos = new Psicologos();	
	
	
	int opcaoValor = 0;
	private double valorEscolhido;
	
	public void escolhavalorConsulta(Scanner leitor) {
		
			
			System.out.println("\nQual faixa de pre�o voc� procura? ");
			opcaoValor = leitor.nextInt();
			
			if(opcaoValor > 4 || opcaoValor < 1) {
				
				System.out.println("Por favor, escolha uma das op��es "
						+ "de pre�o dispon�veis na lista");
				escolhavalorConsulta(leitor);
			} else {
				
				System.out.printf("\n** Voc� escolheu o valor de R$ %.2f **",
				consultavalor.getPrecoConsulta()[opcaoValor-1]);
				
				valorEscolhido = consultavalor.getPrecoConsulta()[opcaoValor-1];
				psicologos.listaPsicologos(opcaoValor,valorEscolhido);
		
			}
			
			}

	public ConsultaValor getConsultavalor() {
		return consultavalor;
	}

	public void setConsultavalor(ConsultaValor consultavalor) {
		this.consultavalor = consultavalor;
	}

	public Psicologos getPsicologos() {
		return psicologos;
	}

	public void setPsicologos(Psicologos psicologos) {
		this.psicologos = psicologos;
	}

	public int getOpcaoValor() {
		return opcaoValor;
	}

	public void setOpcaoValor(int opcaoValor) {
		this.opcaoValor = opcaoValor;
	}

	public double getValorEscolhido() {
		return valorEscolhido;
	}

	public void setValorEscolhido(double valorEscolhido) {
		this.valorEscolhido = valorEscolhido;
	}
	
	

}
