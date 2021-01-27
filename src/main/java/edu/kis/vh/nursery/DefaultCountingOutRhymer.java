package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;

/**
 * Ogólna klasa wyliczanki dostarczająca odpowiednie interfejsy.
 * W swoim działaniu przypomina stos.
 */
public class DefaultCountingOutRhymer {

	IntArrayStack arrayStack = new IntArrayStack();

	public DefaultCountingOutRhymer(IntArrayStack arrayStack) {
		this.arrayStack = arrayStack;
	}

	public void countIn(int in) {
		arrayStack.push(in);
	}

	public boolean callCheck() {
		return arrayStack.isEmpty();
	}

	public boolean isFull() {
		return arrayStack.isFull();
	}

	public int peekaboo() {
		return arrayStack.top();
	}

	public int countOut() {
		return arrayStack.pop();
	}

	public DefaultCountingOutRhymer(){ }
}
