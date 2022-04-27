package ch17_util;
import java.util.*;
//-----------------------------
//	key		value
//-----------------------------
//	"id"	"kim"
//	"pwd"	"k1234"
//-----------------------------
public class Test12_Hashtable {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("id", "kim");
		ht.put("pw", "k123");
		ht.put("name", "È«±æµ¿");
		//------------------------
		//²¨³»¾î Ãâ·Â
		String id = ht.get("id");
		String pw = ht.get("pw");
		String name = ht.get("name");
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		System.out.println();
		//²¨³»¼­ ¹Ù·Î Ãâ·Â
		System.out.println(ht.get("id"));
		System.out.println(ht.get("pw"));
		System.out.println(ht.get("name"));
	}//main-end
}//class-end
