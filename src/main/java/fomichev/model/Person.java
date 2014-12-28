package fomichev.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table( name = "PERSONS" )
public class Person {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;

    private String name;
    @Column()
    private Date dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
