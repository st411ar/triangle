package org.st411ar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		long startTime = System.currentTimeMillis();
		Primes primes = new Primes();
		primes.update(10000);
		System.out.println(primes);
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("duration: " + duration);
    }
}
