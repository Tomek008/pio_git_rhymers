package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public static final int TOTAL_REJECTED_START = 0;
	int totalRejected = TOTAL_REJECTED_START;

	public int reportRejected() {
		return totalRejected;
	}
	@Override
	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++;
	else
		super.countIn(in);
	}
}
