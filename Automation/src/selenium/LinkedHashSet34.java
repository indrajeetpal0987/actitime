package selenium;

import java.util.LinkedHashSet;

public class LinkedHashSet34 {
public static void main(String[] args) {
	LinkedHashSet<String> s1 = new LinkedHashSet<String>();
	s1.add("A1");
	s1.add("A2");
	s1.add("Sheela");
	s1.add("dinga");
	System.out.println(s1);
	System.out.println("======================");
	for (String v : s1) {
		System.out.println(v);
	}
}
}
