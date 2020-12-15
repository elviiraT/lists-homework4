package com.company;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main
{

    public static void main(String[] args)
    {
        LinkedList <Integer> numberList = new LinkedList<> ();
        try (Scanner input = new Scanner (System.in))
    {
        while(input.hasNextInt())
        {
            int num = input.nextInt();
            ListIterator<Integer> it = numberList.listIterator();
            while(it.hasNext())
            {
                if (it.next() == num)
                {
                    it.remove();
                }
            }
            numberList.addFirst(num);
        }
    }
	catch (Exception e)
    {
        System.out.println("got exception: " + e);
        System.exit(-1);
    }
        System.out.println(numberList);
    }
}
