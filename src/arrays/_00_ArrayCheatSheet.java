package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] number = {"12","13","14","15","16"};
		//2. print the third element in the array
		System.out.println(number[2]);
		//3. set the third element to a different value
		number[2] = "17";
		System.out.println(number[2]);
		//4. print the third element again
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE

			for (int i=0;i<number.length;i++) {
			     System.out.println(number[i]);
			}
		//6. make an array of 50 integers
		for(String num : number) {
			System.out.println(num);
		}
		int[] ints = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		
		for(int i=0;i<ints.length;i++) {
			Random ran = new Random();
		
		ints[i] = ran.nextInt(50);
		
		}
		for(int i : ints) {
			System.out.println(i);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		int sn = 0;
		for(int i=0;i<ints.length;i++) {
			if(ints[i] < sn) {
			sn=ints[i];
			
		}
		}
				System.out.println(sn);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
				for(int i=0;i<ints.length;i++) {
					if(ints[i] > sn) {
					sn=ints[i];
					
				}
					
	}
				System.out.println(sn);	
	}
}
