import java.util.ArrayList;

public class Departament {
    public String deptName;
    ArrayList<Persona> personaInDept = new ArrayList<>();

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ArrayList<Persona>  GetDep(){
        return personaInDept;
    }
}
