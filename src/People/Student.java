package People;

public class Student extends Person{
    boolean isBudget; // true - бюджетная форма обучения
    String course;
    String formOfEducation;

    public Student (String surname, String name, String patronymic, int age, String phoneNumber, String emailCorporate,
                    String faculty,  String course, String formOfEducation, boolean isBudget){
        super(surname, name, patronymic, age, phoneNumber, emailCorporate, faculty);
        this.isBudget = isBudget;
        this.course = course;
        this.formOfEducation = formOfEducation;
    }

    public boolean isBudget() {
        return isBudget;
    }

    public String getCourse() {
        return course;
    }

    public String getFormOfEducation() {
        return formOfEducation;
    }

    public void setBudget(boolean budget) {
        isBudget = budget;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setFormOfEducation(String formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public String toString() {
        String isBudgetText;
        if (this.isBudget()==true){
            isBudgetText = "Державне замовлення";
        }
        else {
            isBudgetText = "Контракт";
        }
        /*return "\n"+(i+1)+". "+students[i].getSurname()+" "+students[i].getName()+" "+students[i].getPatronymic()+
                " / "+students[i].getAge()+" ("+students[i].getFaculty()+", "+students[i].getCourse()+", "
                +students[i].getFormOfEducation()+", "+isBudgetText+") ("+students[i].getPhoneNumber()+" / "+
                students[i].getEmailCorporate()+")";*/
        return (this.getName()+" "+this.getSurname()+" "+this.getPatronymic()+" / "+this.getAge()+" ("+this.getFaculty()+", "+this.getCourse()+", "+this.getFormOfEducation()+", "+isBudgetText+") ("+this.getPhoneNumber()+" / "+this.getEmailCorporate()+")");
    }
}

