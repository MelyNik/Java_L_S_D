package Java_L_S_D.Seminar.Seminar_6;

public class Doctor_task3 {
    String name;

    public Doctor_task3(String name)
        {
            this.name = name;
        }
    

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            "}";
    }
    
}
