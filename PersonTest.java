package java_coding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Hello World 2!");
		
		// VARIABLES
		// primitive data types
		int hello_world = 5;
		double num2 = 5.0;
		boolean l = true;
		char t = 'h';
		
		String str = "9";
		int tim = hello_world;
		
		System.out.println(hello_world);
		
		// BASIC OPERATIONS
		int x = 5;
		int y = 7;
		int z = 56;
		int sum = (x * y) + z;
		
		// division
		int a = 5;
		int b = 7;
		double c = 57;
		double u = c / b;
		
		// raise to the power
		double d = Math.pow(x, y);
		
		// type casting
		double f = x / (double)y;
		
		// the remainder %
		int e = 56 % 5;
		System.out.println(e);
		
		// INPUT & SCANNERS
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();
		int scanned = sc.nextInt();
		boolean scanned = sc.nextBoolean();
		double scanned = sc.nextDouble();
		System.out.println(scanned);
		
		// converting the input from string to integer
		String scanned = sc.next();
		int g = Integer.parseInt(scanned);
		System.out.println(g);
		
		// CONDITIONS & BOOLEANS
		int h = 6;
		int i = 7;
		int j = 10;
		// comparing operator types are > , < , == , >= , <= , !=
		boolean compare = h != i;
		
		// comparing multiple operators
		boolean compare = h > i && j < i ;
		boolean compare = h > i || j < i ;
		boolean compare = !(false);
		
		System.out.println(compare);
		
		// IF / ELSE / ELSE IF
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if (s.equals("tim")) {
			System.out.println("You typed tim");
		}
		else if (s.equals("hello")) {
			System.out.println("Hi");
		}
		else if (s.equals("hi")) {
			System.out.println("Ciao");
		}
		else {
			System.out.println("Print");
		}
		
		// NESTED STATEMENTS
		System.out.print("Input your age: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);
		
		if (age >= 18) {
			System.out.print("Input your fav food: ");
			String food = sc.nextLine();
			
			if (food.equals("Pizza")) {
				System.out.println("Mine too!");
			}
			else {
				System.out.println("Not mine");
			}
			
		}
		else if (age >=13) {
			System.out.println("You are a Teenager!");
		}
		else {
			System.out.println("You are not a Teenager nor Adult!");
		}
		
		// ARRAYS
		String[] newArr = new String[5];
		newArr[0] = "Hello";
		newArr[1] = "My";
		newArr[2] = "Name";
		newArr[3] = "Is";
		newArr[4] = "Dan";
		
		String x = newArr[4];
		System.out.println(x);
		
		int[] nums = {3, 6, 25, 10, 55};
		
		double[] nums2 = {7.0, 2.5, 8.1};
		
		int y = nums[2];
		System.out.println(y);
		
		// FOR LOOPS
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		
		for (int x = 0; x <= x; x+=5) {
			System.out.println(x);
		}
		
		// looking for a value within an array with loop
		int[] arr = {1,3,5,7,3,11};
		
		for (int a = 0; a < arr.length; a++) {
			if (arr[a] == 3) {
				System.out.println("Found a 3! at index " + a);
			}
		}
		
		Loops (continued)
		int[] arr = {1,5,7,3,4,5};
		
		// outputting the elements of the array and it's index
		int count = 0;
		for (int element:arr) {
			System.out.println(element + " " + count);
			count++;
		}
		
		// populate an array with loops and break at some point
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("Input: ");
			String input = sc.nextLine();
			names[i] = input;
		}
		
		for (String n:names) {
			System.out.println(n);
			if (n.equals("tim")) {
				break;
			}
		}



		// WHILE LOOPS and count
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a number: ");
		int x = sc.nextInt();
		
		int count = 0;
		while (x != 10) {
			System.out.println("Type 10...");
			System.out.print("Type a number: ");
			x = sc.nextInt();
			count++;
		}
		System.out.println("You tried " + count + " times");
		
		
		// DO WHILE loop is even better
		Scanner sc = new Scanner(System.in);
		int x;
		
		do {
			System.out.print("Type a number: ");
			x = sc.nextInt();
		} while (x != 10);
		
		
		// SETS AND LISTS
		Set<Integer> t = new HashSet<Integer>();
		t.add(5);
		t.add(7);
		t.add(5);
		t.add(9);
		t.add(-8);
		t.remove(9);
		t.clear();
		t.isEmpty();
		t.size();
		
		int y = t.size();
		boolean x = t.contains(7);
		
		System.out.println(y);
		
		// lists
		ArrayList<Integer> t = new ArrayList<Integer>();
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		t.add(1);
		t.add(2);
		t.get(0);
		t.set(1, 5);
		t.subList(1, 3);
		
		System.out.println(t.subList(1, 4));
		
		// MAPS & HashMaps
		Map m = new HashMap();
		m.put("tim", 5);
		m.put("sam", "x");
		m.put(11, 999);
		
		m.containsValue(5);
		m.containsKey("sam");
		
		m.clear();
		m.isEmpty();
		
		System.out.println(m.values());
		


	}
	

}
