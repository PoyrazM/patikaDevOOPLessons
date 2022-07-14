package Inheritance;

public class Main {
    public static void main(String[] args) {
        //Employee employee = new Employee("Mertcan Poyraz","05123123123","test@gmail.com");

        /*
        Academician academician1 = new Academician(
                "Mertcan Poyraz",
                "05123123123",
                "test@gmail.com",
                "Civil Engineering",
                "Professor");
        */


        //academician1.leaveSchool();
        //System.out.println(academician1.getDepartment()+"\n"+academician1.getTitle());
        //academician1.enterLesson();

        //Officer officer1 = new Officer("Harry Osborn","05428582639","harry@icloud.com","Finance","09:00-18:00");
        //officer1.workable();
        //System.out.println(officer1.getOfficeDepartment());

        Lecturer lecturer1 = new Lecturer("Mark Thompson","56668723","mark@gmail.com","Computer Engineering","Dr.",1);
        lecturer1.enterLesson("09:00");
        //System.out.println(lecturer1.getDoorNumber());
        //lecturer1.setDoorNumber(23);
        //System.out.println(lecturer1.getDoorNumber());
        //lecturer1.enterLesson();

        Staff staff = new Staff("Venom","0545124512","venom@hotmail.com","Guard","00:00-10:00","Protect");
        staff.workable("SECURITY");
        //staff.watch();
        InformationTechnology iT = new InformationTechnology("Sandman","654605405","sandman@mail.com","Software Development","10:00 - 19:00","Java Developer");
        iT.workable("IT");

        //Method overloading
        //lecturer1.enterSchool("13:00");
        //lecturer1.enterSchool("09:00","18:00");
/*
        //Method Overriding
        academician1.enterSchool();
        lecturer1.enterSchool();
        employee.enterSchool();
        officer1.enterSchool();
*/
/*
        // Polymorphism
        Employee academican2 = new Academician("Peter Parker", "0512314563", "peter@gmail.com", "Software Engineering", "Doctor");
        academican2.enterSchool();
        academican2.enterDinnerHall();
        academican2.leaveSchool();
*/

        // Polymorphism 2
        //Employee[] enterPersons = {academician1,officer1,staff,lecturer1,employee};
        //Employee.enterSchoolPersons(enterPersons);
    }
}
