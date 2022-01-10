package People;

public abstract class Person {
    String surname;     // фамилия
    String name;        // имя
    String patronymic;                  // отчество
    int age;            // возраст
    String position;    // должность? (студент/преподаватель, выбрать из списка)
    String phoneNumber; // номер телефона
    String emailCorporate; // корп. почта
    String faculty;     // факультет

    Person(String surname, String name, String patronymic, int age, String phoneNumber, String emailCorporate, String faculty){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailCorporate = emailCorporate;
        this.faculty = faculty;
    }

    /// getters ///
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailCorporate() {
        return emailCorporate;
    }

    public String getFaculty() {
        return faculty;
    }

    /// setters ///

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailCorporate(String emailCorporate) {
        this.emailCorporate = emailCorporate;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}

