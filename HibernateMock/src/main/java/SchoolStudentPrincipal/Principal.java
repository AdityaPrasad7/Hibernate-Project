package SchoolStudentPrincipal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.CascadeType;

@Entity
public class Principal {

    @Id
    private int Pid;
    private String PName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "schId") // Foreign key in Principal table
    private School sch;

    public int getPid() {
        return Pid;
    }

    public void setPid(int pid) {
        Pid = pid;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String pName) {
        PName = pName;
    }

    public School getSch() {
        return sch;
    }

    public void setSch(School sch) {
        this.sch = sch;
    }
}
