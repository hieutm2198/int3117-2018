public class GiaiPtBac2 {
	public static String giaiPTBac2(float a, float b, float c) {
		// kiểm tra các hệ số
		if (a == 0) {
			if (b == 0) {
				return("Phương trình vô nghiệm!");
			} else {
				return("Phương trình có một nghiệm: " + "x = " + (-c / b));
			}
		}
		// tính delta
		float delta = b * b - 4 * a * c;
		float x1;
		float x2;
		// tính nghiệm
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			return("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			return("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		} else {
			return("Phương trình vô nghiệm!");
		}
	}
} 	 




