package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntStack;

/**
 * Ogólna klasa wyliczanki dostarczająca odpowiednie interfejsy.
 * W swoim działaniu przypomina stos.
 */
public class DefaultCountingOutRhymer {

	IntStack arrayStack = new IntLinkedList();

	public DefaultCountingOutRhymer(IntStack intStack) {
		this.arrayStack = intStack;
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
