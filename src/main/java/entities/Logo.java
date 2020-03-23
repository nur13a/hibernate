package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logo")
public class Logo {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "logo_name")
    private String logoName;

    public Logo(Integer id, String logoName) {
        this.id = id;
        this.logoName = logoName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }
}
