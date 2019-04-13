import java.util.*;
import java.io.*;
public class Ex5{
public static boolean isNumeric(String a)
{
	try{
		Integer.parseInt(a);
		return true;
	}catch(NumberFormatException e){ return false;}
}
public static void main(String []s)throws IOException{
	MinhaListaOrdenavel aux=new MinhaListaOrdenavel();
	aux.add(new Mulher("Amije Lay","17/08/1996",66,1.72));
	aux.add(new Mulher("Aurora","17/08/2000",70,1.72));
	aux.add(new Homem("Joao Bernardo","25/05/1990",99,1.72));
	aux.add(new Homem("Paulo Ricardo","11/01/1996",50,1.63));
	aux.add(new Mulher("Selena","17/08/2005",63,1.73));
	aux.add(new Homem("Eduardo Arthur","21/04/1997",80,1.79));
	aux.add(new Homem("Jaime Lay","20/03/1997",70,1.65));
	aux.add(new Homem("Sandro Gomes","25/03/1999",50,1.71));
	aux.add(new Mulher("Natasha ","17/07/2001",71,1.75));
	aux.add(new Homem("Gabriel Lucas","12/01/2001",70,1.60));
	BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("1.Imprimir Lista\n2.Sair\nDigite sua opcao:");
	String line=data.readLine();
	while(!isNumeric(line))
	{
	System.out.println("1.Imprimir Lista\n2.Sair\nDigite sua opcao:");
	line=data.readLine();
	}
	int num=Integer.parseInt(line);
	while(num!=2){
		while(num!=1){
		System.out.println("Opcao invalida!");
		System.out.println("Digite sua opcao:");
		line=data.readLine();
		while(!isNumeric(line)){
			System.out.println("Opcao invalida!");
			System.out.println("Digite sua opcao:");
		}
		num=Integer.parseInt(line);
		if(num==2) return;
		}
		System.out.println("\tEscolha seu modo de ordenacao\n1.Alfabetica (A-Z) – nome da pessoa\n2.Alfabetica (Z-A) – nome da pessoa\n3.Menor Peso - crescente\n4.Maior Peso - decrescente\n5.Menor Altura – crescente, do mais baixo para o mais alto\n6.Menor IMC - crescente, do mais baixo para o mais alto\n7.Homem – ordenar por gênero\n8.Mulher - ordenar por gênero");
		System.out.println("Digite sua opcao:");
		line=data.readLine();
		while(!isNumeric(line)){ System.out.println("Opcao invalida\nDigite sua opcao:");line=data.readLine();}
		num=Integer.parseInt(line);
		while(num<=0|| num>8){ 
			System.out.println("Opcao invalida\nDigite sua opcao:");
			line=data.readLine();
			while(!isNumeric(line)){System.out.println("Opcao invalida\nDigite sua opcao:");line=data.readLine();}
			num=Integer.parseInt(line);
		}
		aux.ordena(num);
		System.out.println(aux.toString());
		System.out.println("1.Imprimir Lista\n2.Sair\nDigite sua opcao:");
		line=data.readLine();
		while(!isNumeric(line))
		{
		System.out.println("Opcao Invalida!");
		System.out.println("1.Imprimir Lista\n2.Sair\nDigite sua opcao:");
		line=data.readLine();
		}
		num=Integer.parseInt(line);
	}
}}
