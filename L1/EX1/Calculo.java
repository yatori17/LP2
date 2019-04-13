import java.lang.Math;
public class Calculo{
public double a,b,c;
public Calculo(double p){a=p;}
public Calculo(double p,double q){a=p;b=q;}
public Calculo(double p,double q, double r){a=p;b=q;c=r;}
private static double calcula( double a)
{
	return a*a*Math.PI;
}
private static double calcula(double a,double b)
{
	return a*b;
}
private static double calcula(double a, double b, double c)
{
	double p=(a+b+c)/2;
	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}

public void triangulo(double a,double b, double c)
{
	if(a==b && a ==c) System.out.println("Triangulo equilatero");
	else if((a==c && b!=a)||(a==b && b!=c))System.out.println("Triangulo isoceles");
	else System.out.println("Triangulo escaleno");
}
public double get(double a){
	return calcula(a);
}
public double get(double a,double b){
	return calcula(a,b);
}
public double get(double a,double b,double c){
	return calcula(a,b,c);
}
}
