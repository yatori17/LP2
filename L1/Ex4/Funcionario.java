import java.text.DecimalFormat;
public class Funcionario{
private String nome,codigo;
private double salario,salarioL;

public Funcionario(String a,String c,double b)
{
	this.nome=a;
	this.salario=b;
	this.codigo=c;
	this.salarioL=b;
}
public double calculaSalario(double desconto)
{
	return this.salarioL=this.salario-(desconto*this.salario);
}
public void SetSal(double a){this.salario=a;}
public void Setsal(double a)
{
	this.salarioL=a;
}
public String getName(){ return this.nome;}
public String getCod(){ return this.codigo;}
public double getSal(){return this.salario;}
public double getsal(){ return this.salarioL; }
@Override
public String toString()
{
	DecimalFormat d=new DecimalFormat("0.00");
	String a,b,c;
	a=String.format("Nome: "+nome+"\n");
	b=String.format("Codigo: "+codigo+"\n");
	c=String.format("Salario-base: R$"+d.format(salario)+"\n");
	return a+b+c;
}
}
