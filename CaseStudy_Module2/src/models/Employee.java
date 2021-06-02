package models;

public class Employee {
    private String name;
    private String old;
    private String adress;

    public Employee(){

    }
    public Employee(String name, String old, String adress) {
        this.name = name;
        this.old = old;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", old='" + old + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
