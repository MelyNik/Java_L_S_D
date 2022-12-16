package Java_L_S_D.Seminar.Seminar_6;

import java.util.List;

// Все классы наследники класса обджект.
public class Cat_task_3 {
    private String color;
    private String name;
    private int age;
    private List<String> seekStory;
    private long passport;
    private Doctor_task3 Doctor;

    public Cat_task_3(String name)
        {
            this.name = name;
        }
    // Сожно сделать перегрузку метода сверху командой ниже.
    // Cat_task_3(){}
    

    public void invite() {
        
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSeekStory() {
        return this.seekStory;
    }

    public void setSeekStory(List<String> seekStory) {
        this.seekStory = seekStory;
    }

    public long getPassport() {
        return this.passport;
    }

    public void setPassport(long passport) {
        this.passport = passport;
    }

    public Doctor_task3 getDoctor() {
        return this.Doctor;
    }

    public void setDoctor(Doctor_task3 Doctor) {
        this.Doctor = Doctor;
    }


    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", seekStory='" + getSeekStory() + "'" +
            ", passport='" + getPassport() + "'" +
            ", Doctor='" + getDoctor() + "'" +
            "}";
    }

    @Override // Сровнение объектов по заданным нами параметроам.
    public boolean equals(Object obj){
        if(this == obj)
            {
                return true;
            }
        if(!(obj instanceof Cat_task_3))
            {
                return false;
            }
        Cat_task_3 cat = (Cat_task_3) obj;
        if(this.getName().equals(cat.getName()) && this.passport == cat.getPassport())
            {
                return true;
            }
        return false;
    }

    @Override // Проверка хэшкода.
    public int hashCode() {
        return (int)passport + name.hashCode(); // Если сложить int + long на выходе всегда будет лонг.
                                                // Т.е. к числу паспорта мы прибавляем число хэшкода.
                                                // Опять же у одинаковых String - строк будет одинаковая хэшфункция.
        
    }
    
}
