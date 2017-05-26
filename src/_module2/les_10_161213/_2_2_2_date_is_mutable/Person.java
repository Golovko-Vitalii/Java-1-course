package _module2.les_10_161213._2_2_2_date_is_mutable;

import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;
    private Date workBeginDate;

    public Person(String name, Date birthDate, Date workBeginDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.workBeginDate = workBeginDate;
    }

    public Date getBirthDate() {
        //return birthDate; опасно! Date класс содержит метод setTime
        //return (Date) birthDate.clone(); 1
        return new Date(birthDate.getTime());//2

    }

    public Date getWorkBeginDate() {
        return new Date(workBeginDate.getTime());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", workBeginDate=" + workBeginDate +
                '}';
    }
}
