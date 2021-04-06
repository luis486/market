package model;

import exception.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MiniMarket {
    
    private List<Person> people;
    private int count = 0;

    public MiniMarket() {
        people =  new ArrayList<>();
    }

    public List<Person> getPeople() {
        return this.people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public int getDay(){
        int day = LocalDate.now().getDayOfMonth();
        return day;
    }


    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public int penultimateInt(long id){
        int penultimate;
        String string = String.valueOf(id);
        string = string.substring(string.length() - 2, string.length() - 1);
        penultimate = Integer.parseInt(string);
        return penultimate;
    }

    public String compareDayAndId(int day, int penultimate){
        String msg = ""; 
        if ( penultimate % 2 == 0 && day % 2 == 0 ){
            msg = "No";
        }
        else if( penultimate % 2 != 0 && day % 2 != 0 ){
            msg = "No";
        }
        else{
            msg = "Si";
        }
        return msg;
    }

    public void addPerson(long id, TypeDocument type) throws AgeException, DayException {
        if(type.equals(TypeDocument.TI)){
            count++;
            throw new AgeException();
           
        }
        else if(compareDayAndId(getDay(), penultimateInt(id)).equalsIgnoreCase("No")){
            count++;
            throw new DayException();
            
        }
        else{
        people.add(new Person(type, id));
        count++;
        }
    }


}
