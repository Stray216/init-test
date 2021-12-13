package com.stray;

public class Main {

	public static void main(String[] args) {

		String hello = "Hello Darkness, my old Friend!";
		System.out.println(hello);
		System.out.println(hello.toLowerCase());
		System.out.println(hello.toUpperCase());

		for(int i = 0; i < 10; i++) {
			hello = Util.randomCase(hello);
			System.out.println(hello);
		}

		System.exit(69);

	}

}
