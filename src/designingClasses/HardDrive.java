package designingClasses;

import java.util.ArrayList;

public class HardDrive {
	private String name;
	private ArrayList<Double> fileSpace;
	private double capacity;
	private double free;

	public HardDrive(String xName, double xCap) {
		fileSpace = new ArrayList<Double>();
		name = xName;
		capacity = xCap;
		free = xCap;
	}

	public void addFile(double xSize) {
		if (free >= xSize) {
			fileSpace.add(xSize);
			free -= xSize;
		} else {
			fileSpace.add(xSize);
			free = 0;
		}
	}

	public void deleteFile(int num) {
		free += fileSpace.get(num);
		fileSpace.remove(num);
	}

	public boolean isFull() {
		if (free == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		
		
		if (free == capacity) {
			return true;
		} else {
			return false;
		}
	}

	public String getInfo() {
		return "Name: " + name + " Size: " + capacity + " Free Space: " + free;
	}

}
