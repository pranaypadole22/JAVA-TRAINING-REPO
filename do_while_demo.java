package day_1;
//The do-while loop in Java ensures that the code block executes at least once before the condition is checked.

import java.io.*;

class do_while_demo {
    public static void main(String[] args)
    {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }
}

