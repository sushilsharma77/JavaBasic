package com.homework.class4;

import java.util.*;

public class Repl190 {

	public static void main(String[] args) {
		Set<String>h=new HashSet<>();
		h.add("third");
		h.add("first");
		h.add("second");
		
		System.out.println(h);
		h.removeAll(h);
		System.out.println(h);
	}

}
