/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 193
 */
public class ThreeDimensionalArray {
    public static void main(String[] args)
    {
        // create 3d array
        int[][][] test = {
            {
                {1, -2, 3},
                {2, 3, 4}
             },
             {
                 {-4, -5, 6, 9},
                 {1},
                 {2, 3}
             }
          };
        
        // for..each loop to iterate through elements of 3d array
        for(int[][] array2D: test) {
            for(int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }
    }
}
