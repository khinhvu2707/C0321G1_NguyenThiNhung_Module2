package models;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String sCMND;
    private String telephone;
    private String email;
    private String level;
    private String address;
    private String service;

    public Customer() {
    }

    public Customer(String name,String birthday,String gender,String sCMND,String telephone, String email,String level,String address,String service) {
        this.name = name;
        this.birthday=birthday;
        this.gender=gender;
        this.sCMND=sCMND;
        this.telephone=telephone;
        this.email=email;
        this.level=level;
        this.address=address;
        this.service=service;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public Customer setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Customer setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getsCMND() {
        return sCMND;
    }

    public Customer setsCMND(String sCMND) {
        this.sCMND = sCMND;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public Customer setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public Customer setLevel(String level) {
        this.level = level;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Customer setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getService() {
        return service;
    }

    public Customer setService(String service) {
        this.service = service;
        return this;
    }

    public String showInfor(){
        return "Customer { " +
                " Name : '" + name + '\'' +
                ", Birthday : '" + birthday + '\'' +
                ", Gender : '" + gender + '\'' +
                ", CMND : '" + sCMND + '\'' +
                ", Telephone : '" + telephone + '\'' +
                ", Email : '" + email + '\'' +
                ", Level : '" + level + '\'' +
                ", Address : '" + address + '\'' +
                ", Service : '" + service + '\'' +
                '}';
    }
}
