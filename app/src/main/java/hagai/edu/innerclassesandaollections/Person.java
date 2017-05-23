package hagai.edu.innerclassesandaollections;

/**
 * Created by Hagai Zamir on 23-May-17.
 */

public class Person {
    private  String firstName;
    private  String id;

    @Override
    public String toString() {
        //debuging
        //do not over formatting
        return firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id != null ? id.equals(person.id) : person.id == null;

    }

    int hash = 0;
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
