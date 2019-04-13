import java.util.Vector;
import java.util.Iterator;
import java.io.*;
public class Ex5{
public static boolean isNumeric(String a)
{
	try{
		Double.parseDouble(a);
		return true;
	}catch(NumberFormatException e){ return false;}
}
public static void main(String []s)throws IOException{
	String nome,dat;
	double peso,altura;
	Vector aux=new Vector();
	BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
	String line;char c;
	System.out.println("Digite o numero de pessoas:");
	line=data.readLine();
	int a=Integer.parseInt(line);
	for(int i=0;i<a;i++)
	{
		System.out.println("Inserir homem(h) ou mulher(m)?");
		line=data.readLine();
		c=line.charAt(0);
		while(c!='h'&&c!='m'){
			System.out.println("---Opcao Invalida!!!");
			System.out.println("Inserir homem(h) ou mulher(m)?");
			line=data.readLine();c=line.charAt(0);
		}
		System.out.println("Digite o nome:");
		nome=data.readLine();
		System.out.println("Digite a data de nascimento:");
		dat=data.readLine();
		System.out.println("Digite o peso(em kg):");
		line=data.readLine();
		while(!isNumeric(line))
		{
			System.out.println("---O peso deve ser numerico");
			System.out.println("Digite o peso(em kg):");
			line=data.readLine();
		}
		peso=Double.parseDouble(line);
		System.out.println("Digite a altura(em metros):");
		line=data.readLine();
		while(!isNumeric(line))
		{
			System.out.println("---A altura deve ser um numero");
			System.out.println("Digite a altura(em metros):");
			line=data.readLine();
		}
		altura=Double.parseDouble(line);
		if(c=='h')
		{
			aux.add(new Homem(nome,dat,peso,altura));
		}
		else aux.add(new Mulher(nome,dat,peso,altura));
	}
	Iterator it=aux.iterator();
	while(it.hasNext()){System.out.println("---------");System.out.println(it.next());System.out.println("---------");}
}
}
