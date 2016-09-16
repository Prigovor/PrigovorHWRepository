package lesson03.practice1;

/**
 * Created by Prigovor on 14.09.2016.
 */
public class Add {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Inakentiy", "Truk", 456_09_67);
        Contact contact2 = new Contact("Valeriy", "Kipelov", 445_00_45);
        Contact contact3 = new Contact("Anfisa", "Chehova", 548_49_28);
        Contact contact4 = new Contact("Inakentiy", "Truk", 123_45_67);



        SimCard card = new SimCard("Vodafone", 985_74_70);
        Phone phone = new Phone("LG", card);

        phone.contactList.add(contact1);
        phone.contactList.add(contact2);
        phone.contactList.add(contact3);
        phone.contactList.add(contact4);

        phone.fillBalance(200);
        phone.checkBalance();
        phone.fillBalance(-200);
        phone.checkBalance();
        phone.fillBalance(200);
        phone.checkBalance();

        phone.randomColl();
    }
}
