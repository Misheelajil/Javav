import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

class Priorities{
    public List<Student> getStudents(List<String> events){
    	PriorityQueue<Student> queue=new PriorityQueue<Student>();  
    	for (String i : events) {
        	String [] ar =new String[4];
        	String e = "ENTER";
        	ar=i.split(" ");
        	for (String a:ar) {
        		if (a.contains(e)) {
        			queue.add(new Student(ar[1],Integer.valueOf(ar[3]),Double.valueOf(ar[2])));
        		}
        		else {
        			queue.poll();
        		}
        	}
        }
    	
		return new ArrayList<Student>(queue);
        
    }
 
}
class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;
    public Student(String name, int id, double cgpa)
    {
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }
    int getID(int id){
        return id;
    }
    String getName(){
        return name;
    }
    double getCGPA(double cgpa){
        return cgpa;
    }
	@Override
	public int compareTo(Student o) {
		if (o.cgpa==cgpa) {
			if (o.name.compareTo(name)==0) {
				if (id == o.id) {
					return 0;
				}
				else if (id>o.id) {
					return 1;
				}
				else {
					return -1;
				}
			}
			else return o.name.compareTo(name);
		}
		else if (o.cgpa>cgpa) {
			return -1;
		}
		else return 1;
	}
}


public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}