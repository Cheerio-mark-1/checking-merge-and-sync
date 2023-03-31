package tests;


import com.sun.security.jgss.GSSUtil;

public class Hello {
    public static void main(String[] args) throws InterruptedException {
        String name = "Hello there";
        String output = "";

//        65-90-97-122
        int code = 65;
        int pointer = 0;

        while ((name != output) && (pointer < name.length())) {
            Thread.currentThread().sleep(250);

            char letter = name.charAt(pointer);

//            if it's uppercase


            char iter = (char) (code);


            System.out.println(output + iter);


//            if the letter is space
            if (letter == (char) (' ')) {
                output += ' ';
                pointer++;

            }


            if (letter == iter) {
                output += iter;
                code = 65;
                pointer++;
            }

            if (code > 122) {
                System.out.println("not found");
                break;
            }

            code++;
//            terminating conditions


        }


    }

}
/**
 * A -Z = 65 - 90
 * a = 97
 * 65-122 all charactuers
 * if (letter == (char) (code)) {
 * output += letter;
 * <p>
 */