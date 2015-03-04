package fomichev.model;

import javax.persistence.*;

@MappedSuperclass
@Table
@Access(AccessType.PROPERTY)
public abstract class Person {

    private Long id;

    private String name;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
