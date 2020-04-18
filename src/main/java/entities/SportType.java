package entities;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name = "sport_type")
public class SportType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name",unique = true)
    private String name;

    public SportType() {
    }

    public SportType(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
