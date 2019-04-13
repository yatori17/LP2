public class EX1{
	public static void main(String []s)
	{
		Calculo area1;
		try{
			if(s.length<=1){
			
			double a=Double.parseDouble(s[0]);
			area1= new Calculo(a);								  				System.out.println(area1.get(a));}
			else if(s.length==2){
			double a=Double.parseDouble(s[0]);
			double b=Double.parseDouble(s[1]);area1=new Calculo(a);area1=new Calculo(b);
			System.out.println(area1.get(a,b));
			}
			else if(s.length>2){
			double a=Double.parseDouble(s[0]);double c=Double.parseDouble(s[2]);
			double b=Double.parseDouble(s[1]);area1=new Calculo(a);area1=new Calculo(b);area1=new Calculo(c);
			System.out.println(area1.get(a,b,c));
			}
		}catch(NumberFormatException e){System.out.println("Argumento"+e.toString()+" invalido");}
	catch(IndexOutOfBoundsException e){System.out.println("Sem argumentos");}
		
}}
