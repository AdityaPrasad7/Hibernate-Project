package SchoolStudentPrincipal;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class School {

    @Id
    private int schId;
    private String SchName;

    @OneToMany(mappedBy = "sch", cascade = CascadeType.ALL)
    private List<Students> student;

    @OneToMany(mappedBy = "sch", cascade = CascadeType.ALL) 
    private List<Teacher> teacher;

    @OneToOne(mappedBy = "sch", cascade = CascadeType.ALL) 
    @JoinColumn(name = "Pid")
    private Principal principal;

    public int getschId() {
        return schId;
    }

    public void setschId(int schId) {
        this.schId = schId;
    }

    public String getSchName() {
        return SchName;
    }

    public void setSchName(String schName) {
        SchName = schName;
    }

    public List<Students> getStudent() {
        return student;
    }

    public void setStudent(List<Students> student) {
        this.student = student;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
}
