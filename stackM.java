/**
 * The time complexity of this algorithm is O(n^2) because
 * two while loops are utilized, and for each element, n, in
 * the stack, the inner loop goes through it n times,
 * so n * n times is n^2.
 */
package asg2_p4;

import java.util.*;

/**
 *
 * @author Can
 */
public class stackM {

    /**
     *
     * @param stk1: stack to be sorted
     * @param stk2: auxiliary stack to hold sorted values
     * @return the ordered stack in descending order
     */
    public static Stack<Integer> sort(Stack<Integer> stk1) {

        Stack<Integer> stk2 = new Stack<>();

        //if the stack is empty
        if (stk1.empty()) {
            return null;
        } 

        //if there is only one element, no need to sort
        else if (stk1.size() == 1) {
            return stk1;
        } 
        
        
        else {
            while (!stk1.isEmpty()) {
                int min = stk1.pop();   //variable to hold/compare value between stacks
                while (!stk2.isEmpty() && (stk2.peek() < min)) {
                    stk1.push(stk2.pop());
                }
                stk2.push(min);
            }
            return stk2;
        }
    }
}
