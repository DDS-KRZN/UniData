package People;

public class Staff extends Person{
    String department; // кафедра

    public Staff(String surname, String name, String patronymic, int age, String phoneNumber, String emailCorporate,
          String faculty, String department) {
        super(surname, name, patronymic, age, phoneNumber, emailCorporate, faculty);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString(){
        return (this.getName()+" "+this.getSurname()+" "+this.getPatronymic()+" / "+this.getAge()+" ("+this.getFaculty()+", "+this.getDepartment()+") ("+this.getPhoneNumber()+" / "+this.getEmailCorporate()+")");
    }
}
