package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MiniMarket {
    
    private List<Person> people;
    private LocalDate date;


    public MiniMarket() {
        people =  new ArrayList<>();
    }

    public List<Person> getPeople() {
        return this.people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void addPerson(TypeDocument type, long id) {
        people.add(new Person(type, id));
    }


}
