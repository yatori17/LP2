package lpg16.Exc;
public class LimiteDeEmprestimosPorUsuarioEx extends Exception{
	public LimiteDeEmprestimosPorUsuarioEx(){
		super("O Usuario passou do limite de emprestimos, que eh 2 emprestimos por usuario");
	}
}
