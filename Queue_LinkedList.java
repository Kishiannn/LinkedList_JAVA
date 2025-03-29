import java.util.LinkedList;

public class PracticeJava {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        
        System.out.println("This is my favorite Manhwa Character\n");
        
        list.offer("Tanjiro");
        list.offer("Jin Mori-Jin");
        list.offer("Sung Jin Woo");
        list.offer("Yoo Gamin");
        list.offer("Daniel Park");
        
        
        list.poll();
        //Tangiro is not a Manhwa Character It should be remove
        
        
        
        list.add(2, "Yoo Hobin");
        System.out.println(list);
    }
}
