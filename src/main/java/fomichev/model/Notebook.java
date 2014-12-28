package fomichev.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "NOTEBOOKS")
public class Notebook {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long perfomance;

    @OneToOne//(mappedBy = "notebook")
    private Person person;











    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPerfomance() {
        return perfomance;
    }

    public void setPerfomance(Long perfomance) {
        this.perfomance = perfomance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}
