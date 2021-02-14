package com.test;
import java.util.*;
import java.util.Map.Entry;

 class String1 {
	public static void main(String[] args)
	{
	String s="hi hello hi hello how";
	String s1[]=s.split(" ");
	Map<String,Integer> mp=new LinkedHashMap<String,Integer>();

	for(String s2:s1)
	{
	if(mp.containsKey(s2))
	{
	Integer i=mp.get(s2);
	mp.put(s2,i+1);
	}
	else
	mp.put(s2,1);
	}
	Set<Entry<String,Integer>> entry=mp.entrySet();
	for(Entry<String,Integer> print:entry)
	{
	System.out.println(print.getValue()+" "+print.getKey());
	}


}
 }
