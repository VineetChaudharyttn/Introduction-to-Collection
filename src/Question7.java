/*Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(),
isFull() and an additional operation getMin() which should return minimum element from the SpecialStack.
 (Expected complexity ­ O(1))*/

import java.util.*;

public class Question7 {
    public static void main(String[] args)
    {
        CustomStack s = new CustomStack();
        s.push(5);
        s.push(3);
        s.getMin();
//        s.push(2);
//        s.push(1);
//        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}


