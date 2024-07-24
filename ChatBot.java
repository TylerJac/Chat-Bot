import java.util.Scanner;
import java.util.ArrayList;

public class ChatBot {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> users_data = new ArrayList<>();
    public static void main(String[] args){
        greeting();
        username();
        guess_users_age();
        count();
        testing();
        story();
    }

    // Greeting message
    public static void greeting(){
        System.out.println("Hello! I'm your friendly chatbot, How are you today?");
        String info = scan.nextLine();
        System.out.println("that's " + info);
        users_data.add(info);
        System.out.println("what's your name?");
        scan.nextLine();
    }

    // Asking for username
    public static void username(){
        System.out.print("I'm sorry, what was your name again? ");
        String userName = scan.nextLine();
        users_data.add(userName);

    }

    // Guessing users age
    public static void guess_users_age(){
        System.out.println("I'm curious, are you aged between 1 and 10? (Yes or no?) ");
        String age = scan.nextLine();
        if(age.equalsIgnoreCase("Yes")) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Are you " + i + "?");
                age = scan.nextLine();
                if (age.equalsIgnoreCase("Yes")) {
                    System.out.println("Sweet, so you're " + i);
                    String ageStr = String.valueOf(i);
                    users_data.add(ageStr);
                    break;
                }
            }
        } else {
            System.out.println("Are you aged between 11 and 20? (Yes or no?) ");
            age = scan.nextLine();
            if (age.equalsIgnoreCase("Yes")) {
                for (int i = 11; i <= 20; i++) {
                    System.out.println("Are you " + i + "?");
                    age = scan.nextLine();
                    if (age.equalsIgnoreCase("Yes")) {
                        System.out.println("Sweet, so you're " + i);
                        String ageStr = String.valueOf(i);
                        users_data.add(ageStr);
                        break;
                    }
                }
            } else {
                System.out.println("Are you aged between 21 and 30? (Yes or no?) ");
                age = scan.nextLine();
                if (age.equalsIgnoreCase("Yes")) {
                    for (int i = 21; i <= 30; i++) {
                        System.out.println("Are you " + i + "?");
                        age = scan.nextLine();
                        if (age.equalsIgnoreCase("Yes")) {
                            System.out.println("Sweet, so you're " + i);
                            String ageStr = String.valueOf(i);
                            users_data.add(ageStr);
                            break;
                        }
                    }
                } else {
                    System.out.println("Are you aged between 31 and 40? (Yes or no?) ");
                    age = scan.nextLine();
                    if (age.equalsIgnoreCase("Yes")) {
                        for (int i = 31; i <= 40; i++) {
                            System.out.println("Are you " + i + "?");
                            age = scan.nextLine();
                            if (age.equalsIgnoreCase("Yes")) {
                                System.out.println("Sweet, so you're " + i);
                                String ageStr = String.valueOf(i);
                                users_data.add(ageStr);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Are you aged between 41 and 50? (Yes or no?) ");
                        age = scan.nextLine();
                        if (age.equalsIgnoreCase("Yes")) {
                            for (int i = 41; i <= 50; i++) {
                                System.out.println("Are you " + i + "?");
                                age = scan.nextLine();
                                if (age.equalsIgnoreCase("Yes")) {
                                    System.out.println("Sweet, so you're " + i);
                                    String ageStr = String.valueOf(i);
                                    users_data.add(ageStr);
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Are you aged between 51 and 60? (Yes or no?) ");
                            age = scan.nextLine();
                            if (age.equalsIgnoreCase("Yes")) {
                                for (int i = 51; i <= 60; i++) {
                                    System.out.println("Are you " + i + "?");
                                    age = scan.nextLine();
                                    if (age.equalsIgnoreCase("Yes")) {
                                        System.out.println("Sweet, so you're " + i);
                                        String ageStr = String.valueOf(i);
                                        users_data.add(ageStr);
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Are you aged between 61 and 70? (Yes or no?) ");
                                age = scan.nextLine();
                                if (age.equalsIgnoreCase("Yes")) {
                                    for (int i = 61; i <= 70; i++) {
                                        System.out.println("Are you " + i + "?");
                                        age = scan.nextLine();
                                        if (age.equalsIgnoreCase("Yes")) {
                                            System.out.println("Sweet, so you're " + i);
                                            String ageStr = String.valueOf(i);
                                            users_data.add(ageStr);
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("Are you aged between 71 and 80? (Yes or no?) ");
                                    age = scan.nextLine();
                                    if (age.equalsIgnoreCase("Yes")) {
                                        for (int i = 71; i <= 80; i++) {
                                            System.out.println("Are you " + i + "?");
                                            age = scan.nextLine();
                                            if (age.equalsIgnoreCase("Yes")) {
                                                System.out.println("Sweet, so you're " + i);
                                                String ageStr = String.valueOf(i);
                                                users_data.add(ageStr);
                                                break;
                                            }
                                        }
                                    } else {
                                        System.out.println("Are you aged between 81 and 90? (Yes or no?) ");
                                        age = scan.nextLine();
                                        if (age.equalsIgnoreCase("Yes")) {
                                            for (int i = 81; i <= 90; i++) {
                                                System.out.println("Are you " + i + "?");
                                                age = scan.nextLine();
                                                if (age.equalsIgnoreCase("Yes")) {
                                                    System.out.println("Sweet, so you're " + i);
                                                    String ageStr = String.valueOf(i);
                                                    users_data.add(ageStr);
                                                    break;
                                                }
                                            }
                                        } else {
                                            System.out.println("Are you aged between 91 and 100? (Yes or no?) ");
                                            age = scan.nextLine();
                                            if (age.equalsIgnoreCase("Yes")) {
                                                for (int i = 91; i <= 100; i++) {
                                                    System.out.println("Are you " + i + "?");
                                                    age = scan.nextLine();
                                                    if (age.equalsIgnoreCase("Yes")) {
                                                        System.out.println("Sweet, so you're " + i);
                                                        String ageStr = String.valueOf(i);
                                                        users_data.add(ageStr);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                System.out.println("It seems you are too old");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static void count(){
        System.out.println("Give me a number");
        int num = scan.nextInt();
        for (int i = 0; i <= num; i++) {
                System.out.println(i);
        }
        String numStr = String.valueOf(num);
        users_data.add(numStr);
    }
    public static void testing(){
        int count = 0;
        System.out.println("What does void do?");
        System.out.println("A) I don't know   B) Something   C) allows for return statements");
        String correct = "C";
        String answer = scan.nextLine();
        answer = scan.nextLine();

        count++;
        while (!(answer.equalsIgnoreCase(correct))){
            count++;
            System.out.println("Sorry, that's incorrect. Please try again.");
            answer = scan.nextLine();
        }
        System.out.println("Correct!");
        String strCount = String.valueOf(count);
        users_data.add(strCount);
    }
    public static void story(){
        System.out.println("I know you are " +users_data.get(1) +",\n I know you are a young " + users_data.get(2)
                +" years old,\n I know you made me count to " + users_data.get(3) +
                ",\n I know you took " + users_data.get(4) + " guesses for the quiz,\n and you were feeling "
                + users_data.get(0) + " today.");
    }
}

