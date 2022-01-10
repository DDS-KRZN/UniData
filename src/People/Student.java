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
}

