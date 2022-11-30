import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Murka",5));
        cats.add(new Cat("Max",3));
        cats.add(new Cat("Jony",5));

            getAge(cats, 3);
            getName(cats,"Murka");
    }
    public static void getName(List<Cat>cats,String name){

        for (int i = 0; i <cats.size() ; i++) {
            if(cats.get(i).getName().equals(name)) {
                System.out.println(cats.get(i));
            }
        }
    }
    public static void getAge(List<Cat> cats, int age){
        for (int i = 0; i < cats.size(); i++) {
            if(cats.get(i).getAge() == age){
                System.out.println(cats.get(i));
            }
        }
    }
}