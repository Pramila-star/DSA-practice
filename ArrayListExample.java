import java.util.*;

public class ArrayListExample {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
   //     list.add(68);
   //     list.add(45);
   //     list.add(69);
   //     list.add(20);

  //      System.out.println(list.contains(69)); 

  //      System.out.println(list);
  //      list.set(0,99);
  //       System.out.println(list);

  for(int i = 0; i< 10; i++){
    list.add(sc.nextInt());
  }


  for (int i = 0 ;i < 10; i++) {
       System.out.println(list.get(i));
  }
      

 
    }
}
