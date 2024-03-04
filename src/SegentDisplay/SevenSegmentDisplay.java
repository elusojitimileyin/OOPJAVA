 package SegentDisplay;



 public class SevenSegmentDisplay {


     private static String lastDisplayedNumber;

     public static void printNumber(String num) {
         switch (num) {
             case "11111101" :
                 lastDisplayedNumber = displayZero();
                 break;
             case "01100001":
                 lastDisplayedNumber = displayOne();
                 break;
             case "11011011":
                 lastDisplayedNumber = displayTwo();
                 break;
             case "11110011":
                 lastDisplayedNumber = displayThree();
                 break;
             case "01100111":
                 lastDisplayedNumber = displayFour();
                 break;
             case "10110111":
                 lastDisplayedNumber = displayFive();
                 break;
             case "10111111":
                 lastDisplayedNumber = displaySix();
                 break;
             case "11100001":
                 lastDisplayedNumber = displaySeven();
                 break;
             case "11111111":
                 lastDisplayedNumber = displayEight();
                 break;
             case "11100111":
                 lastDisplayedNumber = displayNine();
                 break;
             default:
                 System.out.println("Invalid number!");
         }
     }

     private static String displayZero() {
         System.out.println("""
                        #####
                        #   #
                        #   #
                        #   #
                        #####

                        """);
         return "11111101";
     }

     private static String displayOne() {
         System.out.println("""
                            #
                            #
                            #
                            #
                            #

                        """);
         return "01100001";
     }

     private static String displayTwo() {
         System.out.println("""
                        #####
                            #
                        #####
                        #
                        #####

                        """);
         return "11011011";
     }

     private static String displayThree() {
         System.out.println("""
                        #####
                            #
                        #####
                            #
                        #####

                        """);
         return "11110011";
     }

     private static String displayFour() {
         System.out.println("""
                        #   #
                        #   #
                        #####
                            #
                            #

                        """);
         return "01100111";
     }

     private static String displayFive() {
         System.out.println("""
                        #####
                        #
                        #####
                            #
                        #####

                        """);
         return "10110111";
     }

     private static String displaySix() {
         System.out.println("""
                        #####
                        #
                        #####
                        #   #
                        #####

                        """);
         return "10111111";
     }

     private static String displaySeven() {
         System.out.println("""
                        #####
                            #
                            #
                            #
                            #

                        """);
         return "11100001";
     }

     private static String displayEight() {
         System.out.println("""
                        #####
                        #   #
                        #####
                        #   #
                        #####

                        """);
         return "11111111";
     }

     private static String displayNine() {
         System.out.println("""
                        #####
                        #   #
                        #####
                            #
                        #####

                        """);
         return "11100111";
     }

     public static String getLastDisplayedNumber() {
         return lastDisplayedNumber;
     }


 }