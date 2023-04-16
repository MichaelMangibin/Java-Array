/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 193
 */
public class TwoDimensionalArray {
    public static void main(String[] args)
    {
        // create 2d array
        int [][] a = {
            {1, 2, 3},
            {4, 5, 6, 9},
            {7}
        };
        
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
    
}
