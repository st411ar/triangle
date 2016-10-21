package org.st411ar;

public class App {
    public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Primes primes = new Primes();
		primes.update(1000000);
		System.out.println("primes.getSize(): " + primes.getSize());
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("duration: " + duration);
    }
}