import java.io.*;
public class Ex4{
public static int a;
public Ex4 (int b){
	this.a=b;
}
public static void calculaSalario()throws IOException{
	FuncionarioContratado[] objetos=new FuncionarioContratado[a];
	System.out.println("---Cadastro de Funcionarios");
	for(int i=0;i<a;i++)
	{
		String line,name,cod;
		double sal;
		int num;
		BufferedReader aux=new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("Nome do Empregado:");
		name=aux.readLine();
		System.out.printf("Codigo:");
		cod=aux.readLine();
		System.out.printf("Salario:");
		line=aux.readLine();
		sal=Double.parseDouble(line);
		System.out.printf("Numero de Dependentes:");
		line=aux.readLine();num=Integer.parseInt(line);
		objetos[i]=new FuncionarioContratado(name,cod,sal,num);
		objetos[i].calculaSalario(num);System.out.println();
	}
	System.out.println("--- Folha Salarial ---");
	for(int i=0;i<a;i++) System.out.println(objetos[i].toString());
	}

public static void main(String []s)throws IOException
	{
	System.out.println("Digite o numero de empregados:");
	BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
	String line=data.readLine();
	Ex4 aux=new Ex4(Integer.parseInt(line));
	aux.calculaSalario();
}
}
