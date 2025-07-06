package java_fundamentals;

public class Question33 {

	public class Sample {
	    public static void main(String[] args) {
	        // Step 1: Check for exactly 4 command line arguments
	        if (args.length != 4) {
	            System.out.println("Please enter 4 integer numbers");
	            return;
	        }

	        // Step 2: Store the inputs in a 2x2 array
	        int[][] array = new int[2][2];
	        int index = 0;

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                array[i][j] = Integer.parseInt(args[index]);
	                index++;
	            }
	        }

	        // Step 3: Print the original array
	        System.out.println("The given array is:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(" " + array[i][j]);
	            }
	            System.out.println();
	        }

	        // Step 4: Print the reversed array
	        System.out.println("The reverse of the array is:");
	        for (int i = 1; i >= 0; i--) {
	            for (int j = 1; j >= 0; j--) {
	                System.out.print(" " + array[i][j]);
	            }
	            System.out.println();
	        }
	    }
	}

	}


