public class Main {
    public static void main(String[] args) {
        String studentOne = "Engin";
        String studentTwo = "Derin";
        String studentThree = "Salih";

        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentThree);

        System.out.println("____________________________");

        String[] students = new String[3];
        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";

        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
        System.out.println("____________________________");
        for (String student:students){ //Best Practices
            System.out.println(student);
        }

    }
}
