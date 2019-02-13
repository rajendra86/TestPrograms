package cloneexample;

import java.util.HashMap;
import java.util.Map;

public class CloneShallow implements Cloneable {
	 
    private String name;
    private Map<Integer, Integer> map;
    
    public CloneShallow(String name,Map<Integer,Integer> map){
           this.name=name;
           this.map=map;
    }
    
    /*
     * override clone method for doing shallow copy.
     */
       @Override
    public Object clone() {
           System.out.println("Doing shallow copy");
           try {
                  return super.clone();
           } catch (CloneNotSupportedException e) {
                  return null;
           }
    }
 
    public static void main(String[] args) throws CloneNotSupportedException  {
           
           Map<Integer,Integer> map=new HashMap<Integer,Integer>();
           map.put(11, 11);
           
           CloneShallow obj=new CloneShallow("ankit",map);
           
           CloneShallow clonedObj=(CloneShallow)obj.clone();
           
           System.out.println(obj==clonedObj);             //false
           System.out.println(obj.equals(clonedObj));     //false
           System.out.println(obj.name==clonedObj.name);   //true
           System.out.println(obj.map==clonedObj.map);     //true
           
           int decimalInt = 26; //decimal
           int hexaDecimalInt = 0x1c; //hexadecimal
           int binaryInt = 011100; //binary
           System.out.println(binaryInt);
           System.out.println(new Integer(binaryInt));
           
           System.out.println("Hai hello how r u\fi am fine");
    }
 
}
