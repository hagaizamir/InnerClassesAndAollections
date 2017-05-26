package hagai.edu.innerclassesandaollections;

/**
 * Created by Hagai Zamir on 23-May-17.
 */

public class Person {
    private String firstName;
    private String id;

    //cache
    //TODO: SETTERS MUST SET THE HASH TO ZERO:
    int hash = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null)
            return false;
        return id != null ? id.equals(person.id) : person.id == null;

    }

    @Override
    public int hashCode() {
        if (hash == 0) {
            int result = firstName != null ? firstName.hashCode() : 0;
            result = 31 * result + (id != null ? id.hashCode() : 0);
            hash = result;
        }
        return hash;
    }

    @Override
    public String toString() {
        //debugging.
        //do not over formating.
        return firstName;
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        //
    }
}
