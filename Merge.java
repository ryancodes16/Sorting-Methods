/**
 * Merge.java
 *
 * This program implements Merge sort.
 *
 * @author Ryan Regier
 * Wheaton College, CSCI 235, Fall 2019
 * Project 3
 * Date 10/11/2019
 */

public class Merge {

    /**
     * Sort an array, in-place, using merging.
     * @param array The array to be sorted.
     * POSTCONDITION: The elements of array are in ascending order.
     **/
    public static void sort(int[] array) { //call the mergesort methods, acts like a driver method
        // insert code here
		int[] mergedArray = new int[array.length]; //create new array
		mergedArray = mergeSort(array); //call mergeSort
		for(int i = 0; i < array.length; i++){ //copy sorted elements to array passed in
			array[i] = mergedArray[i];
		}
    }

    /**
     * Extract the portion of an array from start up to (excluding) stop.
     * @param array The source array.
     * @param start The starting index (inclusive).
     * @param stop  The ending index (exclusive).
     * @return An array containing the same elements the portion of array.
     * PRECONDITION: 0 <= start <= stop <= array.length
     */
    private static int[] subarray(int[] array, int start, int stop) {

        // insert code here
		int[] newArray = new int[stop-start]; //create new array with size start point - stop point
		int place = 0; //placeholder variable for new array
		for(int i = start; i < stop; i++){ //start looping from start index to end index
			newArray[place] = array[i]; //new array gets element inserted at placeholder index with array[i]
			place++;
		}
        return newArray; //return new subarray

    }

    /**
     * Merge two sorted arrays into one new array.
     * @param first The first array, already sorted.
     * @param second The second array, already sorted.
     * @return A new array containing the elements of first and second,
     *         in order.
     */
    private static int[] merge(int[] first, int[] second) {
        // insert code here
		int[] mergedArray = new int[first.length + second.length];
		int i = 0, j = 0, k = 0; //i controls first, j second, k mergedArray index
		
		while(k < mergedArray.length){
			if(i < first.length && j < second.length){ //if elements remain in both arrays
				if(first[i] < second[j]){ 
					mergedArray[k] = first[i];
					i++; //increment i because first[i]
						//was added to new array
				} else if (second[j] < first[i]){
					mergedArray[k] = second[j];
					j++; //increment j because second[j] 
						//was added to new array
				} else if(first[i] == second[j]){
					mergedArray[k] = first[i];
					mergedArray[k+1] = second[j];
					i++;
					j++;
					k++;
				}
			} else if(i == first.length && j < second.length){
				mergedArray[k] = second[j];
				j++;
			} else if(i < first.length && j == second.length){
				mergedArray[k] = first[i];
				i++;
			}
			k++; //increment position index of mergedArray
		}
		
        return mergedArray;   // returns sorted array of 2 subarrays passed into method

    }

    /**
     * Sort an array by merging.
     * @param array The array to sort.
     * @return A new array containing the elements of array, in order.
     */
    private static int[] mergeSort(int[] array) {
		int[] array1, array2;
        // insert code here
		if(array.length == 1){ //base case
			return array;
		} else {
				array1 = subarray(array, 0, array.length/2);
				array2 = subarray(array, array.length/2, array.length);
				int[] x = new int[array1.length];
				x = mergeSort(array1); //recursive call
				int[] n = new int[array2.length];
				n = mergeSort(array2); //recursive call
				return(merge(x,n)); 
		}
    }


}
