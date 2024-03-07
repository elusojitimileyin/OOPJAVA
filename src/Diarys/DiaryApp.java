package Diarys;

import javax.swing.*;
import java.util.Scanner;

public class DiaryApp {
    private static final Diary newUser = new Diary("Timi", "1111");

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void print(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }
//    private static final Scanner scanner = new Scanner(System.in);
//
//    private static String input(String prompt) {
//        System.out.print(prompt);
//        return scanner.nextLine();
//    }
//
//    private static void print(String prompt) {
//        System.out.println(prompt);
//    }

    public static void main(String[] args) {
        mainApp();
    }


    public static void mainApp() {
        String display = """
                Welcome To App By TIMI
                Display Diary Icon...
                1 --> Create Diary
                2 --> Lock Diary
                3 --> Unlock Diary
                4 --> Find Entry By Id
                5 --> Add Entry
                6 --> Update Entry
                7 --> Delete Entry
                8 --> Exit App
                """;
        String choice = input(display + "Enter your choice: ");
        switch (choice.charAt(0)) {
            case '1' -> createDiary();
            case '2' -> lockDiary();
            case '3' -> unlockDiary();
            case '4' -> findEntryById();
            case '5' -> createEntry();
            case '6' -> updateEntry();
            case '7' -> deleteEntry();
            case '8' -> exitApp();
            default -> mainApp();
        }
    }

    public static void deleteEntry() {
        String id = input("Kindly Enter The Unique Id Of The Entry: ");
        try {
            int entryId = Integer.parseInt(id);
            newUser.deleteEntry(entryId);
            print("Entry deleted successfully.");
        } catch (NumberFormatException e) {
            print("Invalid entry ID. Please enter a valid number.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void updateEntry() {
        String id = input("Kindly Edit The Unique Id Of The Entry: ");
        String title = input("Kindly Edit The Title Of The Entry: ");
        String body = input("Kindly Edit The Body Of The Entry: ");
        try {
            int entryId = Integer.parseInt(id);
            newUser.updateEntry(entryId, title, body);
            print("Entry updated successfully.");
        } catch (NumberFormatException e) {
            print("Invalid entry ID. Please enter a valid number.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void createEntry() {
        String id = input("Kindly Enter The Unique Id Of The Entry: ");
        String title = input("Kindly Enter The Title Of The Entry: ");
        String body = input("Kindly Enter The Body Of The Entry: ");
        try {
            int entryId = Integer.parseInt(id);
            newUser.createEntry(entryId, title, body);
            print("Entry created successfully.");
        } catch (NumberFormatException e) {
            print("Invalid entry ID. Please enter a valid number.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void findEntryById() {
        String id = input("Kindly Enter The Unique Id Of The Entry: ");
        try {
            int entryId = Integer.parseInt(id);
            newUser.findEntryById(entryId);
            print("Entry found successfully.");
        } catch (NumberFormatException e) {
            print("Invalid entry ID. Please enter a valid number.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    public static void lockDiary() {
        String password = input("Enter password To Lock Diary: ");
        try {
            newUser.lockDiary(password);
            print("Diary locked successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void unlockDiary() {
        String password = input("Enter password To Unlock Diary: ");
        try {
            newUser.unlockDiary(password);
            print("Diary unlocked successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void createDiary() {
        String username = input("Kindly Enter A username Of Your Choice: ");
        String password = input("Kindly Enter A password Of Your Choice: ");
        try {
            Diary myDiary = new Diary(username, password);
            print("Diary Create successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void exitApp() {
        System.exit(0);
        print("Thanks for using App By TIMI");
    }
}
