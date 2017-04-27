package de.hidora.adcrawler.buildertest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PersonSonstigesBuilderTest {


    @Test
    public void testPersonBuilder() {
        Person person = new Person();
        person.setFirstName("Hans");
        person.setLastName("Mustermann");

        Person.Builder builder = new Person.Builder();
        builder.withFirstName("Hans");
        builder.withLastName("Mustermann");
        Person bPerson = builder.build();

        assertThat(bPerson, notNullValue());
        assertThat(bPerson, notNullValue());
        assertEquals(person.getFirstName(), bPerson.getFirstName());
        assertEquals(person.getLastName(), bPerson.getLastName());
    }


    @Test
    public void testSonstigesBuilder() {
        Sonstiges sonstiges = new Sonstiges();
        sonstiges.setFirstName("Hans");
        sonstiges.setLastName("Mustermann");
        sonstiges.setSchuhe("Nike");

        Sonstiges.Builder builder = new Sonstiges.Builder();
        builder.withFirstName("Hans");
        builder.withLastName("Mustermann");
        builder.withSchuhe("Nike");
        Sonstiges bSonstiges = builder.build();

        assertThat(bSonstiges, notNullValue());
        assertThat(bSonstiges, notNullValue());
        assertEquals(sonstiges.getFirstName(), bSonstiges.getFirstName());
        assertEquals(sonstiges.getLastName(), bSonstiges.getLastName());
        assertEquals(sonstiges.getSchuhe(), bSonstiges.getSchuhe());
    }


}