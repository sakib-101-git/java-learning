package array;

public class Demo {
    public static void main(String[] args) {
        // // Creating a one dimensional array of rollnumbers and printing them
        // int rollNums[] = new int[3];

        // int x = 283;

        // for(int i=0; i<rollNums.length; i++){
        //     rollNums[i] = x;
        //     x++;
        // }

        // for(int i=0; i<rollNums.length; i++){
        //     System.out.println(rollNums[i]);
        // }

        // 2D Array
        // int marks[][] = new int[3][3]; //Declaring 2D array

        // marks[0][0] = 23;
        // marks[0][1] = 25;
        // marks[0][2] = 45;

        // marks[1][0] = 34;
        // marks[1][1] = 11;
        // marks[1][2] = 90;

        // marks[2][0] = 56;
        // marks[2][1] = 23;
        // marks[2][2] = 78;


        // for(int row = 0; row < marks.length; row++){
        //     for(int column = 0; column < marks[row].length; column++){
        //         System.out.print(marks[row][column] + " ");
        //     }

        //     System.out.println();
        // }

        // marks[0] = new int[1];
        // marks[1] = new int[2];
        // marks[2] = new int[3];

        // marks[0][0] = 23;

        // marks[1][0] = 34;
        // marks[1][1] = 11;

        // marks[2][0] = 56;
        // marks[2][1] = 23;
        // marks[2][2] = 78;

        // for(int row = 0; row < marks.length; row++){
        //     for(int column = 0; column < marks[row].length; column++){
        //         System.out.print(marks[row][column] + " ");
        //     }

        //     System.out.println();
        // }
        
        // Simplest way to define 2D Array
        int marks[][] = {
            {23,25,45},
            {34,11,90},
            {56,23,78}
        };

        for(int row = 0; row < marks.length; row++){
            for(int column = 0; column < marks[row].length; column++){
                System.out.print(marks[row][column] + " ");
            }
            System.out.println();
        }

        String firstName = "Sarah";
        String lastName = "Behen Ka Laurah";

        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }
}
