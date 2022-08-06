package com.Headfirst.phrase;

public class PhraseOmatic {

	public static void main(String[] args) {
		String[] list1 = { "put","all","kill","step"};
		String[] list2 = { "dont","none","ill","up"};
		String[] list3 = { "cut","run","bill","down"};
		int onelen = list1.length;
		int twolen = list2.length;
		int threelen = list3.length;
		int ran1 = (int)(Math.random()* onelen);
		int ran2 = (int)(Math.random()* twolen);
		int ran3 = (int)(Math.random()* threelen);
		String phrase = list1[ran1] + " " + list2[ran2]+ " " + list3[ran3];
		System.out.println(phrase);
}
}
