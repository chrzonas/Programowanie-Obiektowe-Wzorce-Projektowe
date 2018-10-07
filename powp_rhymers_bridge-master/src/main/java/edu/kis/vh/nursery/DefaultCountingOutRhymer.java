package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int max_total = -1;
	private static final int max_numbers = 12;

	private int[] NUMBERS = new int[max_numbers];

	public int total = max_total;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == max_total;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return max_total;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return max_total;
		return NUMBERS[total--];
	}

}
