package lt.code.academy.data;

import org.bson.types.ObjectId;

import java.util.Set;

public class User {
    private ObjectId id;
    private String name;
    private String surname;
    private String phone;
   private Set<Bank> Banks;

   public User(){}

    public User(ObjectId id, String name, String surname, String phones, Set<Bank> banks) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        Banks = banks;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return phone;
    }

    public void setAddress(String address) {
        this.phone = address;
    }

    public Set<Bank> getBanks() {
        return Banks;
    }

    public void setBanks(Set<Bank> banks) {
        Banks = banks;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + phone + '\'' +
                ", Banks=" + Banks +
                '}';
    }
}
