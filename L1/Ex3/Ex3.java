import java.io.*;
public class Ex3{
public static boolean isNumber(String s)
{
	try{
		if(Integer.parseInt(s)>0) return true;
		System.out.println("Numero de angulos precisa ser maior que zero:");	
		return false;
	}catch(NumberFormatException e){System.out.println("Argumento "+"\""+s+"\""+" nao eh numero");  return false;}
}
public static boolean isNumber2(String s)
{
	try{
		Double.parseDouble(s);
		return true;
	}catch(NumberFormatException e){
		System.out.println("Argumento "+s+" nao eh numero");
		return false;
	}
}

public static void main(String []s)throws IOException
{
	System.out.println("Digite o numero de angulos:");
	BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
	String line=data.readLine();
	while(!isNumber(line)){System.out.println("Digite o numero de angulos:");line=data.readLine();}
	int a=Integer.parseInt(line);
	double num[]= new double[a];
	AnguloObj[] objetos=new AnguloObj[a];
	for(int i=0;i<a;i++)
	{
		System.out.println("Digite o valor do "+(i+1)+"º angulo:");
		line=data.readLine();
		while(!isNumber2(line)){System.out.println("Digite o valor do "+(i+1)+"º angulo:"); line=data.readLine();}
		num[i]=Double.parseDouble(line);
		objetos[i]=new AnguloObj(num[i]);
	}
	System.out.println("Resultado=====================================");
	for(int i=0;i<a;i++){
	System.out.println(objetos[i].toString());}
}
}
