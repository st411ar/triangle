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
			while (number % prime == 0) {
				Integer power = primeDivisors.get(prime);
				if (power == null) {
					primeDivisors.put(prime, 1);
				} else {
					primeDivisors.put(prime, power + 1);
				}
				number /= prime;
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