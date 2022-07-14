package Encapsulation;

public class Main {

    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter",250);
        System.out.println("Book Name \t:"+harryPotter.getName());
        System.out.println("Book Pages \t:"+harryPotter.getPageNumber());
        Book lotr = new Book("Lord Of the Rings",-200);

        System.out.println(lotr.getName()+"\t"+lotr.getPageNumber());
        lotr.setPageNumber(1000);
        lotr.setName("Ahmet");
        System.out.println(lotr.getName()+"\t"+lotr.getPageNumber());
    }
}
