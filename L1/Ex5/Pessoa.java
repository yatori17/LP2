public class Pessoa{
private String nome;
private String dNasc;
public Pessoa(String a, String b)
{
	this.nome=a;
	this.dNasc=b;
}
public String getName(){ return this.nome;}
public String getNasc(){ return this.dNasc;}
@Override
public String toString()
{
	String a,b;
	a=String.format("Nome: "+getName()+"\n");
	b=String.format("Data de Nascimento:" +getNasc()+"\n");
	return a+b;
}
}
