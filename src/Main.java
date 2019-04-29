public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Felipe's World!");

        Message m = new Message("dit bericht wordt gewijzigd in: Hallo Filip...");
        System.out.println(m.toString());

        Student s = new Student("Jefke");
        System.out.println("Student added : " + s.getName());

        Docent d = new Docent();
        d.setDocent( "Walter" );
        System.out.println("Docent : " + d.toString() );
    }
}
