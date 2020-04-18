package entities;

import javax.persistence.*;

@Entity
@Table(name="teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name",unique = true)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "logo_address",referencedColumnName = "id")
    private Logo logo;

    @Column(name = "off_site")
    private String officialSite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_type_id",referencedColumnName = "id")
    private SportType sportType;
public Team(){}
    public Team(String name, Logo logo, String officialSite, SportType sportType) {
        this.name = name;
        this.logo = logo;
        this.officialSite = officialSite;
        this.sportType = sportType;
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

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }
}
