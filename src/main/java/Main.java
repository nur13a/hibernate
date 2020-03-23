import entities.*;
import org.hibernate.Session;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Country c1=new Country("KG");
        Country c2=new Country("KZ");
        Country c3=new Country("USA");
        List<Country>countries=new ArrayList<>();
        countries.add(c1);
        countries.add(c2);
        countries.add(c3);
        create(c1);
        create(c2);
        create(c3);

        Logo l1=new Logo(1,"Light");
        Logo l2=new Logo(2,"Dark");
        Logo l3=new Logo(2,"Grey");
        create(l1);
        create(l2);
        create(l3);

        SportType s1=new SportType("Football");
        SportType s2=new SportType("Basketball");
        SportType s3=new SportType("Grappling");

        create(s1);
        create(s2);
        create(s3);

        Championship championship=new Championship("Football",countries,s1);
        Championship championship1=new Championship("Grappling",countries,s3);

        create(championship);
        create(championship1);

        Team team1=new Team("First",l1,"first.com",s1);
        Team team2=new Team("Second",l2,"second.com",s2);
        Team team3=new Team("Third",l3,"third.com",s3);

        create(team1);
        create(team2);
        create(team3);

    }
    public static <T> void create(T entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(entity);
        session.getTransaction().commit();
        session.close();
        System.out.println("Создали запись успешно");
    }
}
