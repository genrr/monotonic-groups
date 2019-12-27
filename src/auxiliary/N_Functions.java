package auxiliary;

public class N_Functions {

	private static int s1_mult;
	private static int s2_mult;
	private static int d1;
	private static int div_mult;
	private static int div_add1;
	private static int div_add2;
	private static int summand1;
	private static int summand2;
	
	public static void init_n(int n1, int a, int b, int c, int d, int e, int f, int g) {
		s1_mult = n1;
		s2_mult = a;
		d1 = b;
		div_mult = c;
		div_add1 = d;
		div_add2 = e;
		summand1 = f;
		summand2 = g;
		
		
	}
	
	public static double n_function(double x) {
		x = (int)Math.round(x);
		return
		s1_mult*x % (d1/(div_mult*x+div_add1) + summand1) - 
		s2_mult*x % (d1/(div_mult*x+div_add2) + summand2);
		
	}
}
