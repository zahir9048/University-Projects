/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phonebook.management.system;
import java.util.*;

/**
 *
 * @author Zahir & Ramish
 */

class Persons{
    private String name;
    private String gender;
    private long phonenum;
    private int age;
    private String email;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return email;
    }

    public void setMail(String mail) {
        this.email = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
       
    Scanner sc = new Scanner(System.in);

    public Persons addPerson(){
        Persons person = new Persons();
       
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone Number: +92");
        long phonenum = sc.nextLong();
        System.out.print("Enter Gender: ");
        String gender = sc.next();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Mail: ");
        String mail = sc.next();
        System.out.print("Enter Address: ");
        String address = sc.next();

        person.setName(name);
        person.setAge(age);
        person.setPhonenum(phonenum);
        person.setMail(mail);
        person.setGender(gender);
        person.setAddress(address);
        System.out.println(person);
        System.out.println("Added Successfully!");
    return person;
    }
    public Persons Contact1(){
        Persons contact1 = new Persons();
       
        contact1.setName("Asim");
        contact1.setAge(18);
        contact1.setPhonenum(328749165);
        contact1.setMail("asim9021@outlook.com");
        contact1.setGender("Male");
        contact1.setAddress("Karachi");
    return contact1;
    }
    public Persons Contact2(){
        Persons contact2 = new Persons();
       
        contact2.setName("Zahir");
        contact2.setAge(20);
        contact2.setPhonenum(311499367);
        contact2.setMail("zahir9048@gmail.com");
        contact2.setGender("Male");
        contact2.setAddress("Karachi");
    return contact2;
    }
   
    public Persons Contact3(){
        Persons contact3 = new Persons();
       
        contact3.setName("Ramish");
        contact3.setAge(20);
        contact3.setPhonenum(328962675);
        contact3.setMail("ramishlal@outlook.com");
        contact3.setGender("Male");
        contact3.setAddress("Karachi");
    return contact3;
    }
       
    public Persons Contact4(){
        Persons contact4 = new Persons();
         
        contact4.setName("Adil");
        contact4.setAge(20);
        contact4.setPhonenum(336696267);
        contact4.setMail("aaijaz76@gmail.com");
        contact4.setGender("Male");
        contact4.setAddress("Karachi");
    return contact4;
    }
                 
    public Persons Contact5(){
        Persons contact5 = new Persons();
           
        contact5.setName("Maria");
        contact5.setAge(26);
        contact5.setPhonenum(328962786);
        contact5.setMail("mari94@outlook.com");
        contact5.setGender("Female");
        contact5.setAddress("London");
    return contact5;
    }
       
    public Persons NametoDelete(LinkedList<Persons> LinkedList){
        Persons person = new Persons();
           
        System.out.print("Enter Contact to Delete: ");
        String name = sc.next();
       
        for(int j = 0;j<LinkedList.size();j++){
            if(name.equals(LinkedList.get(j).getName())){
                System.out.println(LinkedList.get(j));
                person = LinkedList.get(j);
                return person;
            }
            else{
                person = null;
            }
        }
        return person;
        }
       
    public Persons NametoModify(LinkedList<Persons> LinkedList){
        Persons person = new Persons();
        System.out.print("Enter Contact to Modify: ");
        String name = sc.next();
       
        for(int j = 0;j<LinkedList.size();j++){
            if(name.equals(LinkedList.get(j).getName())){
            System.out.println(LinkedList.get(j));
            person = LinkedList.get(j);
            return person;
            }
            else{
                person = null;
            }
        }
    return person;
    }      
       
    public Persons Modify(){
        Persons person = new Persons();
        System.out.print("Enter Name:");
        String name = sc.next();
        System.out.print("Enter Gender:");
        String gender = sc.next();
        System.out.print("Enter Phone Number:+92");
        long phonenum = sc.nextLong();
        System.out.print("Enter Age:");
        int age = sc.nextInt();
        System.out.print("Enter Mail:");
        String mail = sc.next();
        System.out.print("Enter Address:");
        String address = sc.next();

        person.setName(name);
        person.setAge(age);
        person.setPhonenum(phonenum);
        person.setMail(mail);
        person.setGender(gender);
        person.setAddress(address);
        System.out.println(person);
        System.out.println("\nModified Successfully!");
        return person;
    }  
         
    public Persons Search(LinkedList<Persons> Linkedlist){
        Persons person = new Persons();
        System.out.print("Enter Name to search PhoneBook: ");
        String name = sc.next();
        for(int j = 0;j<Linkedlist.size();j++){
            if(name.equals(Linkedlist.get(j).getName())){
                System.out.println(Linkedlist.get(j));
                person = Linkedlist.get(j);
            return person;
            }
            else {
                person = null;
            }
        }
    return person;
    }

   
    @Override
    public String toString() {
    return "Name = " + name + ", Gender = " + gender + ", Phone Number = "+("+92") + phonenum +
    ", Age = " + age + ", Mail = " + email + ", Address = " + address + "\n";
    }
}


