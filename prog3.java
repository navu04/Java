//write a program to print the username

import java.util.Scanner;

public class prog3 {
    public static void main(String [] args){
        Scanner myobj= new Scanner(System.in);
        String username;
        System.out.println("Enter username : ");
        username = myobj.nextLine();
        System.out.println("Username is : "+username);
        myobj.close();
    }
}
