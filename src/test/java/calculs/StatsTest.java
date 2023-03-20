package calculs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatsTest {

	private Stats stats = new Stats();
	
	@Test
	public void test() {
		int[] arg0 = {1,1};
		
		double result = stats.average(arg0);
		assertEquals(1, result, 0.0001);
	}

}
