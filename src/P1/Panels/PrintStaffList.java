package P1.Panels;

import People.Staff;

import javax.swing.*;
import java.util.ArrayList;

public class PrintStaffList {
    ArrayList<Staff> staffs;
    public PrintStaffList(int staffCount, ArrayList<Staff> staffs){
        this.staffs = staffs;
        StringBuilder text = new StringBuilder();
        int i = 1;
        for (Staff staff: staffs){
            text.append(i+". "+staff+"\n");
            i++;
        }
        if (staffCount!=0){
            JOptionPane.showMessageDialog(null, text.toString(), "Список студентів", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"Список порожній!", "Помилка", JOptionPane.ERROR_MESSAGE);
        }
    }
}
