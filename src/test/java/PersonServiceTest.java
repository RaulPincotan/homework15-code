import ex2.Person;
import ex2.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class PersonServiceTest {
    PersonService personService;
    Person person1, person2, person3;

    @BeforeEach
    void setup() {
        personService = new PersonService(new ArrayList<>());
        person1 = new Person("Raul", 29);
        person2 = new Person("Adrian", 31);
        person3 = new Person("Pincotan", 50);

        personService.addPerson(person1);
        personService.addPerson(person2);

    }

    @Test
    @DisplayName("WHEN calling getPersonByID method will return the person with the parametized id")
    void getAllPersonsNames() {

        List<String> names = personService.getAllPersonsName();

        assertThat(names).contains("Raul", "Adrian", "Andreea");
    }

    @Test
    @DisplayName("WHEN calling getPerson method will return a person if a person with the parameter name is on the list")
    void testGetPerson() {

        Person person = personService.getPerson("Raul");
        assertThat(person).isEqualTo(person1);
    }


    @Test
    @DisplayName("WHEN calling getPersonByID method will return the person with the parametized id")
    void testGetPersonByID() {

        Person person = personService.getPersonByID(1);
        assertThat(person).isEqualTo(person2);
    }


}
