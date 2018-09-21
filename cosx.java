public class cosx {
	public static void main(String[] args) {
		System.out.println("cosx in taylor : " + cos(Double.parseDouble(args[0]), Double.parseDouble(args[1]))); // print + enter from command line x and n
	}

	public static double cos(double x, double n) {
		double cosx = 0;
		for (int i = 0; i <= n; i++) {
			cosx += Math.pow(-1, i) * Math.pow(x, 2 * i) / factorialcosx(2 * i);
			// cosx = ((-1)^(i)*x^(2*i))/(2*i)!																		
		}
		return cosx;
	}

	public static double factorialcosx(double x) {
		if (x == 0) { // because if factorial (2*i ==0 , cosx is NaN
			return 1;
		} else {
			return x *= factorialcosx(x - 1);
// x*(x-1)*(x-2)*...*1 => factorial of x => use to caculate factorialcosx by auto replace x=(2*i + 1) while you run the program.
		}
	}
}
