package primeNumberRecursive;
import java.util.Scanner;
public class Main {
	
	static boolean prime(int number) {
		boolean isPrime=true;
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				isPrime=false;
				
			}
		}
		return isPrime;
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Sayý giriniz: ");
		int number=scan.nextInt();
		
		
		if(number==1&&number==0) {
			System.out.print("Asal deðildir.");
		}
		else if(prime(number)==false) {
			System.out.print("Asal deðildir.");
		}
		else {
			System.out.print("Asaldýr.");
		}
		

	}

}
