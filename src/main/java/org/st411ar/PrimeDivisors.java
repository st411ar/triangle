package org.st411ar;

import java.util.HashMap;
import java.util.Map;

class PrimeDivisors {
	private int number;
	private Map<Integer, Integer> primeDivisors;

	PrimeDivisors(int number, Primes primes) {
		primeDivisors = new HashMap<Integer, Integer>();
		this.number = number;
		primes.update(number);
		for (int prime : primes.getNumbers()) {
			int power = 0;
			while (number % prime == 0) {
				power++;
				number /= prime;
			}
			if (power > 0) {
				primeDivisors.put(prime, power);
			}
		}
	}

	int getNumber() {
		return number;
	}

	int getSize() {
		return primeDivisors.size();
	}

	Map<Integer, Integer> getNumbers() {
		return primeDivisors;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("primes divisors of ");
		sb.append(number);
		sb.append(" have size ");
		sb.append(primeDivisors.size());
		sb.append(": ");
		sb.append(primeDivisors.toString());
		return sb.toString();
	}
}