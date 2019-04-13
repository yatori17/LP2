import java.util.Hashtable;
import lpg16.Exc.*;
import lpg16.biblioteca.*;
import java.io.*;
public class Principal implements Serializable{
public static Biblioteca a=new Biblioteca();
public static void Manutencao(String file1,String file2){
	if(FileExists(file1) && FileExists(file2)) a=new Biblioteca(file1,file2);
	else System.out.println("Verifique o nome dos arquivos e tente novamente!");
}
public static boolean FileExists(String a){
	try{
		FileInputStream input=new FileInputStream(a);
		input.close();
		return true;
	}catch(FileNotFoundException e){System.out.println("Arquivo "+a+" nao encontrado!");return false;}
	catch(IOException e){ System.out.println("Verifique os dados e tente novamente"); return false;}
}
	
public static boolean isNumeric(String b){
	try{
		Integer.parseInt(b);
		if(Integer.parseInt(b)>=0)return true;
		else{System.out.println("Numero negativo!\nTente com numero positivo"); return false;}
	}catch(NumberFormatException e){
		System.out.println("Formato errado, verifique se sua entrada eh um inteiro");
		return false;
}
}
public static boolean isNumeric1(String b){
	try{
		Integer.parseInt(b);
		return true;
	}catch(NumberFormatException e){
		System.out.println("Formato errado, verifique se sua entrada eh um inteiro");
		return false;
}
}
public static boolean EUser(int cod){
	try{
		a.getUsuario(cod);
		return true;
	}catch(UsuarioNaoCadastradoEx e){
		return false;
}
}
public static boolean array(String a){
	try{
		String now[]=a.split("/");
		String aux[]=new String[3];
		aux[0]=now[0];aux[1]=now[1];aux[2]=now[2];
		return true;
	}catch(ArrayIndexOutOfBoundsException e){System.out.println("Formato invalido, certifique-se de colocar a data nesse exato formato");return false;}
}
public static boolean EBook(String cod){
	try{
		a.getLivro(cod);
		return true;
	}catch(LivroNaoCadastradoEx e){
		return false;
}
}
public static void Cadastro()throws IOException{
	String line;
	BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Digite 1 para cadastrar usuario:");
	System.out.println("Digite 2 para cadastrar livro:");
	System.out.println("Digite 3 para salvar em arquivo:");
	System.out.println("Digite qualquer numero para sair do menu Cadastro:");
	line=data.readLine();
	while(!isNumeric(line)){
		System.out.println("Digite 1 para cadastrar usuario:");
		System.out.println("Digite 2 para cadastrar livro:");
		System.out.println("Digite 3 para salvar em arquivo:");
		System.out.println("Digite qualquer numero para sair do menu Cadastro:");
		line=data.readLine();
	}
	if(Integer.parseInt(line)==1){
		boolean aux=true;
		boolean aux1=true;
		System.out.println("=====================================Cadastro de Usuario=====================================");
		System.out.println("Digite o nome do Usuario:");
		String name=data.readLine();
		System.out.println("Digite a data de nascimento do usuario(DD/MM/AAAA):");
		line=data.readLine();
		String nasc[]=line.split("/");
		if(array(line)){
			while(!isNumeric(nasc[0]) || !isNumeric(nasc[1]) || !isNumeric(nasc[2])){
				System.out.println("Digite a data de nascimento do usuario(DD/MM/AAAA):");
				System.out.println("Lembre-se q a data deve ser valida, ex: 17/09/1996 ou 1/3/2000");
				line=data.readLine();
				String novo[]=line.split("/");
				nasc=novo;
				}
			}
		else{
			while(!array(line)){
				System.out.println("Digite a data no formato(DD/MM/AAAA):");
				line=data.readLine();
				nasc=line.split("/");
				if(array(line)){
					while(!isNumeric(nasc[0]) || !isNumeric(nasc[1]) || !isNumeric(nasc[2])){
					System.out.println("Digite a data de nascimento do usuario(DD/MM/AAAA):");
					System.out.println("Lembre-se q a data deve ser valida, ex: 17/09/1996 ou 1/3/2000");
					line=data.readLine();
					String novo[]=line.split("/");
					nasc=novo;
				}
			}
		}
				
		}
		while(aux){
			if(Integer.parseInt(nasc[0])<=31 && Integer.parseInt(nasc[1])<=12 && Integer.parseInt(nasc[2])<2018) aux=false;
			else{
				System.out.println("Lembre-se q a data deve ser valida, ex: 17/09/1996 ou 1/3/2000");
				System.out.println("Digite a data de nascimento do usuario(DD/MM/AAAA):");
				line=data.readLine();
				nasc=line.split("/");
				while(!isNumeric(nasc[0]) || !isNumeric(nasc[1]) || !isNumeric(nasc[2])){
					System.out.println("Digite a data de nascimento do usuario(DD/MM/AAAA):");
					line=data.readLine();
					String novo[]=line.split("/");
					nasc=novo;
				}
			}
		}
		int dia=Integer.parseInt(nasc[0]);
		int mes=Integer.parseInt(nasc[1]);
		int ano=Integer.parseInt(nasc[2]);
		System.out.println("Digite o endereco:");
		String end=data.readLine();
		System.out.println("Digite o codigo do usuario(Lembre-se que nao se pode ter mais de um usuario com o mesmo codigo):");
		line=data.readLine();		
		while(!isNumeric1(line)){
			System.out.println("Digite o codigo do usuario(Lembre-se que nao se pode ter mais de um usuario com o mesmo codigo):");
			line=data.readLine();
		}
		while(aux1){
			int aux2=Integer.parseInt(line);
			if(EUser(aux2)){
				System.out.println("COdigo ja utilizado no cadastro, tente outro codigo!");
				System.out.println("Digite o codigo do usuario(Lembre-se que nao se pode ter mais de um usuario com o mesmo codigo):");
				line=data.readLine();
				while(!isNumeric(line)){
					System.out.println("Digite o codigo do usuario(Lembre-se que nao se pode ter mais de um usuario com o mesmo codigo):");
					line=data.readLine();
				}
			}else aux1=false;
		}
		int cod=Integer.parseInt(line);
		Usuario novo=new Usuario(name,dia,mes,ano,end,cod);
		a.cadastraUsuario(novo);
		System.out.println("Cadastro realizado com sucesso!");
	}
	else if(Integer.parseInt(line)==2){
System.out.println("=====================================Cadastro Livro=====================================");
		System.out.println("Digite o codigo do livro:");
		String codl=data.readLine();
		while(EBook(codl)){
			System.out.println("Livro com mesmo codigo cadastrado, por favor, insira outro codigo!");
			codl=data.readLine();
		}
		System.out.println("Digite o titulo do livro");
		String title=data.readLine();
		System.out.println("Digite a categoria do livro:");
		String cat=data.readLine();
		System.out.println("Digite a quantidade desse exemplar:");
		String q=data.readLine();
		while(!isNumeric(q)){
			System.out.println("Digite a quantidade desse exemplar:");
			q=data.readLine();
		}
		int quant=Integer.parseInt(q);
		System.out.println("Digite a quantidade desse exemplar emprestado(s):");
		line=data.readLine();
		while(!isNumeric(line)){
			System.out.println("Digite a quantidade desse exemplar emprestado(s):");
			line=data.readLine();
		}
		int emprestados=Integer.parseInt(line);
		boolean emp01=true;
		while(emp01){		
			if(emprestados-quant>0){
				System.out.println("Quantidade de exemplares emprestados nao pode ser maior que quantidade de livros");
				System.out.println("Digite a quantidade desse exemplar emprestado(s):");
				line=data.readLine();
				while(!isNumeric(line)){
					System.out.println("Digite a quantidade desse exemplar emprestado(s):");
					line=data.readLine();
				}
				emprestados=Integer.parseInt(line);
			}else emp01=false;
		}
				
		Livro book= new Livro(codl,title,cat,quant,emprestados);
		a.cadastraLivro(book);
		System.out.println("Cadastro realizado com sucesso!");
	}
	else if(Integer.parseInt(line)==3){
		System.out.println("Salvar o cadastro de usuarios ou cadastro de livros?\n1.Usuario\n2.livro");
		Hashtable aux;
		line=data.readLine();
		while(!isNumeric(line)){
			System.out.println("Salvar o cadastro de usuarios ou cadastro de livros?\n1.Usuario\n2.livro");
			line=data.readLine();
		}
		int num=Integer.parseInt(line);
		if(num==1){
			aux=a.getHashUsuario();
			System.out.println("Digite o nome do arquivo que vc gostaria de salvar o cadastro dos usuarios:");
			line=data.readLine();
			a.salvaArquivo(aux,line);
			System.out.println("Arquivo salvo!");
		}else if(num==2){
			aux=a.getHashLivro();
			System.out.println("Digite o nome do arquivo que voce gostaria de salvar o cadastro dos livros:");
			line=data.readLine();
			a.salvaArquivo(aux,line);
			System.out.println("Arquivo salvo!");
		}
	}
	else return ;
}
public static void Emprestimo()throws IOException{
	BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("=====================================Emprestimo=====================================");
	System.out.println("1.Exibir cadastro de livros");
	System.out.println("2.Fazer emprestimo\n3.Devolucao\n4.Digite qualquer numero diferente de 1,2 e 3 para voltar pro menu anterior");
	String line=data.readLine();
	int op;
	while(!isNumeric(line)){
		System.out.println("1.Exibir cadastro de livros");
	System.out.println("2.Fazer emprestimo\n3.Devolucao\n4.Digite qualquer numero diferente de 1,2 e 3 para voltar pro menu anterior");
		line=data.readLine();
	}
	op=Integer.parseInt(line);
	if(op==1){
		System.out.println(a.imprimeLivros());
	}
	else if(op==2){
		try{
		System.out.println("Digite o codigo do Usuario:");
		line=data.readLine();
		while(!isNumeric1(line)){
			System.out.println("Digite o codigo do Usuario:");
			line=data.readLine();
		}
		int cont=0;
		int codigo=Integer.parseInt(line);
		while(!EUser(codigo) && cont<=3){
			System.out.println("Usuario nao encontrado!");
			cont++;
			if(cont>=3){
				System.out.println("Voce esta sendo redirecionado(a) para o menu principal");
				return ;
			}
			System.out.println("Tentativa "+cont);
			System.out.println("Digite o codigo do Usuario:");
			line=data.readLine();
			while(!isNumeric1(line)){
				System.out.println("Digite o codigo do Usario:");
				line=data.readLine();
			}
			codigo=Integer.parseInt(line);
		}
		Usuario c;
		try{
		c=(Usuario)a.getUsuario(codigo);
		}catch(UsuarioNaoCadastradoEx e){ System.out.println(e); return;}
		System.out.println("Digite o codigo do livro:");
		String cod=data.readLine();
		int cont1=0;
		while(cont1<=3 && !EBook(cod)){
			System.out.println("Livro nao encontrado");
			cont1++;
			if(cont1>=3){
				System.out.println("Voce esta sendo redirecionado(a) para o menu principal!");
				return ;
			}
			System.out.println("Tentativa "+(cont1+1));
			System.out.println("Digite o Codigo do livro:");
			cod=data.readLine();
		}
		Livro b;
		try{
		b=(Livro)a.getLivro(cod);
		}catch(LivroNaoCadastradoEx e){System.out.println(e); return;}
		a.emprestaLivro(b,c);
		System.out.println("Emprestimo bem Sucedido");
		System.out.println(a.getLivro(cod));
		System.out.println(a.getUsuario(codigo));
		}catch(CopiaNaoDisponivelEx e){System.out.println(e);Emprestimo();return;}
		catch(LivroNaoCadastradoEx e){System.out.println(e);Emprestimo(); return;}
		catch(UsuarioNaoCadastradoEx e){ System.out.println(e);Emprestimo(); return;}
		catch(LimiteDeEmprestimosPorUsuarioEx e){ System.out.println(e);Emprestimo(); return ;}
		
	}
	else if(op==3){
		System.out.println("=====================================Devolucao=====================================");
	try{
		System.out.println("Digite o codigo do Usuario:");
		line=data.readLine();
		while(!isNumeric1(line)){
			System.out.println("Digite o codigo do Usuario:");
			line=data.readLine();
		}
		int cont=0;
		int codigo=Integer.parseInt(line);
		while(!EUser(codigo) && cont<=3){
			System.out.println("Usuario nao encontrado!");
			cont++;
			if(cont>=3){
				System.out.println("Voce esta sendo redirecionado(a) para o menu principal");
				return ;
			}
			System.out.println("Tentativa "+cont);
			System.out.println("Digite o codigo do Usuario:");
			line=data.readLine();
			while(!isNumeric1(line)){
				System.out.println("Digite o codigo do Usario:");
				line=data.readLine();
			}
			codigo=Integer.parseInt(line);
		}
		Usuario c=(Usuario)a.getUsuario(codigo);
		System.out.println("Digite o codigo do livro:");
		String cod=data.readLine();
		int cont1=0;
		while(cont1<=3 && !EBook(cod)){
			System.out.println("Livro nao encontrado!");
			cont1++;
			if(cont1>=3){
				System.out.println("Voce esta sendo redirecionado(a) para o menu principal!");
				return ;
			}
			System.out.println("Tentativa "+(cont1+1));
			System.out.println("Digite o Codigo do livro:");
			cod=data.readLine();
		}
		Livro b=(Livro)a.getLivro(cod);
		a.devolveLivro(c,b);
		System.out.println("Devolucao bem Sucedida");
		System.out.println(a.getLivro(cod));
		System.out.println(a.getUsuario(codigo));
	}catch(LivroNaoCadastradoEx e){System.out.println(e);System.out.println("Verifique o codigo do livro e tente novamente ");Emprestimo();return;}
	catch(UsuarioNaoCadastradoEx e){ System.out.println(e);System.out.println("Verifique o codigo do usuario e tente novamente!");Emprestimo();return;}
	catch(UsuarioLivroEx e){ System.out.println(e);System.out.println("Verifique os dados e tente novamente!");Emprestimo();return;}
	}
	else  return;
	
}
public static void Relatorio()throws IOException{
	
BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
System.out.println("=====================================Relatorio=====================================");
System.out.println("1.Acervo de livros\n2.Cadastro de Usuarios\n3.Detalhes de um livro\n4.Detalhe de um usuario\n5.Qualquer outro numero para voltar para o menu anterior");
String line=data.readLine();
while(!isNumeric(line)){
	System.out.println("=====================================Relatorio=====================================");
	System.out.println("1.Acervo de livros\n2.Cadastro de Usuarios\n3.Detalhes de um livro\n4.Detalhe de um usuario\n5.Qualquer outro numero para voltar para o menu anterior");
	line=data.readLine();
}
int num=Integer.parseInt(line);
if(num==1){
	Hashtable aux=a.getHashLivro();
	System.out.println(aux);
}else if(num==2){
	Hashtable aux=a.getHashUsuario();
	System.out.println(aux);
}
else if(num==3){
	try{
	System.out.println("Digite o codigo do livro para mais detalhes:");
	line=data.readLine();
	Livro b=(Livro)a.getLivro(line);
	System.out.println(b.toString());
	}catch(LivroNaoCadastradoEx e){
		System.out.println(e); System.out.println("Verifique se o livro esta cadastrado");Relatorio();return;
	}
}else if(num==4){
	System.out.println("Digite o codigo do usuario para mais detalhes:");
	line=data.readLine();
	while(!isNumeric(line)){
		System.out.println("Digite o codigo do usuario para mais detalhes:");
		line=data.readLine();
	}	
	int esc=Integer.parseInt(line);
	try{
	Usuario b=(Usuario)a.getUsuario(esc);
	System.out.println(b.toString());
	}catch(UsuarioNaoCadastradoEx e){System.out.println(e); System.out.println("Tente novamente");Relatorio();return ;}

}
}
public static void main(String []s)throws IOException{
	//a.leArquivo("Usuario.txt");
	System.out.println("=====================================MENU=====================================");
	BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("1.Manutencao\n2.Cadastro\n3.Emprestimo\n4.Relatorio\n5.Sair");
	String line=data.readLine();
	while(!isNumeric(line)){
		System.out.println("1.Manutencao\n2.Cadastro\n3.Emprestimo\n4.Relatorio\n5.Sair");
		line=data.readLine();
	}
	int op=Integer.parseInt(line);
	while(op!=5){
	
		switch(op){
		case 1:
			System.out.println("=====================================Manutencao=====================================");
			System.out.println("Digite o nome do arquivo que voce quer carregar o cadastro de usuarios:");
			String user=data.readLine();
			System.out.println("Digite o nome do arquivo que voce quer carregar o acervo de livros:");
			String biblio=data.readLine();
			Manutencao(user,biblio);
			break;
		case 2:
			Cadastro();
			break;
		case 3:
			Emprestimo();
			break;
		case 4:
			Relatorio();
			break;
		default:
			break;
		}
System.out.println("=====================================MENU=====================================");
			System.out.println("1.Manutencao\n2.Cadastro\n3.Emprestimo\n4.Relatorio\n5.Sair");
	line=data.readLine();
	op=Integer.parseInt(line);
	}
}
}
		
		
