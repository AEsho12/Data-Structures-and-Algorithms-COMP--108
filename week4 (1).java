//
// Enter your name:Ayodele Esho
// Enter your student ID:201499108
//
import java.util.*;
import java.io.*;

class COMP108W04 {

	// print the content of an array of size n
	static void printArray(int[] data, int n) {
		int i;

		for (i=0; i < n; i++)
			System.out.print(data[i] + " ");
		System.out.println();
	}

	// Input: array1[] with size1 entries and array2[] with size2 entries
	// print all entries of array1[] that does not exist in array2[]
	static void notExists(int array1[], int size1, int array2[], int size2) {

	}

	// Input: array1[] with size1 entries and array2[] with size2 entries
	// for each entry in array2[], count how many times it appears in array1[]
	static void count(int array1[], int size1, int array2[], int size2) {
		for (int i = 0; i < size2; i ++){
			for (int x = 0; x < size1; x++){
				if (array1[x] != array2[i]){
					System.out.print(array1[x] + " ");
				}
			}
		}

	}

}
