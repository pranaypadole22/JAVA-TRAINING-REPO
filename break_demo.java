package day_1;
//The break statement in java is used to terminate from the loop immediately. When a break statement is encountered inside a loop, the loop iteration stops there,
// and control returns from the loop immediately to the first statement after the loop. Basically, break statements are used in situations when we are not sure
// about the actual number of iteration for the loop, or we want to terminate the loop based on some condition.

// Java program to demonstrate using
// break to exit a loop
class  break_demo {
    public static void main(String[] args)
    {
        // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // Terminate the loop when i is 5
            if (i == 5)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Out of Loop");
    }
}
