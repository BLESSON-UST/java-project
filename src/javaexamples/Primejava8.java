package javaexamples;

import java.util.ArrayList;

public class Primejava8 {
	public static void main(String[] args)
	{
 
		        ArrayList<Integer> numbers = new ArrayList<Integer>();
		        numbers.add(2);
		        numbers.add(3);
		        numbers.add(4);
		        numbers.add(5);
		        numbers.add(6);
		        numbers.add(7);
		        numbers.add(8);
		        numbers.add(9);
		        numbers.add(10);

		        ArrayList<Integer> primes = new ArrayList<Integer>();
		        for (int num : numbers) {
		            if (isPrime(num)) {
		                primes.add(num);
		            }
		        }

		        System.out.println("Prime numbers in the ArrayList: " + primes);
		    }

		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }

		        for (int i = 2; i <= Math.sqrt(num); i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }
		

	}


