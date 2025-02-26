package day_1;
//Continue:

//        The continue statement in Java is used to skip the current iteration of a loop. We can use continue statement inside any types of loops such as for,
//        while, and do-while loop. Basically continue statements are used in the situations when we want to continue the loop but do not want the
//        remaining statement after the continue
//        statement.
// Java program to demonstrates the continue
// statement to continue a loop
class continue_demo  {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            // If the number is 2
            // skip and continue
            if (i == 2)
                continue;

            System.out.print(i + " ");
        }
    }
}
