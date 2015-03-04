package fomichev.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import java.sql.Date;

@Entity
@Access(AccessType.PROPERTY)
public class Employee extends Person {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
