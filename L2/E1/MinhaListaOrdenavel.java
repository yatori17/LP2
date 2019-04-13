import java.util.*;
public class MinhaListaOrdenavel{
public static ArrayList lista;
public MinhaListaOrdenavel(){
	this.lista=new ArrayList();
}
public static void add(PessoaIMC p){
	lista.add(p);
}
public static PessoaIMC get(int i)
{
	return (PessoaIMC)lista.get(i);
}
public Comparator pesoC=new Comparator(){
	public int compare(Object p1,Object p2){
		double pf1,pf2;
		PessoaIMC a=(PessoaIMC) p1;
		PessoaIMC b=(PessoaIMC) p2;
		pf1=a.getPeso();
		pf2=b.getPeso();
		return (int) Math.round(pf2-pf1);
	}
};
public Comparator nomeC=new Comparator(){
	public int compare(Object p1,Object p2){
		String pf1,pf2;
		PessoaIMC a=(PessoaIMC) p1;
		PessoaIMC b=(PessoaIMC) p2;
		pf1=a.getName();
		pf2=b.getName();
		return (int) Math.round(pf1.compareTo(pf2));
	}
};
public Comparator altC=new Comparator(){
	public int compare(Object p1,Object p2){
		double pf1,pf2;
		PessoaIMC a=(PessoaIMC) p1;
		PessoaIMC b=(PessoaIMC) p2;
		pf1=a.getAltura();
		pf2=b.getAltura();
		double result=pf1-pf2;result=result*100;
		return (int) Math.round(result);
	}
};
public Comparator IMC=new Comparator(){
	public int compare(Object p1,Object p2){
		double pf1,pf2;
		PessoaIMC a=(PessoaIMC) p1;
		PessoaIMC b=(PessoaIMC) p2;
		pf1=a.getIMC();
		pf2=b.getIMC();
		double result=pf1-pf2;result=result*100;
		return (int) Math.round(result);
	}
};
public Comparator Sexo=new Comparator(){
	public int compare(Object p1,Object p2){
		if(p1.getClass().equals(p2.getClass())&& p1 instanceof Mulher) return 0;
		else if(p1 instanceof Homem)return -1;
		else return 1;
	}
};
public Comparator Sexo1=new Comparator(){
	public int compare(Object p1,Object p2){
		if(p1.getClass().equals(p2.getClass()) && p1 instanceof Homem) return 0;
		else if(p1 instanceof Mulher)return -1;
		else return 1;
	}
};
public ArrayList ordena(int criterio){
	switch(criterio){
		case 1:
			Collections.sort(this.lista,nomeC);
			break;
		case 2:
			Collections.sort(this.lista,nomeC.reversed());
			break;
		case 3:
			Collections.sort(this.lista,pesoC.reversed());
			break;
		case 4:
			Collections.sort(this.lista,pesoC);
			break;
		case 5:
			Collections.sort(this.lista,altC);
			break;
		case 6:
			Collections.sort(this.lista,IMC);
			break;
		case 7:
			Collections.sort(this.lista,Sexo);
			break;
		case 8:
			Collections.sort(this.lista,Sexo1);

		default: break;
		}
	return this.lista;
}
@Override
public String toString()
{
	String a="";
	int n=lista.size();
	for(int i=0;i<n;i++){
		a=a+lista.get(i)+"\n";
	}
	return a;
}
}
