class Student {
    String name;
    int english, maths, science;

    
    Student() {
        name = "samaviya";
        english = 95;
        maths = 98;
        science = 90;
    }

   
    void displayReportCard() {
        int total = english + maths + science;
        double average = total / 3.0;

        System.out.println("------ REPORT CARD ------");
        System.out.println("Nname    : " + name);
        System.out.println("english : " + english);
        System.out.println("maths   : " + maths);
        System.out.println("science : " + science);
        System.out.println("-------------------------");
        System.out.println("TOTAL   : " + total);
        System.out.printf("AVERAGE : %.2f\n", average);
        System.out.println("-------------------------");
    }
}

class resultcard {
    public static void main(String[] args) {
       
        Student s1 = new Student();

       
        s1.displayReportCard();
    }
}