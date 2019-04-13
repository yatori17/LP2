import java.io.*;
public class EX2{
public static void main(String []s) {
	try{
	double q=Double.parseDouble(s[0]);
	Angulo ang= new Angulo(q);
	q=ang.converteAngulo(q);
	System.out.printf("Seno:%.2f\n",ang.funcaoSeno(q));
	System.out.printf("Cosseno:%.2f\n",ang.funcaoCosseno(q));
	System.out.printf("Tangente:%.2f\n",ang.funcaoTangente(q));
	System.out.printf("Cotangente:%.2f\n",ang.funcaoCotangente(q));
	BufferedReader data=new BufferedReader(new InputStreamReader(System.in));
	String line;
//	try{
	System.out.println("Digite o angulo em graus ou n digite nada para terminar:");
	line=data.readLine();
	while(!line.isEmpty())
	{
		q=Double.parseDouble(line);	
		ang= new Angulo(q);q=ang.converteAngulo(q);
		System.out.printf("Seno:%.2f\n",ang.funcaoSeno(q));
		System.out.printf("Cosseno:%.2f\n",ang.funcaoCosseno(q));
		System.out.printf("Tangente:%.2f\n",ang.funcaoTangente(q));
		System.out.printf("Cotangente:%.2f\n",ang.funcaoCotangente(q));line=data.readLine();
		System.out.println("Digite o angulo em graus ou n digite nada para terminar:");
		
	}
	}catch(IOException e){}
	
	}
}
