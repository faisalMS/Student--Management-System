import java.util.ArrayList;
import java.util.List;

public class App {

    // مصفوفة لأسماء الطلاب
    private static List<String> studentNames = new ArrayList<>();

    // مصفوفة لدرجات الطلاب
    private static List<Integer> studentGrades = new ArrayList<>();

    // دالة لإضافة طالب جديد ودرجته
    public static void addStudent(String name, int grade) {
        studentNames.add(name);
        studentGrades.add(grade);
    }

    // دالة لعرض الطلاب المُضافين
    public static void displayStudents() {
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println("Name: " + studentNames.get(i) + ", Grade: " + studentGrades.get(i));
        }
    }

    // دالة لحساب متوسط درجات الطلاب
    public static double calculateAverageGrade() {
        if (studentGrades.isEmpty()) {
            throw new ArithmeticException("لا يوجد طلاب في القائمة.");
        }

        int sum = 0;
        for (int grade : studentGrades) {
            sum += grade;
        }

        return (double) sum / studentGrades.size();
    }

    public static void main(String[] args) {
        // إضافة بعض الطلاب ودرجاتهم
        addStudent("أحمد", 85);
        addStudent("محمد", 90);
        addStudent("سارة", 78);

        // عرض الطلاب المُضافين
        System.out.println("الطلاب المُضافين:");
        displayStudents();

        // حساب متوسط الدرجات
        try {
            double average = calculateAverageGrade();
            System.out.println("متوسط درجات الطلاب: " + average);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
