package com.OOP.Assignment9;
//
//import java.util.ArrayList;
//
//interface contacts
//{
//    void add(String name,String contact);
//    void delete(String name, String contact);
//    void update(String name,String contact, String newName, String newContact);
//}
//
//class info
//{
//    public String name;
//    public String contact;
//
//    public info(String name, String contact) {
//        this.name = name;
//        this.contact = contact;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getContact() {
//        return contact;
//    }
//
//    public void setContact(String contact) {
//        this.contact = contact;
//    }
//}
//
//class contactList implements contacts
//{
//    ArrayList<info> list = new ArrayList<info>();
//
//    @Override
//    public void add(String name, String number) {
//        info c = new info(name,number);
//        list.add(c);
//    }
//
//    @Override
//    public void delete(String name,String contact) {
//        System.out.println("\nAfter deletion of : " + name + ", " + contact);
//        int index = 0;
//
//        int i = 0;
//        while (i < list.size()) {
//            info c = list.get(i);
//            if(c.name.equalsIgnoreCase(name) && c.contact.equalsIgnoreCase(contact))
//            {
//                index = i;
//            }
//            i++;
//        }
//        list.remove(index);
//    }
//
//    @Override
//    public void update(String name,String contact, String newName, String newContact)
//    {
//        System.out.println("\nAfter Updating of : " + name + ", " + contact);
//        for (info c : list) {
//            if (c.getName().equalsIgnoreCase(name) && c.getContact().equalsIgnoreCase(contact)) {
//                c.setName(newName);
//                c.setContact(newContact);
//            }
//        }
//    }
//
//    public void display()
//    {
//        for (info c : list) {
//            System.out.println(" Name : " + c.name + ", Contact : " + c.contact);
//        }
//    }
//}
//
//public class Details {
//
//    public static void main(String[] args)
//    {
//        contactList contct = new contactList();
//        String name,number;
//
//        System.out.println("Before Deletion : ");
//        contct.add("Hardik","7498923490");
//        contct.add("Devansh","3049847713");
//        contct.add("jenny","1273761899");
//        contct.display();
//
//        contct.delete("Hardik","7498923490");
//        contct.display();
//
//
//        contct.update("jenny","1273761899","Jennifer","1202998419");
//        contct.display();
//    }
//}
//
//
//
interface A
{
    void myMethod();
}
class B
{
    public void myMethod()

    {
        System.out.println("My Method");
    }
}

class C extends B implements A
{

}
class MainClass
{
    public static void main(String[] args)
    {
        A a = new C();
        a.myMethod();
    }
}