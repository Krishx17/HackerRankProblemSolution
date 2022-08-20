/**
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

WAP to find if the string is a palindrome string or not .

**/
// solution source code :

import java.util.Scanner;
import static java.lang.System.out;
public class Palindrome 
{  
    public static void main(String args[])
    {   
        int temp = 0 ;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count = str.length();
        /** 
        seperating each element of the str and storing it in the array 
        **/

        char arr[] = new char[str.length()]; 
        /**
         * for loop to iterate through each character of the str and 
         * store it in the array.
         **/
        System.out.println("Character Array : ");
        for (int i = 0 ; i < str.length() ; i++)
        {
            arr[i] = str.charAt(i);
        }
        
        /**
         * another loop to print out the values of the array .
         **/
        for(int i = 0 ; i < str.length() ; i++)
        {   
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        /**
         * creating another loop to iterate through each character of the 
         * string in reverse order and save them in 
         * another array.
         **/
        char revArr[] = new char[str.length()];
        System.out.println("Reverse Character Array :");
        for (int i = 0 ; i < str.length() ; i++)
        {
            revArr[i] = str.charAt(count-1);
            count -= 1;
        }
        /**
         * Creating another loop to iterate through each element of the 
         * revArr and to print them out.
         **/
        for(int i = 0 ; i < str.length() ; i++)
        {
            System.out.print(revArr[i]+" ");
        }
        System.out.println("\n");
        /**
         * creating another loop to compare the values of both the arrays .
        **/
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(arr[i] == revArr[i])
            {
                temp += 1; 
            }
            else 
            {
                out.printf("String %s is not a palindrome string!",str);
                break;
            }  
        }
        if (temp == str.length())
        {
            out.printf("String %s is a palindrome string!",str);
        }
        sc.close();
    }
}