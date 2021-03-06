package P1.Panels;

import Enums.Faculty;
import People.Staff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static Enums.Faculty.getNames;

public class AddStaffPanel implements ActionListener {
    JFrame window = new JFrame("Add Staff - UniData");

    JPanel panelMain = new JPanel();
    JPanel panelSave = new JPanel();

    JPanel panel1_1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel panel1_2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel panel1_3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel panel6 = new JPanel(new FlowLayout(FlowLayout.LEFT));

    JLabel text1_1 = new JLabel("Прізвище: ");
    JLabel text1_2 = new JLabel("Ім'я: ");
    JLabel text1_3 = new JLabel("По батькові: ");
    JLabel text2 = new JLabel("Вік: ");             // проверить, можно рассчитать со дня рождения
    JLabel text3 = new JLabel("Номер телефону: ");  // проверить
    JLabel text4 = new JLabel("Корпоративна пошта: ");  // проверить
    JLabel text5 = new JLabel("Факультет: ");
    JLabel text6 = new JLabel("Кафедра: ");

    String[] facultyList = getNames(Faculty.class);

    JComboBox comboBox1 = new JComboBox(facultyList);

    JTextField form1_1 = new JTextField(15);
    JTextField form1_2 = new JTextField(18);
    JTextField form1_3 = new JTextField(14);
    JTextField form2 = new JTextField(2);
    JTextField form3 = new JTextField(10);
    JTextField form4 = new JTextField(15);
    JTextField form6 = new JTextField(15);

    JButton saveButton = new JButton("Зберегти");
    JButton cancelButton = new JButton("Скасувати");

    ArrayList<Staff> staffs;
    int staffCount;

    public AddStaffPanel(boolean vis, ArrayList<Staff> staffs, int staffCount){
        this.staffs = staffs;
        this.staffCount = staffCount;

        panelMain.setBackground(Color.white);
        panelSave.setBackground(Color.lightGray);

        window.add(panelMain, BorderLayout.CENTER);
        window.add(panelSave, BorderLayout.PAGE_END);

        panel1_1.add(text1_1);
        panel1_1.add(form1_1);

        panel1_2.add(text1_2);
        panel1_2.add(form1_2);

        panel1_3.add(text1_3);
        panel1_3.add(form1_3);

        panel2.add(text2);
        panel2.add(form2);

        panel3.add(text3);
        panel3.add(form3);

        panel4.add(text4);
        panel4.add(form4);

        panel5.add(text5);
        panel5.add(comboBox1);

        panel6.add(text6);
        panel6.add(form6);

        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));
        panelMain.add(panel1_1/*, BorderLayout.NORTH*/);
        panelMain.add(panel1_2);
        panelMain.add(panel1_3);
        panelMain.add(panel2);
        panelMain.add(panel3);
        panelMain.add(panel4);
        panelMain.add(panel5);
        panelMain.add(panel6);

        //panelSave.add(cancelButton);
        panelSave.add(saveButton);

        saveButton.addActionListener(this);
        cancelButton.addActionListener(this);

        window.setSize(350, 600);
        window.setVisible(vis);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==saveButton){
            staffs.add(new Staff(form1_1.getText(), form1_2.getText(), form1_3.getText(), Integer.parseInt(form2.getText()), form3.getText(), form4.getText(), comboBox1.getSelectedItem().toString(), form6.getText()));
            //staffCount++;
            window.setVisible(false);
        }
        else if (e.getSource()==cancelButton){
            window.setVisible(false);
        }
    }
}
