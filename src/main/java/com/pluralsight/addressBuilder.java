package com.pluralsight;

import java.util.Scanner;

public class addressBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder build = new StringBuilder();

        System.out.print("Full name: ");
        String fullName = scan.nextLine();
        System.out.println();

        System.out.print("Billing Street: ");
        String billStr = scan.nextLine();
        System.out.print("Billing City: ");
        String billCity = scan.nextLine();
        System.out.print("Billing State: ");
        String billState = scan.nextLine();
        System.out.print("Billing Zip: ");
        String billZip = scan.nextLine();

        System.out.println();
        System.out.print("Shipping Street: ");
        String shipStr = scan.nextLine();
        System.out.print("Shipping City: ");
        String shipCity = scan.nextLine();
        System.out.print("Shipping State: ");
        String shipState = scan.nextLine();
        System.out.print("Shipping Zip: ");
        String shipZip = scan.nextLine();

        build.append("\n" + fullName + "\n\n");
        build.append("Billing Address:\n");
        build.append(billStr + "\n");
        build.append(billCity + ",\t" + billState + "\t" + billZip + "\n\n");
        build.append("Shipping Address:\n");
        build.append(shipStr + "\n");
        build.append(shipCity + ",\t" + shipState + "\t" + shipZip);

        String mybuild = build.toString();
        System.out.println(mybuild);



    }
}
