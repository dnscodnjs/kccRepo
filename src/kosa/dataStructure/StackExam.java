package kosa.dataStructure;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Stack<Coin> stackCoin = new Stack<>();

        // 값 추가
        stack.add(3);
        stack.add(10);
        stack.push(14);

        stackCoin.add(new Coin(3, "십원"));
        stackCoin.add(new Coin(5, "백원"));

        System.out.println(stack);

        System.out.println(stackCoin.toString());

        // 스택의 마지막 요소 제거함과 동시에 해당 값을 반환
        System.out.println("출력 값 : " + stack.pop());

        System.out.println(stack);

        // 마지막 요소를 제거하지 않고 값만 반환
        System.out.println(stack.peek());
        System.out.println(stack);

        // coin
        Coin temp = stackCoin.pop();
        System.out.println(temp.getValue());
        System.out.println(temp.getName());
        
        if(stackCoin.isEmpty()) System.out.println("비어있따");
        else System.out.println("차있다");

        // search
        System.out.println(stack.search(10));

        // 포함
        System.out.println(stack.contains(3));

        // 싹 삭제
        stack.clear();

        System.out.println(stack);

    }
}
