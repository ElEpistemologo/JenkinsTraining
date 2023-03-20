package calculs;

public class Stats {
	
	public double average(int[] elements) {
		int sum = 0;
		for ( int element : elements) 
			sum += element;
		return (double) sum/elements.length;
	}
	
}
