import java.time.LocalDate;
/*
* File: Employee.java
* Author: Fehér Mátyás
* Copyright: 2023, Fehér Mátyás
* Group: Szoft I 1 N
* Date: 2023-06-02
* Github: https://github.com/MatiasX/
* Licenc: GNU GPL
*/
public class Employee {
    Integer id;
    String name;
    String city;
    String address;
    LocalDate birth;
    Double salary;
    public Employee(){

    }
    public Employee(String name, String city, String address, LocalDate birth, Double salary){
        this.name = name;
        this.city = city;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
    }
    public Employee(Integer id ,String name, String city, String address, LocalDate birth, Double salary){
        this.id = id;
        this.name = name;
        this.address = address;
        this.birth = birth;
        this.salary = salary;
    }
}
