import java.util.ArrayList;
import java.util.Scanner;

public class minilab {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		System.out.println("Original List: "+factors(number));
		System.out.println("Composite List: "+noncom(factors(number)));
	}
	
	public static ArrayList<Integer> factors(int number){
		ArrayList<Integer> fac=new ArrayList<Integer>();
		for (int i=2; i<number; i++) {
			if (number%i==0) {
				fac.add(i);
			}
		}
		return fac;
	}
	public static ArrayList<Integer> noncom(ArrayList<Integer> fac){
		for (int i=0; i<fac.size(); i++) {
			boolean com=false;
			for(int j=2; j<fac.get(i); j++) {
				if (fac.get(i)%j==0) {
					com=true;
					j=fac.get(i);
					}
			}
			if (!com) {
				fac.remove(i);
				i--;
				com=false;
			}
		}
		return fac;
	}
}
