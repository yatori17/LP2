import java.lang.Math;
import java.text.DecimalFormat;
public class Angulo{
public double ang;
public Angulo(double a){
	this.ang=a;
}
public static double converteAngulo(double a)
{
	return Math.toRadians(a);
}
public static double funcaoSeno(double a)
{
	return Math.sin(a);
}
public static double funcaoCosseno(double a)
{
	return Math.cos(a);
}
public static double funcaoTangente(double a)
{
	return Math.sin(a)/Math.cos(a);
}
public static double funcaoCotangente(double a)
{
	return 1/Math.tan(a);
}
public void imprime(double a)
{
	DecimalFormat d= new DecimalFormat("#0.00");
	double p=converteAngulo(a);
	System.out.println("Seno: "+d.format(funcaoSeno(p)));
	System.out.println("Cosseno: "+d.format(funcaoCosseno(p)));
	System.out.println("Tangente: "+d.format(funcaoTangente(p)));
	System.out.println("Cotangente: "+d.format(funcaoCotangente(p)));
}
}
