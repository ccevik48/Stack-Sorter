/*
 * Purpose/Description: This program is to sort a stack of n integers
 * s, in descending order. An auxiliary stack was used, and a placeholder
 * variable, min; and only push, pop, peek, isEmpty functions were 
 * used. 
 * The time complexity of this algorithm is O(n^2) because
 * two while loops are utilized, and for each element, n, in
 * the stack, the inner loop goes through it n times,
 * so n * n times is n^2.
 *
 */
package asg2_p4;

import java.util.*;

/**
 *
 * @author Can
 */
public class ASG2_P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>(); //  make new stack object, s

        s.push(12);       //insert values into stack
        s.push(1);
        s.push(4);
        s.push(13);
        s.push(8);
        s.push(7);
        s.push(65);
        s.push(10);
        
        System.out.println("Original order:\n" + s);  //without sort

        s = stackM.sort(s);

        System.out.println("Descending order:\n" + s); //after sort

    }

}
