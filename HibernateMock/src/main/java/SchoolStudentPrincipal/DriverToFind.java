package SchoolStudentPrincipal;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DriverToFind {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        // Finding School by ID
        int schoolId = 111;
        School school = em.find(School.class, schoolId);
        
        if (school != null) {
            System.out.println("School ID: " + school.getschId());
            System.out.println("School Name: " + school.getSchName());
            
            // Fetching Principal
            Principal principal = school.getPrincipal();
            if (principal != null) {
                System.out.println("Principal ID: " + principal.getPid());
                System.out.println("Principal Name: " + principal.getPName());
            }
            
            // Fetching Students
            List<Students> students = school.getStudent();
            System.out.println("Students:");
            for (Students student : students) {
                System.out.println("  ID: " + student.getSid() + ", Name: " + student.getSName());
            }
            
            // Fetching Teachers
            List<Teacher> teachers = school.getTeacher();
            System.out.println("Teachers:");
            for (Teacher teacher : teachers) {
                System.out.println("  ID: " + teacher.getTid() + ", Name: " + teacher.getTName());
            }

            // Updating School Name
            et.begin();
            school.setSchName("Updated School Name");
            em.merge(school);
            et.commit();
            System.out.println("School name updated successfully.");
            
            // Deleting a Student
            et.begin();
            if (!students.isEmpty()) {
                Students studentToDelete = students.get(0);
                em.remove(studentToDelete);
                System.out.println("Deleted Student: " + studentToDelete.getSName());
            }
            et.commit();
        } else {
            System.out.println("School not found!");
        }
        
        em.close();
        emf.close();
    }
}
