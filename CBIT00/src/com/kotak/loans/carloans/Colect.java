package com.kotak.loans.carloans;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Colect 
{
	public static void main(String[] args) 
	{
		List<String> ram = new ArrayList<String>();
		ram.add("sap mm");
		ram.add("sap pm");
		ram.add("sap qm");
		System.out.println(ram);
		Iterator<String> itr = ram.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
	}
}
}