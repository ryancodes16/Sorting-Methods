/**
 * Insertion.java
 *
 * A sort() method that implements insertion sort.
 *
 * @author Ryan Regier
 * Wheaton College, CSCI 235, Fall 2019
 * Project 3
 * Date 10/3/2019
 */

public class Insertion {
	
	/**
     * Sort an array using insertion sort.
     * @param array The array to be sorted.
     * POSTCONDITION: The elements of array are in ascending order.
     */
    public static void sort(int[] array) {

        // insert code here
		int temp = 0; //
		int j = 0;	  // initialize variables needed
		for(int i = 1; i < array.length; i++){ //loop from 1 to array.length
			temp = array[i]; //temp to store arra[i]
			j = i -1; //j = i-1 which is why we loop from i = 1...
			while(j >= 0 && array[j] > temp){ //inner loop control
				array[j + 1] = array[j]; //set array[j+1] = array[j]
				j--;	//j-- and this is why we loop until j >= 0 and array[j] > temp which is = array[i]
			}
			array[j + 1] = temp;
		}


    }
}
