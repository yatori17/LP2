/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaboku
 */
public abstract class PessoaIMC extends Pessoa{
private double peso;
private double altura;
public PessoaIMC(String a,String b,double c, double d){
	super(a,b);
	this.peso=c;
	this.altura=d;
}
public double getPeso() {return this.peso;}
public double getAltura(){ return this.altura;}
public double calculaIMC(double p, double h){
	return p/(h*h);
}
public double getIMC()
{
	return calculaIMC(this.peso,this.altura);
}
public abstract String getSexo();
public abstract String resultIMC();
@Override
public String toString()
{
	String a,b,c,d;
	a=String.format("Nome: "+getName()+"\n");
	b=String.format("Data de Nascimento: "+getNasc()+"\n");
	c=String.format("Peso: %.2f \n",getPeso());
	d=String.format("Altura: %.2f\n"+getAltura());
	return a+b+c+d;
}
}