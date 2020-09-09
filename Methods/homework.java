package Methods;

import java.util.Arrays;

public class homework {
    //1 - CREATE A METHOD THAT TAKES 3 PARAMETERS AND MULTIPLIES ALL THREE NUMBERS
    public static void three(int a, int b, int c) {

        int multi = a * b * c;
        System.out.println(multi);
    }

    //2 - CREATE A METHOD THAT TAKES 1 PARAMETER AND JUST PRINTS OUT THE VALUE OF THE PARAMETER
    public static void randomColor(String color) {

        System.out.println(color);
    }

    // 3- CREATE A METHOD THAT TAKES 1 PARAMETER AND RETURNS THE VALUE OF THE PARAMETER
    public static String grade(String letterGrade) {

        return letterGrade;
    }

    //4- CREATE A METHOD THAT PRINTS ODD NUMBERS BETWEEN 13 AND 25
    public static void odd() {
        for (int x = 13; x < 26; x++) {
            if (x % 2 == 1) {
                System.out.println(x);
            }
        }
    }

    //5- CREATE A METHOD THAT RETURNS NOTHING BUT PRINTS OUT THE DIFFERENCE BETWEEN 10 AND 3
    public static void diff(){
        int x = 10;
        int y = 3;
        int answer = 10 - 3;
        System.out.println(answer);
    }
    //6- CREATE A METHOD THAT TAKES AN ARRAY OF NUMBERS AND MULTIPLIES EACH NUMBER IN THE ARRAY BY 3
    public static void multi(){

        int n = 3;
        int [] nums = {1,2,3,4,5};
        for (int x = 0; x < nums.length; x++){
            System.out.println(nums[x] * n);
        }

    }
    //7- CREATE AN ARRAY OF STRINGS TO HOLD 3 OF YOUR FAVORITE MOVIES AND JUST PRINT THEM OUT
    public static void movies(){
        String [] titles = {"Friday", "The Matrix", "Divergent"};
        System.out.println(Arrays.toString(titles));
    }

            public static void main(String[] args) {
        three(1,2,3);
        randomColor("blue");
        System.out.println("A");
        odd();
        diff();
        multi();
        movies();

    }
}

