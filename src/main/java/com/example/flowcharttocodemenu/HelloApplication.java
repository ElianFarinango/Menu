package com.example.flowcharttocodemenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;
public class HelloApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoices = 0;
        while (menuChoices != 9) {
            System.out.println("           |Heli´s daily life|         ");
            System.out.println("==Enter a value to access in the game==");
            System.out.println(" 1 to Join in the game  /  9 to Exit");
            menuChoices = scanner.nextInt();
            if (menuChoices== 1) {
                System.out.println("Heli is a student of the Information Systems");
                System.out.println("       Engineering career at UCE.");
                System.out.println("Do you want to take control of Heli's life for a day?");
                System.out.println("1 to Yes  /  0 to No");1

                int firstChoice = scanner.nextInt();
                if (firstChoice == 1) {
                    System.out.println("Heli gets yo about 5:30 in the morning");
                    System.out.println("1 to Return to the bed  / 2 to Prepare for the day");
                    int secondChoice=scanner.nextInt();
                    if (secondChoice==2) {
                        System.out.println("He prepare the breakfast, brushes his teeth and");
                        System.out.println("changes his clothes, now he run to reach the bus");
                        System.out.println("Heli reach the bus?");
                        System.out.println("1 to Yes  /  2 to No");
                        int thirdChoice=scanner.nextInt();
                        if(thirdChoice==1){
                            System.out.println("Now heli is traveling across the city to arrive at");
                            System.out.println("               the university");
                            System.out.println("Heli enters the university to go to his class?");
                            System.out.println("1 to Yes  /  2 to No");
                            int fourthChoice=scanner.nextInt();
                            if(fourthChoice==1){
                                System.out.println("Heli go to his class and learn more things");
                                System.out.println("       this will be a great day");
                                System.out.println("Now he is going to go home, he reach the bus?");
                                System.out.println("1 to Yes  /  2 to No");
                                int fifthChoice=scanner.nextInt();
                                if(fifthChoice==1){
                                    System.out.println("Heli returns to his house and make his homeworks");
                                    System.out.println("he finally can rest for this day, and definitely");
                                    System.out.println("            this was a great day");
                                    System.out.println("           ****END OF THE GAME***");
                                }else if (fifthChoice==2){
                                    System.out.println("Some thieves corner Heli and steal him");
                                    System.out.println("          ***GAME OVER***");
                                }else{
                                    System.out.println("Invalid choice");
                                }
                            }else if (fourthChoice==2){
                                System.out.println("Heli loses his way and ends up drinking");
                                System.out.println("           ***GAME OVER***");
                            }else{
                                System.out.println("Invalid choice");
                            }
                        }else if (thirdChoice==2){
                            System.out.println("Heli can´t reach the bus and don´t go to the university");
                            System.out.println("                     ***GAME OVER***");
                        }else{
                            System.out.println("Invalid choice");
                        }
                    }else if (secondChoice==1){
                        System.out.println("Heli sleeps more than other days and now he is late...");
                        System.out.println("                  ***GAME OVER***");
                    }else{
                        System.out.println("Invalid choice");
                    }
                } else if (firstChoice == 0) {
                    System.out.println("Exiting...");
                } else {
                    System.out.println("Invalid choice");
                }
            }else if (menuChoices == 9) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}