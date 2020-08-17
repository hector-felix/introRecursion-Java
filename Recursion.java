/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author mac
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        int[] test1 = {1, 2, -3, -4, 5};

        System.out.println("Array Positive (T/F): " + isPos(test, 0));
        System.out.println("Array Positive (T/F): " + isPos(test1, 0));

// TODO code application logic here
    }

    public static boolean isPos(int array[], int i) {
        if (i < array.length) {
            if (array[i] < 0) {
                return false;
            } else {
                return isPos(array, i + 1);
            }

        }
        return true;
    }
}
