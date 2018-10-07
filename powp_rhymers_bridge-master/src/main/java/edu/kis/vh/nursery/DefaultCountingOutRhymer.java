package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int empty_stack = -1;
	private static final int full_stack = -1;
	private static final int stack_capacity = 12;

	private int[] NUMBERS = new int[stack_capacity];

	public int total = empty_stack;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == empty_stack;
	}

	public boolean isFull() {
		return total == full_stack;
	}

	protected int peekaboo() {
		if (callCheck())
			return empty_stack;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return empty_stack;
		return NUMBERS[total--];
	}

}
