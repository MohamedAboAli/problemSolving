package problemSolving.CF.A;
//package problemSolving;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Predicate;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//
//interface Sayable {
//	public String say(String name);
//}
//
//class Product {
//
//	String name;
//	int id;
//
//	public Product(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//	
//	
//}
//
//public class TestJava8 {
//	
//	public static String saySomething(String name){  
//        return "Hello, this is static method."+name;  
//    }  
//
//	public static void main(String[] args) {
//		
//		Runnable r=new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.err.println("ttt");
//			}
//		};
//		
//		
//		
//		Runnable r1=()-> {
//			System.err.println("lamda");
//		};
//		r.run();
//		r1.run();
//		
//		Sayable say = (name)->{
//			return name+"say HI";
//		};
//				
//				
//				//TestJava8::saySomething;
//		System.err.println(say.say("mohamed"));
//		
//		
//		 List<String> list=new ArrayList<String>();  
//	        list.add("ankit");  
//	        list.add("mayank");  
//	        list.add("irfan");  
//	        list.add("jai");  
//	          
//	        
//	        list.forEach((object)->{}
//	        );
//
//	       
//	        
//	        Product p=new Product("aaa",5);	
//		    Product p1=new Product("ac",3);	
//		    Product p2=new Product("ab",2);	
//			 
//		    List<Product> list1=new ArrayList<Product>();  
//		    list1.add(p);
//		    list1.add(p1);
//		    list1.add(p2);
//		    
//		    list1.forEach((n)->{
//	        	System.out.println(n.name);
//	        }
//	        );
//
//		    Integer productPriceList3 =list1.stream().filter(product -> product.id >2).map(prod-> prod.id).reduce(0,(sum, price)->sum+price);
//		    System.out.println("productPriceList: "+productPriceList3);
//		    List<Integer> productPriceList2 =list1.stream().filter(product -> product.id >2).map(prod-> prod.id).collect(Collectors.toList());
//		    productPriceList2.forEach((n)->{
//	        	System.out.println(n);
//	        });
////	        Collections.sort(list1,new Comparator<Product>() {
////
////	        	@Override
////				public int compare(Product p1, Product p2) {
////					// TODO Auto-generated method stub
////					return p1.name.compareTo(p2.name);
////				}			
////			}
////			);
//	
//	        
//	        Collections.sort(list1,(p99,p999)->{
//	        	return (p999.id-p99.id);
//	        });
//	        
//	        list1.forEach((n)->{
//	        	System.out.println(n.name);
//	        }
//	        );
//	}
//	
//
//}
