package de.hidora.adcrawler.buildertest;

public class Person {

    private String firstName;
    private String lastName;

    public Person() {

    }

    public Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public static class Builder<T extends Builder> {

        private String firstName;
        private String lastName;

        // TODO: siehe Subclass. Eventuell Build hier erweitern

        public Person build() {
            Person p = new Person();
            p.setFirstName(firstName);
            p.setLastName(lastName);
            return p;
        }

        public T withFirstName(String firstName) {
            this.firstName = firstName;
            return (T) this;
        }

        public T withLastName(String lastName) {
            this.lastName = lastName;
            return (T) this;
        }
    }

}
