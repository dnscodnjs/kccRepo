package kosa.dataStructure;

import java.util.Stack;

public class StackQueueExam {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
