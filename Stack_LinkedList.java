import java.util.LinkedList;

public class PracticeJava {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        System.out.println("This is my favorite Manhwa Character\n");
        
        list.push("Jin Mori-Jin");
        list.push("Sung Jin Woo");
        list.push("Yoo Gamin");
        list.push("Daniel Park");
        list.push("Tanjiro");
        
        
        list.pop();
        //Tangiro is not a Manhwa Character It should be remove
        
        
        
        list.add(2, "Yoo Hobin");
        System.out.println(list);
    }
}
