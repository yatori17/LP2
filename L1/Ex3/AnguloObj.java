import java.text.DecimalFormat;
import java.lang.Math;
class AnguloObj{
	private double arcoRad;
	public AnguloObj(double a)
	{
		this.arcoRad=Math.toRadians(a);
	}
	public double converteAngulo()
	{
		return Math.toRadians(arcoRad);
	}
	public double funcaoSeno(){
		return Math.sin(arcoRad);
	}
	public double funcaoCosseno(){
		return Math.cos(arcoRad);
	}
	public double funcaoTangente(){
		return Math.tan(arcoRad);
	}
	public double funcaoCotangente(){
		return (Math.cos(arcoRad))/(Math.sin(arcoRad));
	}
	@Override
	public String toString(){
		DecimalFormat format= new DecimalFormat("0.0E0");
		String a,b,c,d,i;
		i=String.format("Arco: %.2f rad\n",arcoRad);
		a=String.format("Seno: "+format.format(funcaoSeno())+"\n");
		b=String.format("Cosseno: "+format.format(funcaoCosseno())+"\n");
		c=String.format("Tangente: "+format.format(funcaoTangente())+"\n");
		d=String.format("Cotangente: "+format.format(funcaoCotangente())+"\n");
		return i+a+b+c+d;
	}
}
