/**
 * Selection.java
 *
 * A sort() method that implements selection sort.
 *
 * @Ryan Regier
 * Wheaton College, CSCI 235, Fall 2019
 * Project 3
 * Date 10/3/2019
 */

public class Selection {
 
	/**
     * Sort an array using selection sort.
     * @param array The array to be sorted.
     * POSTCONDITION: The elements of array are in ascending order.
     */
    public static void sort(int[] array) {

        // insert code here
		int smallestValue = array[0], temp = 0, smallestIndex = 0; //initialize variables needed
		for(int i = 0; i < array.length-1; i++){ //loop from index 0 to length-1
			smallestIndex = i; //set the smallestIndex = i
			for(int j = i+1; j < array.length; j++){ //loop from i + 1 to array.length
				if(array[j] < array[smallestIndex]){ 
					smallestIndex = j; //reassign smallestIndex if necessary
				}
			}
			temp = array[smallestIndex]; //assign the value at the smallestIndex to a temporary variable
			array[smallestIndex] = array[i]; //
			array[i] = temp;				// swap values
		}
		//System.out.println("Smallest value: " + smallestValue + " at index: " + smallestIndex);//for testing purposes only
	}
}