package gameofthrones;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gameofthrones {

 public static void main(String[] args) {
 Scanner myScan = new Scanner(System.in);
 String ans = myScan.nextLine();
 
 if (ans == null || ans.length() &lt; 2 || ans.equals("") ) {
 System.out.println("NO");
 return;
 }
 Map&lt;Character,Integer&gt; myMap = new HashMap();
 for(int i=0; i&lt;ans.length();i++){
 char key = ans.charAt(i);
 if(myMap.containsKey(key)){
 myMap.put(key, myMap.get(key) + 1);
 }else{
 myMap.put(key, 1);
 }
 }
 int oddCount=0;
 int oneCharCount = 0;
 for (Map.Entry&lt;Character, Integer&gt; entry : myMap.entrySet()) {
 if (entry.getValue() % 2 != 0) {
 oddCount++;
 
 if (oddCount &gt; 1) {
 System.out.println("NO");
 return;
 }
 }
 }
 System.out.println("YES");
 myScan.close();
 }