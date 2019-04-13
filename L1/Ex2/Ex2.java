import java.io.*;
public class Ex2{
public static boolean isNumber(String s)
{
	try{
		Double.parseDouble(s);
		return true;
	}catch(NumberFormatException e){System.out.println("Argumento "+"\""+s+"\""+" invalido"); return false;}
}

public static void main(String s[])
{
	if(s.length ==1)
	{
	if(isNumber(s[0])){
	double q=Double.parseDouble(s[0]);
	Angulo ang=new Angulo(q);
	ang.imprime(q);
	}
	}else if(s.length>1) System.out.println("Numero de argumentos excessivo");
	try{
	String line;
	BufferedReader data= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Digite o argumento do prox angulo:");
	line=data.readLine();
	Angulo ang1;
	while(!(line.isEmpty()))
	{
		while(!isNumber(line)){	System.out.println("Digite o argumento do prox angulo:");line=data.readLine();}
		double c=Double.parseDouble(line);
		ang1=new Angulo(c);
		ang1.imprime(c);
		System.out.println("Digite o argumento do prox angulo:");
		line=data.readLine();
	}
	}catch(IOException e){}	
	
}
}
