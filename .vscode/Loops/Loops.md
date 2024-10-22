For loop:
For loop in programming is a control flow structure that iterates over a sequence of elements, such as a range of numbers, items in a list, or characters in a string. The loop is entry-controlled because it determines the number of iterations before entering the loop.

Below is the implementation of For loop in Programming

/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static void main(String[] args)
    {
        // Entry-controlled for loop
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
While loop :
A while loop in programming is an entry-controlled control flow structure that repeatedly executes a block of code as long as a specified condition is true. The loop continues to iterate while the condition remains true, and it terminates once the condition evaluates to false.

/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static void main(String[] args)
    {
        int i = 0;
        while (i < 5) {
            System.out.print(i + " ");
            i++;
        }
    }
}


Do-While loop :
A do-while loop in programming is an exit-controlled control flow structure that executes a block of code at least once and then repeatedly executes the block as long as a specified condition remains true. The distinctive feature of a do-while loop is that the condition is evaluated after the code block, ensuring that the block is executed at least once, even if the condition is initially false.

/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    public static void main(String[] args)
    {

        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < 5);
    }
}