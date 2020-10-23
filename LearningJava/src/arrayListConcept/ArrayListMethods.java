package arrayListConcept;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
ArrayList<String> s1 = new ArrayList<String>();

s1.add("Trump");//0
s1.add("Biden");//1
s1.add("Alom");//2
s1.add("Subhra");//3
s1.add("Hasib");//4

ArrayList <String> s2 = new ArrayList<String>();

s2.add("Chicken");
s2.add("Lamb");

//addAll() Method

/*s1.addAll(s2);
System.out.println(s1);

s1.addAll(1,s2);
System.out.println(s1);// Trump, Chicken, Lamb, Biden, Alom, Subhra, Hasib


//Clear()
s1.clear();
System.out.println(s1);*/

//Clone()

ArrayList<String> cloneList = (ArrayList<String>)s1.clone();

System.out.println(cloneList);

//contains returns True or false

System.out.println(s1.contains("Alom"));

System.out.println(s1.contains("l"));

// IndexOf() ---> if we give any condition then it will return Boolean value. Or if we just mention the value then it will return the index number

System.out.println(s1.indexOf("Hasib")>0);
System.out.println(s1.indexOf("Hasib"));

	}

}
 