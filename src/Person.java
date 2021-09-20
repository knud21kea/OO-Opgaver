public class Person {

    private final String personName;
    private int personAge;

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public String getPersonName() {
        return personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void hasBirthday() {
        this.personAge++;
    }

    @Override
    public String toString() {
        return personName + " is " + personAge + " years old.";
    }
}
