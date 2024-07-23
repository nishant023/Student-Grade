import java.util.Scanner;
public class StudentGrade {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            //input to take number of total subject
            System.out.println("Enter number of subjects");
            int subject= sc.nextInt();
            System.out.println("Enter marks of the subjects:");
            int marks=0;

            //taking marks as input
            for (int i = 1; i <=subject ; i++) {
                System.out.println("Marks in subject "+i+" =");
                int mark=sc.nextInt();
                marks=marks+mark;
            }

            //printing details as marks,average percentage and grade.
            System.out.println("Total marks in "+subject+" subjects is "+marks+" out of "+subject*100);
            double average=marks/(subject);
            System.out.println("Average percentage is "+average+" %.");


            if(average>=80){
                System.out.println("Grade is A");
            }
            else if (average<=79 && average>=60) {
                System.out.println("Grade is B");
            }
            else if (average<60 && average>=45) {
                System.out.println("Grade is C");
            }
            else if (average<44 && average>=30) {
                System.out.println("Grade is D");
            }

        }
}

