import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiaiPtBac2Test {
	GiaiPtBac2 sol = new GiaiPtBac2();
	@Test
	public void testptVoNghiem1() {
		assertEquals("Phương trình vô nghiệm!",sol.giaiPTBac2(0, 0, 0));
	}
	
	@Test
	public void testptVoNghiem2() {
		assertEquals("Phương trình vô nghiệm!",sol.giaiPTBac2(1, 2, 3));
	}
	
	@Test
	public void testpt1nghiem() {
		assertEquals("Phương trình có một nghiệm: x = 1.0",sol.giaiPTBac2(0, 1, -1));
	}
	
	@Test
	public void testpt2nghiem() {
		assertEquals("Phương trình có 2 nghiệm là: x1 = -1.0 và x2 = -2.0",sol.giaiPTBac2(1, 3, 2));
	}
	
	@Test
	public void testptnghiemkep() {
		assertEquals("Phương trình có nghiệm kép: x1 = x2 = 1.0",sol.giaiPTBac2(1, -2, 1));
	}
}
