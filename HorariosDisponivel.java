package ConsultasPsicologia;

public class HorariosDisponivel {

	private String[] consultaHorario = {"10h00 - Segunda", "11h00 - Ter�a ",
			"12h30 - Quarta", "15h00 - Quinta", "16h00 - Sexta"};  
	
	
	public String[] gethorarios() {
		return consultaHorario;
	}




	public void Horarios() {
		
	System.out.println("\n\nOs horarios dispon�veis para a consulta s�o: ");
		
		for(int i = 0; i < consultaHorario.length; i++)
		{
			
			
			System.out.printf(" \n %d - %s%n ", i+1, consultaHorario[i]);
		}
	}
}