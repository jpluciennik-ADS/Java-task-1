package org;

public class Main {
    public static void main(String[] args) {

        String str =
                "--------------------------------------------------\n" +
                String.format("%18s", "") + "STUDENT 12345" + String.format("%18s", "") + "\n" +
                "First Name  | " + "Mark" +
                "Second Name | " + "Darcy\n" +
                "Raport generated on 08.07.2022 13:45\n" +
                "Room number: A123\n" +
                "--------------------------------------------------";

        System.out.println(str);

    }
}

