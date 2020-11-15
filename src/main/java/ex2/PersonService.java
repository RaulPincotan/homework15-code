package ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PersonService {
    private final List<Person> personList = new ArrayList<>();

    public PersonService(Collection<Person> persons) {
        if (persons != null) {
            this.personList.addAll(persons);
        }
    }

    public void addPerson(Person person) {
        personList.add(person);
        person.setID(personList.indexOf(person));
    }

    public void removePerson(int id) {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getID() == id) {
                iterator.remove();
            }


        }
        if (personList.indexOf(id) < 0 || personList.indexOf(id) > personList.size() - 1) {
            throw new CannotBeFoundException("It is not in the list");
        }


    }


    public List<Person> getAllPersons() {
        return personList;
    }

    public List<Person> getPersonsOlderThan(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > age) {
                result.add(person);
            }

        }
        return result;
    }

    public List<String> getAllPersonsName() {
        List<String> result = new ArrayList<>();

        for (Person person : personList) {
            result.add(person.getName());
        }
        return result;
    }

    public Person getPerson(String name) {
        for (Person person : personList) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    public Person getPersonByID(int id) {
        if (id < 0 || id >= personList.size()) {
            throw new IllegalIDException("Wrong id");
        } else {
            for (Person person : personList) {
                if (person.getID() == id) {
                    return person;
                }
            }
        }
        return null;
    }

}
