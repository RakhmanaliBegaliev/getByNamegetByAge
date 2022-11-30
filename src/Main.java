import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    ArrayList<Cat>cats = new ArrayList<>();
    cats.add(new Cat("Murka",3));
    cats.add(new Cat("Max",5));
    cats.add(new Cat("Jone",2));
    getByAge(cats, 5);
    getByName(cats, "Jone");
    }
    public static void getByName(ArrayList<Cat>cats,String name){
        for (int i = 0; i < cats.size(); i++) {
            if(cats.get(i).getName().equals(name)){
                System.out.println(cats.get(i));
            }
        }
    }
    public static void getByAge(ArrayList<Cat>cats, int age){
        for (int i = 0; i < cats.size(); i++) {
            if(cats.get(i).getAge() == age){
                System.out.println(cats.get(i));
            }
        }
    }
    
}