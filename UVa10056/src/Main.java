import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nCase = sc.nextInt();

		for (int i = 0; i < nCase; i++) {
			int N = sc.nextInt();
			double P = sc.nextDouble();
			int I = sc.nextInt();

			double upper_term = P;
			for (int j = 0; j < I - 1; j++) {
				upper_term *= (1.0 - P);
			}

			double lower_term = 1.0;
			double power_term = 1.0;
			for (int j = 0; j < N; j++) {
				power_term *= (1.0 - P);
			}

			lower_term -= power_term;

			double result;
			if (lower_term > 0.0)
				result = upper_term / lower_term;
			else
				result = 0;

			System.out.printf("%.4f", result);
			System.out.println();
		}

		sc.close();
	}

}
