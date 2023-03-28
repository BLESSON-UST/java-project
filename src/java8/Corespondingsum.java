package java8;

public class Corespondingsum {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6};

	        int[] sumArray = new int[array.length / 2];

	        for (int i = 0; i < array.length / 2; i++) {
	            sumArray[i] = array[i] + array[array.length - 1 - i];
	        }

	        System.out.println("Sum of corresponding numbers:");
	        for (int i = 0; i < sumArray.length; i++) {
	            System.out.println(sumArray[i]);
	        }
	    }
	

}
