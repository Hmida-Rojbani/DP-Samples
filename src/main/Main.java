package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

final class Test {
	final private int x;
	final private String s;
	final private StringBuilder sb;

	public Test(int x, String s, StringBuilder sb) {
		super();
		this.x = x;
		this.s = s;
		this.sb = new StringBuilder(sb);
	}

	public int getX() {
		return x;
	}

	public String getS() {
		return s;
	}

	public StringBuilder getSb() {
		return new StringBuilder(sb);
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", s=" + s + ", sb=" + sb + "]";
	}

}

public class Main {

	public static void main(String[] args) {
		System.out.println(LocalDate.of(2021,2,29));
	}

}
