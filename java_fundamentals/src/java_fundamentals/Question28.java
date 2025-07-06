package java_fundamentals;
import java.util.*;
public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		    
		        // Step 1: Initialize the array
		        int[] numbers = {12, 34, 12, 45, 67, 89};

		        // Step 2: Use LinkedHashSet to remove duplicates and maintain order
		        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

		        for (int num : numbers) {
		            uniqueNumbers.add(num);
		        }

		        // Step 3: Print the unique values
		        System.out.println("Array after removing duplicates:");
		        for (int num : uniqueNumbers) {
		            System.out.print(num + " ");
		        }
		    }
		

	}


