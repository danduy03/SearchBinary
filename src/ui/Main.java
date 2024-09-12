/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import bo.SearchArray;
import utils.ArrayUtils;
import utils.NumberUtils;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        int n = NumberUtils.getInt("Please input number of array[1-20]: ", 1, 20);
        int[] array = ArrayUtils.getRandomArray(n, 20);
        SearchArray searchArray = new SearchArray(array);
        ArrayUtils.getDisplayArray(searchArray.getArray());
        
        int x = NumberUtils.getInt("Please input found number: ", 1, 20);
        int index = searchArray.binarySearch(x);
        if(index == -1){
            System.out.println("The number " + x + " not found in array");
        }else{
            System.out.println("The number " + x + " found at index " + index);
        }
    }
    
}
