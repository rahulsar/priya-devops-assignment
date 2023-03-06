package com.ssc.java;

public class TestL2 {

	// Double value one
			public static void displayDouble(Double ...dl){
			for(int i = 0;i<dl.length;i++){
				System.out.println(dl[i] + " ");
			   }
		    }
	public static void main(String[] args) {
		//Assertion one
		/*Test3 d = new Test3();
		d.setB1(true);d.setB2(true);
		d.m1();*/
		
		//ObjComp
		/*int result =0;
		TestL2 oc = new TestL2();
		Object o = oc;
		if(o==oc)result=1;
		if(o!=oc)result=result+10;
		if(o.equals(oc))result=result+100;
		if(oc.equals(o))result=result+1000;
		System.out.println(result);*/
		
		//Integer testing one
		/*Integer x = 436;
		Integer y = x; x++;
		System.out.println(x + "" + y);*/
		
		//Short one
		/*Short s1 = 32 + 32;
		Short s2 = 64;
		//out.format("%b,%b",(s1==s2),(s1.equals(s2)));
		System.out.println((s1==s2)+ " " + (s1.equals(s2)));*/
		
		//Double one Testing
		displayDouble(43.7,57.8,68.9);
	}

}
