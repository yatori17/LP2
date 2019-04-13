package lpg16.Exc;
public class LivroNaoCadastradoEx extends Exception{
	public LivroNaoCadastradoEx(String key){
		super("Livro de chave "+key+" nao cadastrado!");
	}
}
