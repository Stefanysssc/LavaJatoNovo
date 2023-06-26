import java.io.PrintStream;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LavaJato {
	private String filas;
	private Double precoLavagem;
	private Cliente cliente;
	private Funcionario funcionario;
	private LocalDate dataInicio;
	private LocalDate dataFinal;

	 
	 public String getFilas() {
		return filas;
	}
	public void setFilas(String filas) {
		this.filas = filas;
	}
	
	public Double getPrecoLavagem() {
		return precoLavagem;
	}
	public void setLavagem(Double precoLavagem) {
		this.precoLavagem = precoLavagem;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
}
	public void imprimirRelatorio(){
		//LocalDateTime dataInicio = getDataFinal;
		
		//System.out.println("veiculo: " + veiculo.getVeiculo());
		System.out.println("nome do Funcionario: " + funcionario.getNome());
		//System.out.println("Inicio  da Lavagem : " + dataInicio.getDataInicio());
		System.out.println("Final da Lavagem: " + DataFinal.getDataFinal());
}
}	



// iniciarLavagem 
// finalizarLavagem -> colocar data fim e imprimir relatorio

// imprimir relatorio -> sysout nos dados da lavage: Veiculo, Nome Funcionario, preco,  data ini, fim, duracao da lavagem