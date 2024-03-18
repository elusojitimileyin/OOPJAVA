package Diarys;

import javax.swing.*;


public class DiaryApp {

    private static final DiaryUser newUser = new DiaryUser();
    private static Diary myDiary;

    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void print(String prompt) {
        JOptionPane.showMessageDialog(null, prompt);
    }

    public static void main(String[] args) {
        mainApp();
    }

    public static void welcome() {
        print("Welcome To AppByOBANTU\n");
        print("The next page Displays, Shows And Help You With Your Choice ?\n");
    }

    public static void mainApp() {
        welcome();
        String display = """
             1 --> Create Diary\s
             2 --> Lock Diary
             3 --> Unlock Diary
             4 --> Create Entry
             5 --> Find Entry By Id
             6 --> Update Entry
             7 --> Delete Entry
             8 --> Exit App\s
        """;
        String choice = input(display);
        switch (choice.charAt(0)) {
            case '1' -> createDiary();
            case '2' -> lockDiary();
            case '3' -> unlockDiary();
            case '4' -> createEntry();
            case '5' -> findEntryById();
            case '6' -> updateEntry();
            case '7' -> deleteEntry();
            case '8' -> exitApp();
            default -> mainApp();
        }
    }

    public static void deleteEntry() {
        String id = input("Kindly Enter The Unique Id Of The Entry");
        try {
            newUser.deleteEntry(myDiary, Integer.parseInt(id));
            print("Entry deleted successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void updateEntry() {
        String id = input("Kindly Edit The Unique Id Of The Entry");
        String title = input("Kindly Edit The Title Of The Entry");
        String body = input("Kindly Edit The Body Of The Entry");
        try {
            newUser.updateEntry(myDiary, Integer.parseInt(id), title, body);
            print("Entry updated successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void createEntry() {
        String id = input("Kindly Enter The Unique Id Of The Entry");
        String title = input("Kindly Enter The Title Of The Entry");
        String body = input("Kindly Enter The Body Of The Entry");
        try {
            newUser.createEntry(myDiary, Integer.parseInt(id), title, body);
            print("Entry created successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void findEntryById() {
        String id = input("Kindly Enter The Unique Id Of The Entry");
        try {
            newUser.findEntryById(myDiary, Integer.parseInt(id));
            print("Entry found successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    public static void lockDiary() {
        String password = input("Enter password To Lock Diary:");
        try {
            newUser.lockDiary(myDiary, password);
            print("Diary locked successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void unlockDiary() {
        String password = input("Enter password To Unlock Diary:");
        try {
            newUser.unlockDiary(myDiary, password);
            print("Entry unlocked successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void createDiary() {
        String username = input("Kindly Enter A username Of Your Choice");
        String password = input("Kindly Enter A passkey Of Your Choice");
        try {
            myDiary = newUser.createDiary(username, password);
            print("Diary Create successfully.");
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            mainApp();
        }
    }

    private static void exitApp() {
        System.exit(0);
    }
}