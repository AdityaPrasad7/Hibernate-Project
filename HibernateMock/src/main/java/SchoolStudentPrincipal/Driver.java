package SchoolStudentPrincipal;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // School object
        School sc1 = new School();
        sc1.setschId(111);
        sc1.setSchName("Jspider Marathahalli");

        // Principal object
        Principal p3 = new Principal();
        p3.setPid(3);
        p3.setPName("Raveesh");
        p3.setSch(sc1);
        sc1.setPrincipal(p3);

        // Student objects
        Students st20 = new Students();
        st20.setSid(20);
        st20.setSName("Girish");
        st20.setSch(sc1);

        Students st21 = new Students();
        st21.setSid(21);
        st21.setSName("Neeta");
        st21.setSch(sc1);

        Students st22 = new Students();
        st22.setSid(22);
        st22.setSName("Deepu");
        st22.setSch(sc1);

        List<Students> stuList = new ArrayList<>();
        stuList.add(st20);
        stuList.add(st21);
        stuList.add(st22);
        sc1.setStudent(stuList);

        // Teacher objects
        Teacher t31 = new Teacher();
        t31.setTid(31);
        t31.setTName("Girish Pujar");
        t31.setSch(sc1);

        Teacher t32 = new Teacher();
        t32.setTid(32);
        t32.setTName("Ankita");
        t32.setSch(sc1);

        Teacher t33 = new Teacher();
        t33.setTid(33);
        t33.setTName("Ramana Kumar");
        t33.setSch(sc1);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t31);
        teacherList.add(t32);
        teacherList.add(t33);
        sc1.setTeacher(teacherList);

        et.begin();
        em.persist(sc1);
        et.commit();

        em.close();
        emf.close();
    }
}
