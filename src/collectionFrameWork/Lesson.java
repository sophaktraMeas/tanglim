package collectionFrameWork;

import java.util.ArrayList;

public class Lesson{
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for(Integer n: arrayList){
            System.out.println(n);
        }
        arrayList.set(2,100);// update by using index
        for(Integer n: arrayList){
            System.out.println(n);
        }

        arrayList.addLast(200);
        arrayList.addFirst(300);
        System.out.println("old element");
        arrayList.forEach(e-> System.out.println(e));
        arrayList.clear();
        System.out.println("New element");
        arrayList.forEach(e-> System.out.println(e));

    }
}
