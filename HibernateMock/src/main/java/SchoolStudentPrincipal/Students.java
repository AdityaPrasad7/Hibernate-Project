package SchoolStudentPrincipal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Students {

    @Id
    private int Sid;
    private String SName;

    @ManyToOne
    @JoinColumn(name = "schId") // Foreign key in Students table
    private School sch;

    public int getSid() {
        return Sid;
    }

    public void setSid(int sid) {
        Sid = sid;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String sName) {
        SName = sName;
    }

    public School getSch() {
        return sch;
    }

    public void setSch(School sch) {
        this.sch = sch;
    }
}
