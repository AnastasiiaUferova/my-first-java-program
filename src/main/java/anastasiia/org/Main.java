package anastasiia.org;


import lol.Lol;

import java.util.ArrayList;

public class Main {
  static void main() {

    System.out.println("Hello world");

    Lol.sayLol();

    int myAge = 28;
    System.out.println(myAge);
    var timePassed = "1 year later";
    System.out.println(timePassed);
    myAge++;
    System.out.println(myAge);
    timePassed  = "2 years later";
    System.out.println(timePassed);

    String[] cars = {"BMW", "Volvo", "Toyota"};

    for(String car : cars) {
      System.out.println(car);
    }

    int[] ages = {2,45,23,90};

    for(int age : ages){
      if(age > 25){
        System.out.println(age);
      }
    }

    ArrayList<String> languages = new ArrayList<>();

    languages.add("Java");
    languages.add("JavaScript");
    languages.add("PHP");
    languages.add("C++");

    languages.addFirst("Python");
    languages.add(1,"Kotlin");

    var lang = languages.get(2);

    languages.set(5, ".NET");

    System.out.println(lang);

    languages.remove(1);

    for (String language : languages) {
      System.out.println(language);
    }


    languages.clear();

    System.out.println(languages);

    for(int i = 10; i>=0; i--){
      System.out.println(i);
    }
    
  }

}
