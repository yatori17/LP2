import java.lang.Math;
public class Angulo{
public double a;
public Angulo(double p){ a=p;}
public double converteAngulo(double a)
{
	return Math.toRadians(a);
}
public double funcaoSeno(double a){
	return Math.sin(a);
}
public double funcaoCosseno(double a){
	return Math.cos(a);
}
public double funcaoTangente(double a){
	return Math.tan(a);
}
public double funcaoCotangente(double a){
	return (Math.cos(a))/(Math.sin(a));
}
}


