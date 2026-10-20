package com.pluralsight;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("What is the date of reservation (mm/dd/year): ");
        String date = input.nextLine();

        System.out.print("How many tickets: ");
        int ticket = input.nextInt();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(date,formatter);

        int firstSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0,firstSpace);
        String lastName = fullName.substring(firstSpace + 1);

        if(ticket > 1){
            System.out.printf("%d tickets reserved for %s under %s, %s", ticket,date,lastName,firstName);}
                else{
            System.out.printf("%d ticket reserved for %s under %s, %s", ticket,date,lastName,firstName);;}


    }


}
