import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> wylosowane = new ArrayList<>();
    for(int i = 0; i <20; i++){
        wylosowane.add((int)(Math.random()*50+1));
    }
        System.out.println(wylosowane);
        HashSet<Integer> wylosowaneBez = new HashSet<>();
        for(Integer element:wylosowane){
            wylosowaneBez.add(element);
        }
        System.out.println(wylosowaneBez);

        for(Integer element:wylosowaneBez){
            boolean pierwsza = true;
            for(int i=2;i<element;i++){
                if(element%i==0){
                    pierwsza = false;
                }
            }
            if(pierwsza){
                System.out.print(element+" ");
            }
        }
    }
}