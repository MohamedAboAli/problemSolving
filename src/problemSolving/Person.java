package problemSolving;

import java.util.List;
import java.util.stream.Collectors;

public class Person{

    private int age;
    private String name;

    public int getAge() {
        return age; 
    }

    public String getName() {
        return name;
    }
    
    
    public List<Person> filter(List<Person> l){
    	
    	return l.stream().filter(i->i.age >=18 ).collect(Collectors.toList());
    	
    }

}