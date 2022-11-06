package corsoiniziodacapo;


import java.util.Scanner;// possono coesistere queste 2 class?
import java.util.ArrayList;

public class phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> telefoni= new ArrayList();
	int marca;
	do {
		int  phone;	
	
		ArrayList <String> modello = new ArrayList ();
	
		String phone1="Iphone";
	   String phone2="S3";
	  String phone3="Note8T";
	  String phone4="Oneplus";
	
	modello.add(phone1);
	modello.add(phone2);
	modello.add(phone3);
	modello.add(phone4);
	
		ArrayList <String> smartphone = new ArrayList ();
		
		smartphone.add("Apple");
		smartphone.add("Samsung");
		smartphone.add("Xiomin");
		smartphone.add("Haway");
		
		
		for (int x=0;x<smartphone.size();x++) {
			
			System.out.println(smartphone.get(x));
		}
		System.out.println("scegli modello:Iphone,S3,Note8t,Oneplus");
	  Scanner f= new Scanner(System.in);
		
		
		int Selezionmodello =f.nextInt(); 
		
		
		
		System.out.println("marca:Apple,Samsung,Xiomin,Haway");
		
		Scanner c = new Scanner(System.in);
		
		
		
		
		 marca=c.nextInt();
		
		if(Selezionmodello==1 && marca==1){
			
			System.out.println( smartphone.get(0)+"  "+ modello.get(0));
			
		}
		else if (Selezionmodello==2 && marca==2) {
		
		System.out.println( smartphone.get(1)+"  "+ modello.get(1));
		}
		else if (Selezionmodello==3 && marca==3) {
			
			System.out.println( smartphone.get(2)+"  "+ modello.get(2));
			}
		else if (Selezionmodello==4 && marca==2) {
			
			System.out.println( smartphone.get(3)+"  "+ modello.get(3));
			}
		else {System.out.println("combinazione non corretta");
	}}
	  while (marca!=0);
	
	
	}}
	
	
	
		
			
			
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	


