import java.util.*;

public class arraylistexample{
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("ReactJS");
        languages.add("C++");
        

        System.out.println("\nbefore any operation: "+languages);

        languages.add(2,"AngularJS");

        System.out.println("\nAfter adding Angular:"+languages);

        languages.set(4,"C");

        System.out.println("\nAfter Set C at the place of C++:"+languages);

        ArrayList<String> other = new ArrayList<>();
        other.add("Ruby");
        other.add("Perl");
        languages.addAll(other);
        System.out.println("\nAfter adding other languages: "+languages);

        System.out.println("\nlanguage at 3: "+languages.get(3));

        System.out.println("\nIs empty: "+languages.isEmpty());

        if(languages.contains("NodeJs")){
            System.out.println("\nNodeJS is present");
        }
        else{
            System.out.println("\nNodeJS is not present");
        }

        System.out.println("\nIndex of ReactJS: "+languages.indexOf("ReactJS"));

        System.out.println("\nTo array:");
        String[] array = languages.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        ArrayList<String> lans = new ArrayList<>(Arrays.asList(array));
        System.out.println("\nFrom array to arraylist:");
        System.out.println(lans);

        languages.remove(2);
        languages.remove("ReactJS");
        languages.remove(String.valueOf("Perl"));
        System.out.println("\nAfter removing ReactJS and AngularJS:"+languages);

        languages.clear();
        System.out.println("\nAfter clearing arraylist:"+languages);

        

    }
}