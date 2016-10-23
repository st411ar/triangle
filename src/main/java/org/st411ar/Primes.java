package org.st411ar;

import java.util.ArrayList;
import java.util.List;

class Primes {
	private int max;
	private List<Integer> numbers;

	Primes() {
		max = 2;
		numbers = new ArrayList<Integer>();
		numbers.add(2);
	}

	int getMax() {
		return max;
	}

	int getSize() {
		return numbers.size();
	}

	List<Integer> getNumbers() {
		return numbers;
	}

	void update(int newMax) {
		if (newMax > max) {
			for (++max; max <= newMax; max++) {
				if (isPrime(max)) {
					numbers.add(max);
				}
			}
			max--;
		}
	}

	private boolean isPrime(int number) {
		int stop = (int) Math.sqrt(number);
		for (int prime : numbers) {
			if (prime > stop) break;
			if (number % prime == 0) return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("numbers before ");
		sb.append(max);
		sb.append(" have size ");
		sb.append(numbers.size());
		sb.append(": ");
		sb.append(numbers.toString());
		return sb.toString();
	}
}