package lesson03.practice1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prigovor on 14.09.2016.
 */
public class Phone {
    private String modelPhone;
    SimCard card;
    List<Contact> contactList;

    Phone(String modelPhone, SimCard card) {
        this.modelPhone = modelPhone;
        this.card = card;
        contactList = new ArrayList<>();
    }

    public void fillBalance(Integer many) {
        if (many > 0) {
            card.setBalance(card.getBalance() + many);
        } else {
            System.out.println("Пополнение на отицательную сумму невозможно!");
        }
    }

    public void checkBalance() {
        System.out.println("Сумма на счету: " + card.getBalance());
    }

    public void newContact(String name, String surName, Integer numberPhone) {

        contactList.add(new Contact(name, surName, numberPhone));
    }

    public void randomColl() {
        Contact contact = contactList.get((int) Math.random() * contactList.size());

        if (card.getBalance() != 0) {
            System.out.println("Звонок контакту " + contact.getName());
            System.out.println("Набор номера +39 (050) " + contact.getNumberPhone());

            while (card.getBalance() > 0) {
                if (card.getBalance() == 0) {
                    break;
                } else {
                    card.setBalance(card.getBalance() - card.getCostMin());
                    System.out.println(card.getBalance() + " $");
                }
            }
            System.out.println("Закончились деньги на счету. Пополните пожалуйста ваш счет.");

            System.out.println("Звонок завершон." + "\n" + "Остаток на счету: " + card.getBalance() + " $");

        } else {
            System.out.println("Пополните пожалуйста ваш счет.");
        }
    }

    public void about() {
        System.out.println("Модель телефона: " + modelPhone);
    }
}
