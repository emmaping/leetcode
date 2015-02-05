import java.util.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class temp {
	public static class Person {

	    private int    id;
	    private String name;

	    public Person(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public boolean equals(Person person) {
	        return person.id == id;
	    }

	    public int hashCode() {
	        return id;
	    }

    }
    public static void main(String[] args) {

        Set<Person> set = new HashSet<Person>();
        for (int i = 0; i < 10; i++) {
            set.add(new temp.Person(1, "Jim"));
        }
        System.out.println(set.size());
    }
}