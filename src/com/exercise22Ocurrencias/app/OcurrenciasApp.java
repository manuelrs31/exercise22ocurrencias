package com.exercise22Ocurrencias.app;
import java.util.HashMap;
import java.util.Random;
public class OcurrenciasApp {

	public static void main(String[] args) 
	{
		
		final int elements =100;
		
		// TODO Auto-generated method stub
		
		//Scanner input = new Scanner(System.in);
		Random numbers = new Random(System.nanoTime());
		HashMap<Integer, Integer> miHash = new HashMap<Integer, Integer>();
		int[] miArray = new int[elements];
		for (int i=0;i<elements;i++)
		{
			miArray[i] = numbers.nextInt(101);
		}
		for(int i:miArray)
		{
			System.out.println(" "+i); 
		}
		
		//process
		String res ="";
		int ocurrencias=0;
		for (int element:miArray)
		{
			 ocurrencias=0;
			if (miHash.containsKey(element))
			{
				ocurrencias = miHash.get(element);
				ocurrencias++;
				miHash.put(element, ocurrencias);
				
			}
			else
			{
				miHash.put(element,1);
			}
		}
		System.out.println(miHash);
		System.out.println(" ");
		
		/*res = miHash.putIfAbsent(element, 1);
		if (res!=null)
		{
			miHash.put(element, ocurrencias);
		}*/

	}

}
