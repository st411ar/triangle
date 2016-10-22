package org.st411ar;

import java.util.Map;

public class App {
	private static Primes primes = new Primes();

    public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		int divisorsCountMinimum = 500;

		int triangle = 0;
		for (int i = 1; ; i++) {
			triangle += i;
			PrimeDivisors primeDivisors = new PrimeDivisors(triangle, primes);
			int divisorsCount = getDivisorsCount(primeDivisors.getNumbers());
			if (divisorsCount > divisorsCountMinimum) {
				System.out.println("triangle #" + i + ":\t" + triangle);
				System.out.println(primeDivisors);
				System.out.println("divisorsCount: " + divisorsCount);
				break;
			}
		}

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("duration: " + duration / 1000 + " seconds");
    }

	private static int getDivisorsCount(Map<Integer, Integer> primeDivisors) {
		int divisorsCount = 1;
		for (Map.Entry<Integer, Integer> entry : primeDivisors.entrySet()) {
			divisorsCount *= 1 + entry.getValue();
		}
		return divisorsCount;
	}
}