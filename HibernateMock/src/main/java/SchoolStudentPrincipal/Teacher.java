package SchoolStudentPrincipal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Teacher {

    @Id
    private int Tid;
    private String TName;

    @ManyToOne
    @JoinColumn(name = "schId") // Foreign key in Teacher table
    private School sch;

    public int getTid() {
        return Tid;
    }

    public void setTid(int tid) {
        Tid = tid;
    }

    public String getTName() {
        return TName;
    }

    public void setTName(String tName) {
        TName = tName;
    }

    public School getSch() {
        return sch;
    }

    public void setSch(School sch) {
        this.sch = sch;
    }
}
