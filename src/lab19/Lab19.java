package lab19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author dvandenberge
 */
public class Lab19 {
    
    public static void main(String[] args) {
        //challenge1();
        //challenge2();
        //challenge3();
        //challenge4();
    }
    
    public static void challenge1(){
        List hobbyItems = new ArrayList();
        hobbyItems.add("Computers");
        hobbyItems.add("Guitars");
        hobbyItems.add("Cooking");
        
        for(Object h:hobbyItems){
            final String hobbyItem=(String)h;
            System.out.println(hobbyItem);
        }
        System.out.println("");
        
        hobbyItems.add("Biking");
        hobbyItems.add("Running");
        
        for(Object h:hobbyItems){
            final String hobbyItem=(String)h;
            System.out.println(h);
        }
        System.out.println("");
        
        hobbyItems.remove("Cooking");
        
        for(Object h:hobbyItems){
            final String hobbyItem=(String)h;
            System.out.println(hobbyItem);
        }
    }
    
    public static void challenge2(){
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("William","Jones","111-11-1111"));
        employees.add(new Employee("Bob","Roberts","222-22-2222"));
        employees.add(new Employee("Joe","Josephs","333-33-3333"));
        for(Employee e:employees){
            System.out.println(e.toString());
        }
    }
    
    public static void challenge3(){
        List things=new ArrayList();
        things.add(new Employee("William","Jones","111-11-1111"));
        things.add(new Dog("Rover",12));
        things.add(new Employee("Bob","Roberts","222-22-2222"));
        things.add(new Dog("Husky",45));
        //Using the toString method from the superclass, in this case, Object, you can
        //output meaningful info for each object in the list
        for(Object o:things){
            System.out.println(o.toString());
        }
    }
    
    public static void challenge4(){
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(new Employee("William","Jones","111-11-1111"));
        employees.add(new Employee("Bob","Roberts","222-22-2222"));
        employees.add(new Employee("Joe","Josephs","333-33-3333"));
        //Duplicate
        employees.add(new Employee("Bob","Roberts","222-22-2222"));
        
        for(Employee e:employees){
            System.out.println(e.toString());
        }
        
    }
}
