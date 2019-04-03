import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student student1= new Student();
        Scanner scan = new Scanner(System.in );
        boolean a =true;
        while (a==true){
//////////////// MENU
            System.out.println("Please select number of operation");

            System.out.println("1-Show student information");
            System.out.println("2-Show ALL student information");
            System.out.println("3-Update student information");
            System.out.println("4-Delete student information");
            System.out.println("5-Show GPA ");
            System.out.println("6-Show the Average GPA");
            System.out.println("7-Exit Menu ");

            int operation = scan.nextInt();

            switch (operation){

                case 1 :
                    student1.showInfo();
                    break;

                case 2 :
                    student1.showAllInfo();
                    break;

                case 3 :
                    student1.updateInfo();
                    break;

                case 4 :
//student1.deleteInfo();

                    break;

                case 5 :
                    student1.setGpa();
                    break;

                case 6 :
                    student1.avarageGpa();
                    break;

                case 7 :
                    a=false;
                    student1.insertionSort(args);
                    break;

                case 8 :
                    student1.insertionSort(args);
                    break;

                case 9 :
                    student1.selectionSort(args);
                    break;

                default:
                    System.out.println("Please enter a number from 1 to 7");
                    break;

            }}

    }

}