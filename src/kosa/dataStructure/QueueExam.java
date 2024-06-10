package kosa.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // 값 추가
        queue.offer(4);
        queue.add(18);
        queue.offer(3);

        System.out.println(queue);

        // 값 삭제
        System.out.println(queue.peek());

        // 값 출력
        System.out.println(queue.poll());

        System.out.println(queue);

        Queue<Coin> coinQueue = new LinkedList<>();
        coinQueue.add(new Coin(3,"r"));
        coinQueue.add(new Coin(4,"d"));
        coinQueue.add(new Coin(9,"f"));

        // 코인 젤 처음 들어온거 하나 삭제할건데, 뭔지 확인
//        System.out.println(coinQueue.peek());
        System.out.println(coinQueue.poll());

        // 두번째 들어온 값 빼면서 값이랑, 이름 둘다 확인
        Coin jdatda = coinQueue.poll();
        System.out.println(jdatda.getName());
        System.out.println(jdatda.getValue());

    }
}
