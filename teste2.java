package br.com.rha;

import java.util.Scanner;

public class MaiClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
	
		  System.out.println("EXERCICIO 1");
		  
		  
		  String pala = "mussum".trim().replaceAll("\\s+", "");
		  String pala2 = "mussum".trim().replaceAll("\\s+", "");
		  Pilha palin = new Pilha (pala.length());
		  System.out.println(palin);
		  for(int i=0 ; i < pala.length();i++) {
			  System.out.println(pala.charAt(i) + " " + i);
			  
			  palin.push(pala.charAt(i));
			  
		  }
		  System.out.println(palin);
		  
		  Pilha palin2 = new Pilha (pala.length());
		  
		  
		  for(int l=pala2.length()-1; l >= 0;l--) {
			  System.out.println(pala2.charAt(l) + " " + l);
			  palin2.push(pala2.charAt(l));
			  
		  }
		  System.out.println(palin2);
		  int j = pala.length();
			  while(j >=0){
				  char palinpop =palin.pop();
				  char palinpop2 =palin2.pop();
				  if(palinpop == palinpop2){
					  System.out.println("PALINDROMO");
				  }else { System.out.println("NÃO PALINDROMO");}
				  j--;
			  
	}
			  
		  
		  
		  
		  
	}

}
