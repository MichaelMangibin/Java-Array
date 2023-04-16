/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 193
 */
public class TwoDimensionalArrayLoop {
    public static void main(String[] args)
    {
        int[][] a = {
            {1, -2, 3},
            {-4, -5, 6, 9},
            {7}
        };
        
        for(int i = 0; i < a.length; ++i)
        {
            for(int j = 0; j < a[i].length; ++j)
            {
                System.out.println(a[i][j]);
            }
        }
    }
    
}
