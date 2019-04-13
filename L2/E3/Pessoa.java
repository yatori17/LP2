/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
