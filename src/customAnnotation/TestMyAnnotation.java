package customAnnotation;

import java.lang.reflect.Method;

public class TestMyAnnotation {

	@MyAnnotation(name="mohamed aboali")
	public static void getName() throws NoSuchMethodException, SecurityException {
		TestMyAnnotation test=new TestMyAnnotation();
		Class c = test.getClass();
		Method[] methods = c.getMethods();
		for (Method m : methods) {
		    if (m.isAnnotationPresent(MyAnnotation.class)) {
		    	MyAnnotation ta = m.getAnnotation(MyAnnotation.class);
		        System.out.println(ta.name());
		    }
		    
		}
		
		Method method = c.getMethod("getName", null);
		MyAnnotation annotations = method.getAnnotation(MyAnnotation.class);
		System.out.println(annotations.name());
	}
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		TestMyAnnotation.getName();
	}

}
