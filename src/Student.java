public class Student {
    private String name;
    private boolean genderMale;
    private String dateOfBirth;

    public Student() {
    }

    public Student(String name, boolean genderMale, String dateOfBirth) {
        this.name = name;
        this.genderMale = genderMale;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGenderMale() {
        return genderMale;
    }

    public void setGenderMale(boolean genderMale) {
        this.genderMale = genderMale;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Name: " + getName() + " | Gender: " + (isGenderMale()? "Male" : "Female") + " | Date of birth: " + getDateOfBirth();
    }

}
