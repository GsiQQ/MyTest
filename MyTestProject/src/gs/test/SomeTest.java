package gs.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.json.JSONArray;

import org.junit.Test;

public class SomeTest {

	@Test
	public void oneTest(){
		List<String> l1=new ArrayList<String>();
		l1.add("bb");
		l1.add(0, "aa");
		LinkedList<String> l2=new LinkedList<String>();
		
		Set<String> s=new HashSet<String>();
		System.out.println(JSONArray.fromObject(l1));
	}
	
}
