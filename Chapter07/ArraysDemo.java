/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess7Codes;

/**
 *
 * @author Admin3
 */
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args)
    {
        int nums[] = {5, 7, 2, 9, 4, 8, 6, 5, 1};
        int nums1[] = {5, 7, 2, 9, 4, 8, 6, 5, 1};
        
        // check for equality of arrays
        System.out.println("Arrays are equal? "+ Arrays.equals(nums, nums1));
        // Sort a specific range of array in 
        // ascending order
        Arrays.sort(nums, 0, 3);
        System.out.println("Sorted array in range" + 
               " of 0-3: " + Arrays.toString(nums));
 
        // Sort the complete array 
        // in ascending order
        Arrays.sort(nums);
        System.out.println("Completely sorted array: "
                                  + Arrays.toString(nums));
        
        // Copy the whole array
        int[] copyNums = Arrays.copyOf(nums, nums.length);
        System.out.println("Copied array: " + 
                           Arrays.toString(copyNums));
 
        // Copy a specified range of an array.
        int[] rCopyNums = Arrays.copyOfRange(nums, 1, 4);
        System.out.println("Copied subarray: " + 
                           Arrays.toString(rCopyNums));
        
        // Fill a range with a particular value
        Arrays.fill(nums, 0, 4, 0);
        System.out.println("Array filled with 0 "+
          "from 0 to 4: " + Arrays.toString(nums));
 
        // Fill complete array with a specific value
        Arrays.fill(nums, 31);
        System.out.println("Array completely filled"+
                  " with 31: "+Arrays.toString(nums));
        
          // To print the array in string form
        System.out.println("String form of array: "+Arrays.toString(nums));
                                
        Integer nums2[] = {5, 7, 2, 9, 4, 8, 6, 5, 1};
        // Creates a wrapper list over nums2[]
        List<Integer> l1 = Arrays.asList(nums2);
 
        System.out.println("Array as List: "+l1);        
    }
}
