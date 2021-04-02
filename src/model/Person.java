package model;

public class Person {
    
    private TypeDocument type;
    private long id;
    
    public Person(TypeDocument type, long id) {
        this.type = type;
        this.id = id;
    }

    public TypeDocument getType() {
        return this.type;
    }

    public void setType(TypeDocument type) {
        this.type = type;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
