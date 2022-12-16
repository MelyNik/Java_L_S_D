package Java_L_S_D.DZ.DZ_6;

public class Notebook_task_1 {
    private int ram;
    private int hardDiskCapacity;
    private String operatingSystem;
    private String colour;

    public Notebook_task_1(String colour) {
        this.colour = colour;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(int hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }
    
    public int getOperatingSystem() {
        if (operatingSystem.equals("Windows")) return 1; 
        else if (operatingSystem.equals("MacOs")) return 2;
        else return 3;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    @Override
    public String toString() {
        return "{" +
            " ram='" + getRam() + "'" +
            ", hardDiskCapacity='" + getHardDiskCapacity() + "'" +
            ", operatingSystem='" + getOperatingSystem() + "'" +
            ", colour='" + getColour() + "'" +
            "}";
    }
    
}
