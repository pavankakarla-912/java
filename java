package day14;

//import java.util.Comparator;
import java.util.TreeSet;

    class Contact implements Comparable<Contact>{
    private String name;private Long number;
    public String getName() {return name;}
    public void setName(String name) {this.name=name;}
    public Long getNumber() {return number;}
    public void setNumber(long number) {this.number=number;}
    public Contact(String name,long number)
    {this.name=name;this.number=number;}
    @Override
    public String toString()
    {return "Contact [name"+name+",number="+number+"]\n";}
    @Override
    public int compareTo(Contact o){
        return o.getNumber().compareTo(this.getNumber());
    }
}
public class HandsOnCollect{
    public static void main(String[] args) {
        //custom sort via Comparator
        TreeSet<Contact> whatsapp=new TreeSet<>();
        whatsapp.add(new Contact("venkat", 6546565L));
        whatsapp.add(new Contact("Vikas", 6562555L));
        whatsapp.add(new Contact("Praveen", 654665852L));
        whatsapp.add(new Contact("Balaji", 65465525L));
        System.out.println(whatsapp);
    }
}
