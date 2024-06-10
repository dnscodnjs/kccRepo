package kosa.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackMission {
    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = str.split("");

        for (String s : arr) {

            if (s.equals("(")) stack.add(s);

            if (s.equals(")")) {
                if( stack.isEmpty() || stack.peek().equals(")")){
                    stack.add(s);
                }else stack.pop();
            }
            System.out.println(stack);
        }

        if (stack.isEmpty()) System.out.println("일치");
        else System.out.println("불일치");

    }
}
