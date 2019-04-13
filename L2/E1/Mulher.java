public class Mulher extends PessoaIMC{
public Mulher(String a,String b,double c, double d){super (a,b,c,d);}
@Override
public String resultIMC(){
	String a,b;
	a=String.format("%.2f ",calculaIMC(getPeso(),getAltura()));
	if(calculaIMC(getPeso(),getAltura())<19)b=String.format("Abaixo do peso ideal\n");
	else if(calculaIMC(getPeso(),getAltura())<=25.8)b=String.format("Peso ideal\n");
	else b=String.format("Acima do peso ideal\n");
	return a+b;
}
@Override
public String toString()
{
	String a,b,c,d;
	a=String.format("Nome: "+getName()+"\n");
	b=String.format("Data de Nascimento: "+getNasc()+"\n");
	c=String.format("Peso: %.2f \n",getPeso());
	d=String.format("Altura: %.2f\n",getAltura());
	return a+b+c+d+resultIMC();
}
}
