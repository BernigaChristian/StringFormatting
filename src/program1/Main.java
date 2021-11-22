package program1;

import java.util.*; //equivale all'include del C (in questo caso mettendo l'* importo tutte le librerie di util)

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);//new scanner.... si chiama istanza, e serve x indicare la creazione in memoria di una nuova variabile
		String parola;
		System.out.println("inserisci una parola: ");
		parola=scan.nextLine(); //nextLine significa che prende in input fino all'invio
		int i;
		for(i=0;i<parola.length();i++) {
			if((i%2)==0) {
				System.out.println(parola.substring(i,i+1).toUpperCase());
			}
			else {
				System.out.println(parola.substring(i,i+1));
			}
		}

	}

}

/*
se alla riga 11, dove prendo input una stringa, se io volessi prendere un numero al posto di una string
devo fare poi il cast delle variabili

se devo trasformare variabili dello stesso ceppo (tipo da int a double) posso fare così:
int x=5;
Double a=x;

se devo trasformare una stringa in int posso fare così:
int x;
String a="5";
int num=Integer.parseInt(a);

*/