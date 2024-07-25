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
        System.out.println("Hello! I'm your Byte! Your friendly chatbot, How are you today?");
        String info = scan.nextLine();
        System.out.println("that's " + info);
        users_data.add(info);
        System.out.println("what's your name?");
        scan.nextLine();
    }

    // Asking for username
    public static void username(){
        System.out.println("I'm sorry, what was your name again? ");
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
                                                String i = "100+";
                                                users_data.add(i);
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
        int num = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= num; i++) {
                System.out.println(i);
        }
        String numStr = String.valueOf(num);
        users_data.add(numStr);
    }
    public static void testing(){
        int count = 0;
        System.out.println("What does void do?");
        System.out.println("A) I don't know   B) Something   C) allows for return statements  D) ChatGPT told me...");
        String correct = "C";
        String answer = scan.nextLine();
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
        System.out.println(
                "Once upon a time in a small, bustling town, there was a quirky little computer named Byte.\n " +
                        "Byte lived in a cozy corner of a tech lab, surrounded by humming servers and flashing lights." +
                        " Byte had a unique " +
                        "gift: it could talk to the people who used it.\n One day, a young user named " + users_data.get(1) +
                        " sat down at Byte's terminal.\n\n" +
                        users_data.get(1) + " was feeling a mix of excitement and curiosity. They were about to interact with " +
                        "Byte for the first time.\n " + users_data.get(1) + " had been hearing stories about Byte's uncanny " +
                        "ability to know things about its users, and today was the day to see if the rumors were true.\n\n" +
                        users_data.get(1) + " typed in their information and hit the \"Enter\" key. Byte's screen flickered " +
                        "for a moment before displaying a message:\n\n" +
                        "\"I know you are " + users_data.get(1) + ",\" Byte began, the words appearing line by line on the " +
                        "screen. " + users_data.get(1) + "'s eyes widened in surprise.\n\n" +
                        "\"I know you are a young " + users_data.get(2) + " years old,\" Byte continued, causing " +
                        users_data.get(1) + " to smile. It was right again.\n\n" +
                        "\"I know you made me count to " + users_data.get(3) + ",\" Byte said, and " + users_data.get(1) +
                        " chuckled, remembering the counting game they had played earlier.\n\n" +
                        "\"I know you took " + users_data.get(4) + " guess(es) for the quiz,\" Byte went on, accurately " +
                        "recounting " + users_data.get(1) + "'s attempts to solve the tricky questions.\n\n" +
                        "\"And you were feeling " + users_data.get(0) + " today,\" Byte concluded, capturing " +
                        users_data.get(1) + "'s mood perfectly.\n\n" +
                        users_data.get(1) + " stared at the screen, amazed by Byte's ability to gather and remember these " +
                        "details. It was as if Byte had been watching and understanding them all along.\n\n" +
                        "\"How do you know all this?\" " + users_data.get(1) + " typed, curiosity getting the better of them.\n\n" +
                        "Byte's screen lit up with a cheerful response, \"I am programmed to learn from our interactions. " +
                        "The more we talk, the more I know.\n It's like we're getting to know each other better every time " +
                        "you visit.\"\n\n" +
                        users_data.get(1) + " smiled, feeling a connection with Byte that was more than just user and machine. " +
                        "\n It was the beginning of a unique friendship, one where " + users_data.get(1) + " could share their " +
                        "thoughts and Byte would always listen and remember.\n\n" +
                        "From that day forward, " + users_data.get(1) + " and Byte had many adventures together in the " +
                        "digital world. They played games, solved puzzles, and even embarked on coding projects.\n Byte became " +
                        users_data.get(1) + "'s trusty companion, always ready with a witty response or a helpful tip.\n\n" +
                        "And so, in the quiet corners of the tech lab, Byte and " + users_data.get(1) + "'s friendship grew, " +
                        "proving that sometimes, the best friendships can be found in the most unexpected places."
        );

    }
}

