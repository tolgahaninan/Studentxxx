import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {

    Scanner scan = new Scanner(System.in );

////// VARIABLES ///////

    private double [] course1Grade = {18,25,96,65,45,77,65,11,88,95,66,74,45,87,17,54,49,99,23,31};
    private double [] course2Grade=  {26,85,14,77,56,49,94,85,56,78,87,44,15,44,78,45,66,55,88,74};
    private double [] course3Grade = {77,88,46,73,72,49,81,12,49,85,46,58,59,47,16,46,55,22,32,44};
    private double [] course4Grade=  {31,26,59,89,97,94,56,24,86,54,89,65,26,35,14,77,79,55,66,17};
    private double [] course5Grade=  {96,45,63,35,34,18,97,92,29,34,65,49,77,73,19,65,61,61,22,25};
    private double [] gpa = new double [20] ;


    String[] name1 = new String [20];
    String[] surname1 = new String [20] ;
    public String[] id1 = {"B100","B101","B102","B103","B104","B105","B106","B107","B108","B109","B110","B111","B112","B113","B114",
            "B115","B116","B117","B118","B119"};

/////// METHODS

    public void showInfo(){

        System.out.println("Please enter the id of student which you want to show info of it");
        String selected = scan.nextLine();



        int flag = 0;
        for (int i=0;i<id1.length;++i){
            if (selected.equals(id1[i])){
                flag=i;
                System.out.println("Selected student's infos are :");
                System.out.println("ID : "+id1[flag]+"  NAME: "+name1[flag]+"SURNAME: "+surname1[flag]);
            }


        }
    }

    public void showAllInfo(){

        for (int i=0;i<id1.length;i++){
            System.out.println("Id:"+id1[i]+"Name:"+name1[i]+"Surname:"+surname1[i]);

        }

    }


    public void updateInfo (){

        System.out.println("Please enter the id of student which you want to update");
        String selected = scan.nextLine();

        int i;
        int flag = 0;
        for (i=0;i<id1.length;i++){
            if (selected.equals(id1[i])){
                flag=i;
                System.out.println("Selected student's infos are :");
                System.out.println("ID: "+id1[flag]+"  NAME: "+name1[flag]+"  SURNAME: " +surname1[flag]);

                System.out.println("Which information will be changed?");
                System.out.println("1-Name of student");
                System.out.println("2-Surname of student");
                System.out.println("3-Grades of student");}}


        int choosen = scan.nextInt();

        switch(choosen){

            case 1 :
                System.out.println("Please enter the new name");
                String nameUp=scan.next();
                name1[flag]=nameUp ;
                System.out.println("New name of " +id1[flag] + "student is"+name1[flag]);

                break;

            case 2 :
                System.out.println("Please enter the new surname");
                String surnameUp=scan.next();
                surname1[flag]=surnameUp;
                System.out.println("New name of " + id1[flag] + "  student is  " +surnameUp);

                break;

            case 3 :
                System.out.println("Please enter the first grade of student");
                int grade1UP=scan.nextInt();
                course1Grade[flag]=grade1UP;

                System.out.println("Please enter the second grade of student");
                int grade2UP=scan.nextInt();
                course2Grade[flag]=grade2UP;

                System.out.println("Please enter the third grade of student");
                int grade3UP=scan.nextInt();
                course3Grade[flag]=grade3UP;

                System.out.println("Please enter the fourth grade of student");
                int grade4UP=scan.nextInt();
                course4Grade[flag]=grade4UP;

                System.out.println("Please enter the fifth grade of student");
                int grade5UP=scan.nextInt();
                course5Grade[flag]=grade5UP;


                break;

            default :
                System.out.println("Please enter a number from 1 to 3");
                break;

        }

    }


/*public void deleteInfo (){

System.out.println("Please enter the id of student which you want to delete selected infos of it");
String selected = scan.nextLine();

int i;
int flag = 0;
for (i=0;i<id1.length;i++){
if (selected.equals(id1[i])){
flag=i;
System.out.println("Selected student's infos are :");
System.out.println("ID: "+id1[flag]+"  NAME: "+name1[flag]+"  SURNAME: " +surname1[flag]);

System.out.println("Which information will be deleted?");
System.out.println("1-Name of student");
System.out.println("2-Surname of student");
System.out.println("3-Grades of student");
}}

int choosen = scan.nextInt();

switch(choosen){

case 1 :
name1[flag]=null ;

break;

case 2 :
surname1[flag]=null;

break;

case 3 :
	double [] a = new double [1];
course1Grade[flag]=a[0];
System.out.println(course1Grade[flag]);
course2Grade[flag]=a[0];
course3Grade[flag]=a[0];
course4Grade[flag]=a[0];
course5Grade[flag]=a[0];
break;

default :
System.out.println("Please enter a number from 1 to 3");
break;

}

}*/


    public void setGpa() {

        System.out.println("Please enter the id of student which you want to show gpa of it");
        String selected = scan.nextLine();

        int i;
        int flag = 0;
        for (i=0;i<id1.length;i++){
            if (selected.equals(id1[i])){
                flag=i;}
        }
        gpa[flag]=(course1Grade[flag]+course2Grade[flag]+course3Grade[flag]+course4Grade[flag]+course5Grade[flag])/5;
        System.out.println("Gpa of "+id1[flag]+("  numbered student is  ")+gpa[flag]);
    }



    public double[] getGpa() {
        return gpa;
    }

    public void avarageGpa(){

        double avg=0;
        for (int i=0;i<id1.length;i++){
            avg=((course1Grade[i]+course2Grade[i]+course3Grade[i]+course4Grade[i]+course5Grade[i])/5)+avg;
        }
        double real= avg/id1.length;
        System.out.println("The average GPA is :"+real);

    }
    public void selectionSort (String[] args){
        System.out.println("Selection sorted form of course1Grades");

        int i,j;

        i = 0;
        while (i<course1Grade.length)
        {

            int index_of_smallest = i;
            for(j=i; j<course1Grade.length; j++)
            {
                if (course1Grade[j]<course1Grade[index_of_smallest])
                    index_of_smallest = j;
            }

            double temp = course1Grade[i];
            course1Grade[i] = course1Grade[index_of_smallest];
            course1Grade[index_of_smallest] = temp;

            i++;
        }

        for(double x : course1Grade)
        {
            System.out.println(x);
            double searchVal =18.0;
            double m = Arrays.binarySearch(course1Grade, searchVal);
            System.out.println("The index of element is "+m);

        }

    }
    public  void insertionSort (String[] args){

        System.out.println("Insertion sorted form of course1Grades");

        for(int i=0;i<course1Grade.length;i++)
        {
            int j = i;


            while(j>0)
            {

                if(course1Grade[j-1] > course1Grade[j])
                {

                    double temp = course1Grade[j-1];
                    course1Grade[j-1] = course1Grade[j];
                    course1Grade[j] = temp;
                }

                else
                {
                    break;
                }
                j--;
            }
        }

        for(double x : course1Grade)
        {
            System.out.println(x);
        }}
}
/*this.flag=flag;
this.gpa = gpa;
this.course1Grade= course1Grade;
this.course2Grade = course2Grade;
this.course3Grade = course3Grade;
this.course4Grade = course4Grade;
this.course5Grade = course5Grade;


System.out.println("Please enter the id of student which you want to show gpa of it");
String selected = scan.nextLine();

for (int i=0;i<id1.length;i++){
if (selected.equals(id1[i])){
System.out.println("Selected student's GPA is =" +gpa);}
}
return gpa; }

}*/