package P1.Panels;

import People.Student;
import People.Staff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Panels implements ActionListener {
    JFrame window = new JFrame("UniData");
    JLabel versionText = new JLabel("v.0.0.1-a");

    ArrayList<Student> studentArrayList = new ArrayList<Student>();
    ArrayList<Staff>  staffArrayList = new ArrayList<Staff>();

    JPanel panelMain = new JPanel();
    JPanel panel1 = new JPanel(); // добавление
    Color lightGreen = new Color(144, 238, 144);
    JPanel panel2 = new JPanel(); // удаление
    Color lightRed = new Color(239, 99, 96);
    JPanel panel3 = new JPanel(); // список
    Color lightBlue = new Color(92, 159, 208);
    JPanel panelVersion = new JPanel();

    JButton addStudentButton = new JButton("Додати студента");
    JButton addStaffButton = new JButton("Додати викладача");
    JButton deleteStudentButton = new JButton("Видалити студента");
    JButton deleteStaffButton = new JButton("Видалити викладача");
    JButton StudentListButton = new JButton("Список студентів");
    JButton StaffListButton = new JButton("Список викладачів");




    public static int studentCount = 0; // сейчас студентов
    public static int staffCount = 0; // сейчас сотрудников

    public Panels(){
        panelMain.setBackground(Color.white);
        panel1.setBackground(lightGreen);
        panel2.setBackground(lightRed);
        panel3.setBackground(lightBlue);
        panelVersion.setBackground(Color.LIGHT_GRAY);

        panel1.add(addStudentButton);
        panel1.add(addStaffButton);

        panel2.add(deleteStudentButton);
        panel2.add(deleteStaffButton);

        panel3.add(StudentListButton);
        panel3.add(StaffListButton);

        panelVersion.add(versionText);
        ///
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.add(panel1);
        panelMain.add(panel2);
        panelMain.add(panel3);
        panelMain.add(panelVersion);

        addStudentButton.addActionListener(this);
        addStaffButton.addActionListener(this);
        deleteStudentButton.addActionListener(this);
        deleteStaffButton.addActionListener(this);
        StudentListButton.addActionListener(this);
        StaffListButton.addActionListener(this);

        window.add(panelMain);

        window.setSize(350, 200);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addStudentButton && (studentCount+1)!=100){
            new AddStudentPanel(true, studentArrayList);
            studentCount++;
        }
    }
}
