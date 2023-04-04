package hospital_management;

import java.util.ArrayList;

public class Doctors {
    private String name;
    private String dept;
    private String ph;
    
    public Doctors(String name,String dept,String ph){
        this.name = name;
        this.dept = dept;
        this.ph = ph;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getPh() {
        return ph;
    }
    
    @Override
    public String toString(){
        return name + "       "+ dept+"     "+ph;
    }
}
