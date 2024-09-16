package org.prgm1;


class InstanceCounter{
	
	public static int count;
	
	public InstanceCounter() {
		count++;
	}
	
	public static int print() {
		return count;
	}
}

public class Program1 {
	public static void main(String[] args) {
		InstanceCounter i1 = new InstanceCounter();	
		InstanceCounter i2 = new InstanceCounter();	
		InstanceCounter i3 = new InstanceCounter();	
	    InstanceCounter i4 = new InstanceCounter();	
		System.out.println(InstanceCounter.print());
	}
}
