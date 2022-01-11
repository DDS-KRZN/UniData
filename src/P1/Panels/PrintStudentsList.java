package P1.Panels;

import People.Student;

import javax.swing.*;
import java.util.ArrayList;

public class PrintStudentsList {
    ArrayList<Student> students;
    public PrintStudentsList(int studentCount, ArrayList<Student> students){
        this.students = students;
        StringBuilder text = new StringBuilder();
        //for (int i = 0; i < studentCount; i++){
        int i = 1;
        for (Student student: students){
            text.append(i+". "+student+"\n");
            i++;
        }
        if (studentCount!=0){
            JOptionPane.showMessageDialog(null, text.toString(), "Список викладачів", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"Список порожній!", "Помилка", JOptionPane.ERROR_MESSAGE);
        }
    }
}
