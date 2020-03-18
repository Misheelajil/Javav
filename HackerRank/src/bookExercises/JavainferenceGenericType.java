package bookExercises;
import java.lang.reflect.*;

public class JavainferenceGenericType {
	   public static void main(String[] args) {
	      //type inference   
	      Box<Integer> integerBox = new Box<>();
	      //unchecked conversion warning
	      Box<String> stringBox = new Box<String>();

	      integerBox.add(new Integer(10));
	      stringBox.add(new String("Hello World"));
	      integerBox.add(new Integer(11));
	      stringBox.add(new String("Hello World1"));
	      integerBox.add(new Integer(12));
	      stringBox.add(new String("Hello World2"));
	      System.out.printf("Integer Value :%d\n", integerBox.get());
	      System.out.printf("String Value :%s\n", stringBox.get());
	      Class  aClass = Box.class;
	    		  try {
					Field field = aClass.getField("someField");
					 System.out.print(field);
					 Object fieldtype = field.getType();
					 System.out.println("+" + fieldtype);
					 String fieldName = field.getName();
					 System.out.println("++" + fieldName);
				} catch (NoSuchFieldException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		 
	   }
	}

	class Box<T> {
	   private T t;
	   public String someField = "Something";
	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }   
	}
