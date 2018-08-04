
package com.capgemini.staticandnonstatic;

//Test1 contains static and non-static member functions and variables
class Test1 {

	static int j = 12;
	int i = 45;

	// static member functions cannot contain non-static member variables
	static public void m1() {
		// System.out.println("i : "+i);
		System.out.println("j : " + j);
	}

	// non-static member functions can have both static as well as non-static member
	// variables
	public void m2() {
		System.out.println("i : " + i);
		System.out.println("j : " + j);
	}
}
