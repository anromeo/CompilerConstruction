import java.lang.System;

public class OrTest {
	public static void main(String[] args) {
//		if (true && true) {
//			System.out.println("both true");
//		}
//		if (true && false) {
//			System.out.println("first true");
//		}
//
//		if (false && false) {
//			System.out.println("both false");
//		}
//		if (false && true) {
//			System.out.println("second true");
//		}
		
		if (true || true) {
			System.out.println("both true");
		}
		if (true || false) {
			System.out.println("first true");
		}
		if (false || false) {
			System.out.println("both false");
		}
		if (false || true) {
			System.out.println("second true");
		}
	}
}
