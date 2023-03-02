package lt.code.academy.data;

import java.time.LocalDateTime;

public class MoneyTransfer {
    private String name;
    private String surname;
    private LocalDateTime send;

    public MoneyTransfer(){}

    public MoneyTransfer(String name, String surname, LocalDateTime send) {
        this.name = name;
        this.surname = surname;
        this.send = send;
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

    public LocalDateTime getSend() {
        return send;
    }

    public void setSend(LocalDateTime send) {
        this.send = send;
    }

    @Override
    public String toString() {
        return "moneyTransfer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", send=" + send +
                '}';
    }
}
