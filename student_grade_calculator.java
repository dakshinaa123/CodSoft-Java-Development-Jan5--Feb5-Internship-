import java.util.Scanner;

public class student_grade_calculator {
    public static void main(String[] args) {
        // Intializing Objects
        Scanner in = new Scanner(System.in);

        // Intializing Variables
        int english;
        int math;
        int physics;
        int chemistry;
        int computer_science;
        String name;
        int sum;
        int average;
        int percentage;

        // Designing Grade Calculator
        do{
            // Collecting Marks
            System.out.println("----- GRADE CALCULATOR -----");
            System.out.print("Enter Student Name: ");
            name = in.nextLine();
            System.out.println("Enter Student's Marks out of 100:--");
            System.out.print("In English: ");
            english = in.nextInt();
            System.out.print("In Math: ");
            math = in.nextInt();
            System.out.print("In Physics: ");
            physics = in.nextInt();
            System.out.print("In Chemistry: ");
            chemistry = in.nextInt();
            System.out.print("In Computer Science: ");
            computer_science = in.nextInt();

            // Summing Marks and Averaging it
            sum = english + math + physics + chemistry + computer_science;
            average = sum/5;
            percentage = average*100;

            // Assigning Grade
            if(percentage>=81 || percentage<=100){
                System.out.println("Grade: A");
            } else if(percentage>=61 || percentage<=80){
                System.out.println("Grade: B");
            }
            else if(percentage>=41 || percentage<=60){
                System.out.println("Grade: C");
            }
            else if(percentage>=21 || percentage<=40){
                System.out.println("Grade: D");
            } else{
                System.out.println("Grade: E");
            }
            break;
        } while(true);
    }
}
