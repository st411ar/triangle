package org.st411ar;

import java.util.ArrayList;
import java.util.List;

class Primes {
	private int max;
	private List<Integer> primes;

	Primes() {
		max = 2;
		primes = new ArrayList<Integer>();
		primes.add(2);
	}

	int getMax() {
		return max;
	}

	int getSize() {
		return primes.size();
	}

	List<Integer> getNumbers() {
		return primes;
	}

	void update(int newMax) {
		if (newMax > max) {
			for (++max; max <= newMax; max++) {
				if (isPrime(max)) {
					primes.add(max);
				}
			}
			max--;
		}
	}

	private boolean isPrime(int number) {
		int max = (int) Math.sqrt(number);
		for (int prime : primes) {
			if (prime > max) break;
			if (number % prime == 0) return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("primes before ");
		sb.append(max);
		sb.append(" have size ");
		sb.append(primes.size());
		sb.append(": ");
		sb.append(primes.toString());
		return sb.toString();
	}
}