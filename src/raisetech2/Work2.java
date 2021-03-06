package raisetech2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Work2 {

  public static void main(String[] args) {
    //Hello worldの出力
    String greeting = "Hello world";
    hello(greeting);

    //1~10までの足し算
    int n=0;
    calculation(n);
    
    //３年後の今日の曜日
    LocalDateTime day1 = LocalDateTime.now();
    LocalDateTime day2 = day1.plusYears(3);
    System.out.println(day2.getDayOfWeek());
    
    //引数が０なら偽。１なら真。
    int num=1;
    checkNumber(num);
    
    
    //ListとMap
    ArrayList <String> fruits = new ArrayList<String>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");
    System.out.println(fruits.get(1));
    
    HashMap<Integer, String> season = new HashMap();
    season.put(1,"spring");
    season.put(2,"summer");
    season.put(3,"fall");
    season.put(4,"winter");
    System.out.println(season.get(2));
    }
    
    public static void calculation(int n) {
      for(int i=1; i<=10; i++) {
        n += i;}
      System.out.println(n);
    }
    public static void hello(String greeting) {
      System.out.println(greeting);
    }
    public static void checkNumber(int num) {
      if(num==1) {
        System.out.println(true);
      }else if(num==0){
        System.out.println(false);
      }
    }
}



