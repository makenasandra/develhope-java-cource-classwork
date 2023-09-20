package javabasics;

//Exercise - Input and output
//        create a class called PrintYourNameAndPi
//        inside the main method write two lines of code using System.out.printf that print:
//        your name ALL CAPS, using the %S converter, followed by a new line (%n converter)
//        the number Pi 3.141590, using the %f converter
//        the expected output should be this:
//        YOURNAME
//        The number Pi is: 3.141590
//        please note that the output of the number Pi could be 3,141590 (using the comma , instead of the dot .)

public class PrintYourNameAndPi {

    public static void main(String[] args) {
        System.out.printf("'%S' %n", "ginger");

        System.out.printf("The number Pi is %f",3.141590);
    }
}
