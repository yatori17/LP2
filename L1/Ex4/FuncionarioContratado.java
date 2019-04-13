public class FuncionarioContratado extends Funcionario{
private int n;
private double salarioF;
public static double valorPorDep=9.58;
public static double aliquotaIR=0.15;
public FuncionarioContratado(String a,String b,double c,int d)
{
	super(a,b,c);
	this.n=d;
}
public void calculaSalario()
{
	calculaSalario(aliquotaIR);
}
public void calculaSalario(int numeroDependentes)
{
	this.salarioF=numeroDependentes*valorPorDep;
	double aux=this.salarioF+getSal();
	SetSal(aux);
	calculaSalario();
}
@Override
public String toString()
{
	String a,b,c,d;
	a=String.format("Nome: "+getName()+"\n");
	b=String.format("Codigo: "+getCod()+"\n");
	c=String.format("Salario-base: %.2f\n",getSal());
	d=String.format("Salario-Liquido: %.2f\n",getsal());
	return a+b+c+d;
}
}
