package lt.code.academy;



import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import lt.code.academy.data.Bank;
import lt.code.academy.data.User;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class LithuanianBanksAssociation {

    private final MongoCollection<User> userCollection;
    private final MongoCollection<Bank> bankCollection;

    private User user;

    public LithuanianBanksAssociation(MongoCollection<User> userCollection, MongoCollection<Bank> bankCollection) {
        this.userCollection = userCollection;
        this.bankCollection = bankCollection;
    }

    public static void main(String[] args) {


        MongoClient client = MongoObjectClientProvider.getClient();
        MongoDatabase database = client.getDatabase("library");
        LithuanianBanksAssociation association = new LithuanianBanksAssociation(database.getCollection("user", User.class),
                database.getCollection("bank", Bank.class));
        Scanner scanner = new Scanner(System.in);



        String action;
        do {
            association.menu();
            action = scanner.nextLine();
            association.userSelection(scanner, action);
        } while(!action.equals("4"));


    }

    private void sign(Scanner scanner) {
        do {
            System.out.println("Prasome prisiregistruoti");

            System.out.println("Iveskite varda:");
            String name = scanner.nextLine();

            System.out.println("Iveskite pavarde:");
            String surname = scanner.nextLine();

            System.out.println("Iveskite telefona:");
            String phone = scanner.nextLine();





        }while (user != null);
    }

    private void userSelection(Scanner scanner, String action) {
        switch(action) {
            case "1" -> sign(scanner);
            case "2" -> System.out.println("2");
            case "3" -> System.out.println("3");
            case "4" -> System.out.println("Programa baigia darba");
            default -> System.out.println("Tokio veiksmo nera");
        }
    }
        private void menu() {
            System.out.println("""
                    1. Vartotojo registracija
                    2. Mokejimas
                    3. Mokejimo israsas
                    4. Iseiti
                    """);
        }
    }
