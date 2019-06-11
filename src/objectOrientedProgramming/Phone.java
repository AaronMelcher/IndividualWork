package objectOrientedProgramming;

public class Phone {
	private long number;
	private long speedDial;
	private long lastCalled;
	final private int EMERGENCY = 911;
	private int numCalls;
	private double lengthCalls;

	public Phone() {

	}
	public Phone(long numberX, long speedDialX, long lastCalledX, int numCallsX, int lengthCallsX) {
		number = numberX;
		speedDial = speedDialX;
		lastCalled = lastCalledX;
		numCalls = numCallsX;
		lengthCalls = lengthCallsX;
	}
	public void makeCall(long xSent, double xMin) {
		lastCalled = xSent;
		lengthCalls += xMin;
		numCalls++;
	}
	public int getCalls() {
		return numCalls;
	}
	public double getLength() {
		return lengthCalls;
	}
	public long getNumber() {
		return number;
	}
	public long lastCalled() {
		return lastCalled;
	}
	public long getSpeedDial() {
		return speedDial;
	}
	public int getEmergency() {
		return EMERGENCY;
	}
}