public class PhonebookManagementSystem {
    
    public static void main(String[] args) {
         LinkedList phonebook = new LinkedList();
            Persons p1 = new Persons();
           
            phonebook.add(p1.Contact1());
            phonebook.add(p1.Contact2());
            phonebook.add(p1.Contact3());
            phonebook.add(p1.Contact4());
            phonebook.add(p1.Contact5());
                   
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
           
            System.out.println("------------------------------------------"
                  + "Phone Book Management System-----------------------------------------");
            String c;
           
           
            do{
                System.out.println("");
                System.out.println("1.Add Contact");
                System.out.println("2.Delete Contact");
                System.out.println("3.Modify/Edit Contact ");
                System.out.println("4.Show All Contacts ");
                System.out.println("5.Search Contact Information by Name ");
                System.out.println("0.Exit ");
                       
                System.out.print("\nPlease Select any Option: ");
               
                int option = input.nextInt();
             
               
                switch(option){
                    case 1:
                        System.out.println("\n--------------------------------------------------"
                                + "Add Contact--------------------------------------------------");
                        phonebook.add(p1.addPerson());
                        System.out.println("-------------------------------------------------------"
                                    +"--------------------------------------------------------");
                    break;

                    case 2:
                        System.out.println("\n--------------------------------------------------"
                                + "Delete Contact-----------------------------------------------");
                        p1 = p1.NametoDelete(phonebook);
                               
                        if(p1!=null){
                            System.out.print("Are you sure? Press 1:(Yes) 0:(No) ");
                            int answer = input.nextInt();                        
                            if(answer ==1){
                                phonebook.remove(p1);
                                System.out.println("Successfully Deleted!");
                                System.out.println("----------------------------------------------------"
                                       + "-------------------------------------------------------------");
                            }
                        }
                        else{
                            System.out.println("\nThis Contact does not exist.");
                            System.out.println("---------------------------------------------------------"
                                  + "------------------------------------------------------------------");
                        }
                        break;

                        case 3:
                            System.out.println("\n----------------------------------------------"
                              + "Modify the PhoneBook---------------------------------------------");
                            p1 = p1.NametoModify(phonebook);
                            if(p1!=null){
                                System.out.print("Are you sure? Press 1:(Yes) 0:(No) ");
                                int answer = input.nextInt();
                                if(answer == 1){
                                    phonebook.remove(p1);
                                    phonebook.add(p1.Modify());
                                    System.out.println("------------------------------------------------"
                                     + "--------------------------------------------------------");
                                }
                            }
                            else{
                                System.out.println("\nThis Contact does not exist.");
                                System.out.println("----------------------------------------------------"
                                     + "-----------------------------------------------------------");
                            }
                        break;

                        case 4:
                            System.out.println("\n----------------------------------------"
                             + "----------------------------------------------------------"
                             + "-------------");
                            for(int j = 0;j<phonebook.size();j++){
                                System.out.println(phonebook.get(j));  
                            }
                            System.out.println("-------------------------------------------"
                                    + "----------------------------------------------------"
                                    + "----------------");
                            break;
                           
                        case 5:
                            System.out.println("------------------------------------------------"
                                    + "Search By Name-------------------------------------------------");
                            p1 = p1.Search(phonebook);
                            if(p1==null){
                                System.out.println("\nThis person does not exist");
         
                            }
                            System.out.println("-------------------------------------------------------"
                                 + "--------------------------------------------------------");
                        break;
                        case 0:
                        break;    
                }
                 System.out.print("Do you want to do another operation on your Phonebook?"
                                   + " (Y/N): ");
                 c = input2.nextLine();
            }while(c.equals("Yes")||c.equals("yes")||c.equals("Y"));
        System.out.println("\nThank you!");
        }
    
}

