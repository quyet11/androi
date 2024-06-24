import Exercise.Week3;
import DataStructure.LinkedList;
import DataStructure.Stack;

        import java.util.Scanner;
        import asm.Student;
        import asm.StudentManager;

//class SinhVien{
//    private String name;
//    private int age;
//    private String address;
//    SinhVien(String n,int a,String adr){
//        this.name = n;
//        this.age = a;
//        this.address = adr;
//    }
//    void print(){
//        System.out.println(this.name + " " + this.age + " " + this.address);
//}
//
//}


public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Sort Students by mark");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Marks: ");
                    double marks = scanner.nextDouble();
                    manager.addStudent(id, name, marks);
                    break;


                case 2:
                    System.out.print("Enter Student ID to Delete: ");
                    id = scanner.nextInt();
                    manager.deleteStudent(id);
                    break;
                case 3:
                    manager.sortStudents();
                    System.out.println("Students sorted by ID.");
                    break;
                case 4:
                    System.out.print("Enter Student ID to Search: ");
                    id = scanner.nextInt();
                    Student student = manager.searchStudent(id);
                    if (student != null) {
                        System.out.println("Student found: " + student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 5:
                    manager.displayStudents();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
//        Stack stack1 = new Stack(10);
//        stack1.push(1);
//        stack1.push(3);
//        stack1.push(4);
//        stack1.push(6);
//        stack1.push(8);
//
//        stack1.print();

    }

//    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//      SinhVien[] arr_sv = new SinhVien[2];
//      Scanner sc = new Scanner(System.in);
//      for(int i = 0; i < arr_sv.length; i++){
//          System.out.println("Enter the name of the Sinh Vien");
//          String name = sc.nextLine();
//          System.out.println("Enter the age of the Sinh Vien");
//          int age = sc.nextInt();
//          sc.nextLine();
//          System.out.println("Enter the address of the Sinh Vien");
//          String address = sc.nextLine();
//          arr_sv[i] = new SinhVien(name,age,address);
//
//      }
//        for (SinhVien sv : arr_sv) {
//            sv.print();
//        }
//
//

//    }
}







