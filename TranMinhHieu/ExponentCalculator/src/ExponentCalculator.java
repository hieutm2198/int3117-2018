public class ExponentCalculator {
	public static double calculate(double base, int exp) {
		double result = 0.0;
		if(base == 0) {
			if(exp == 0) {
				result = 1.0;
			} else {
				result = 0.0;
			}
		} else if (base == 1) {
			result = 1.0;
		} else {
			if(exp == 0) {
				result = 1.0;
			} else {
				result = base;
				for(int i = 2; i <= Math.abs(exp); ++i) {
					result = result * base;
				}
				if(exp < 0) {
					result = 1 / result;
				}
			}
		}
		return result;
	}
}
