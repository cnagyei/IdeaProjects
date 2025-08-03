/*
Stop, yield, go: Traffic conductor's waltz
 Report a typo
Design a basic traffic light controller. Create methods to handle different light states (red, yellow, green)
and cycle through them. The main method should simulate the traffic light cycle. Input is the
current state (0 for red, 1 for yellow, 2 for green), and output is the next state and action.
 */
import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);
    }

    public static String getNextState(int currentState) {
        String nextState = "";
        switch (currentState) {
            case 0:
                nextState = "1";
                break;
            case 1:
                nextState = "2";
                break;
            case 2:
                nextState = "0";
                break;
        }
        return nextState;
    }

    public static String getAction(int currentState) {
            String nextAction = "";
            switch (currentState) {
                case 0:
                    nextAction = "Change to Yellow";
                    break;
                case 1:
                    nextAction = "Change to Green";
                    break;
                case 2:
                    nextAction = "Change to Red";
                    break;
            }
            return nextAction;
        }
    }