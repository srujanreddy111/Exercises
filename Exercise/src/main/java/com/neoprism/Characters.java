package com.neoprism;

public class Characters {

	public static void main(String[] args) {
		System.out.println("List of ASCII Characters from 1 to 122: ");
        
        for(int i = 1; i <= 122; i++)
        {
             System.out.format("%1$-5d", i);
             System.out.format("%1$-2c", (char) i);
             System.out.println();
        }

	}

}
