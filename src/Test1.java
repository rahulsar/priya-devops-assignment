package com.ssc.java;

public class Test3 {
	
	private boolean b1,b2;
	public void setB1(boolean b){b1=b;}
	public void setB2(boolean b){b2=b;}
	public void m1(){
	    if(!b2 & !b1){System.out.println("A");}
		else if(!b2 & b1){System.out.println("B");}
		else if(b2 & !b1){System.out.println("C");}
		else if(b2 & b1){System.out.println("D");}
		else{ assert false;}		
	 }

	public static void main(String[] args) {
	/*private int f(){return 0;}
	public int g(){return 3;}*/			

	//Encapsulation related question
	/*public int getWeight(){ return weight;}
	public void setweight(int w){weight=w;}
	public int weight;*/
	
	}
}
