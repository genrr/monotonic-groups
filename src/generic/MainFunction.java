package generic;

import java.util.ArrayList;

import auxiliary.N_Functions;

public class MainFunction {

	
	private static int limit1 = -100;
	private static int limit2 = 100;
	private static String result = "";	
	private static ArrayList<Integer> list = new ArrayList<>();
	private static int rounds;
	
	public static String init(int n1) {
		list.clear();
		result = "";
		rounds = 2600;
		
		N_Functions.init_n(n1,7,1,2,0,34,123,0);
		list.add(n1);
		ListIterator(list);

		return result.substring(0, result.length()-1);
	
		
	}
	
	private static void ListIterator(ArrayList<Integer> l) {
		int i = 0;
		int t = 0;

		while(!l.isEmpty()) {

			t = l.get(i);
			l.remove(i);
			
			System.out.println(l.toString());
			System.out.println("results"+result);
			
			if(Math.abs(t) != 1) {
				factorize(t);
			}
			
		}
	}
	
	private static void factorize(int n1) {
		
		double q = -0.5;
		double t1;
		int t2;

		while(rounds>0) {
			for (int i = limit1; i <= limit2; i++) {
				t1 = q*Math.floor(N_Functions.n_function(Math.floor(Math.sqrt(n1))));
				t2 = (int)(t1*i % Math.floor(Math.sqrt(n1)));
				if(t2 != -2 && n1 % (t2+2) == 0 && Math.abs(t2+2) != Math.abs(n1) && Math.abs(t2+2) != 1) {
					list.add(t2+2);
					list.add(n1/(t2+2));
					return;
				}
	
			}
			q = q-0.5;
			rounds--;
		}
		
		result += String.valueOf(Math.abs(n1)) + "*";

		
	}
	
	
	
}
