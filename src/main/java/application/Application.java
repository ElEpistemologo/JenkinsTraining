package application;

import calculs.Stats;

public class Application {

	public static void main(String[] args) {
		
		Stats stats = new Stats();
		int[] arg = {2,4,15,23,75,1};
		
		System.out.println(stats.average(arg));
	}

}
