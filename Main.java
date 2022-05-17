import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Service1 s = new Service1();
    
    Scanner scanner = new Scanne(System.in);
    boolean shouldContinue = true;
    while (shouldContinue) {
      System.out.println("1-Dodaj studenta");
      System.out.println("0-Wyjście");
      int userChoice = scanner.nextInt();
      switch (userChoice) {
        case 1:
          Scanner scanner = new Scanner(System.in);
          System.out.println("Podaj imię");
          String Imie = scanner.nextLine();

          System.out.println("Podaj wiek");
          int Wiek = scanner.nextInt();

          Service1 s = new Service1();
          s.addStudent(new Student(Imie, Wiek));
      }
    }

    /*
     * try {
     * Service1 s = new Service1();
     * s.addStudent(new Student("Krzysztof", 20));
     * s.addStudent(new Student("Janusz", 40));
     * 
     * var students = s.getStudents();
     * for(Student current : students) {
     * System.out.println(current.ToString());
     * }
     * } catch (IOException e) {
     * 
     * }
     */
  }
}