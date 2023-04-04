package hospital_management;

public class Patients {
    private String name;
    private String dept;
    private String ph;
    public Patients(String name,String dept,String ph){
        this.name = name;
        this.dept = dept;
        this.ph = ph;
    }
    @Override
    public String toString(){
        return name + "       "+ dept+"     "+ph;
    }
}
