package problemSolving;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;
import java.net.URLConnection;
import java.rmi.server.ExportException;
import java.util.List;
import java.util.Scanner;

public class BalancedArray {

    public static int balancedSum(List<Integer> arr) {
        // Write your code here
        int sum=0,i=0;
        while(sum != arr.get(arr.size()-1)){
            sum+=arr.get(i);
            i++;
        }
        return i;

    }



    public static int getDiscountedPrice(int barcode) {
     try{   String url="https://jsonmock.hackerrank.com/api/inventory?barcode=".concat(String.valueOf(barcode));
         URL url1=new URL(url);
         HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();

//Get Response
         conn.setRequestMethod("GET");

         conn.connect();
String inline="";
int price,discount;
         Scanner sc = new Scanner(url1.openStream());
         while(sc.hasNext())
         {

             inline+=sc.nextLine();
         }

         sc.close();
if(inline == null || inline==""){
   return -1;
}
          price=Integer.parseInt(inline.split("price")[1].split(":")[1].split(",")[0]);
         discount=Integer.parseInt(inline.split("discount")[1].split(":")[1].split(",")[0]);


         double discountprice=price-(( (double)discount / 100)*price);
         return (int)discountprice;
    }catch (Exception ex){
         return -1;
     }

    }

    public static void main(String[] args){
        int result=getDiscountedPrice(74002314);
        System.out.println(result);
    }


}
