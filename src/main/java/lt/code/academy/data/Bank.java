package lt.code.academy.data;

import org.bson.types.ObjectId;

public class Bank {
    private ObjectId id;
    private String title;
    private MoneyTransfer moneyTransfer;

    public Bank(){}

    public Bank(ObjectId id, String title, MoneyTransfer moneyTransfer) {
        this.id = id;
        this.title = title;
        this.moneyTransfer = moneyTransfer;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MoneyTransfer getMoneyTransfer() {
        return moneyTransfer;
    }

    public void setMoneyTransfer(MoneyTransfer moneyTransfer) {
        this.moneyTransfer = moneyTransfer;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", moneyTransfer=" + moneyTransfer +
                '}';
    }
}
