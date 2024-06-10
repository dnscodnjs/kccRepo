package kosa.queueRestaurant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class QueueMission {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Food> queOrder = new LinkedList<>();
        ArrayList<Food> foodArrayList = new ArrayList<>();
        ArrayList<Order> foodOrderList = new ArrayList<>();

        foodArrayList.add(new Food("짜장면", 9000));
        foodArrayList.add(new Food("떡볶이", 7000));
        foodArrayList.add(new Food("우동", 10000));

        Order order = new Order();

        while (true) {
            System.out.println("1. 주문 요청 2. 주문 처리 3. 총액 4. 종료");
            System.out.print("입력 : ");
            int n = Integer.parseInt(br.readLine());

            if (n == 1) {
                // 메뉴 출력
                for (int i = 0; i < foodArrayList.size(); i++) {
                    System.out.println((i + 1) +" "+ foodArrayList.get(i).getFoodName() + " " + foodArrayList.get(i).getPrice());
                }

                System.out.print("메뉴 입력  : ");
                int menu = Integer.parseInt(br.readLine());

                queOrder.add(foodArrayList.get(menu - 1));
                System.out.println(foodArrayList.get(menu -1).getFoodName() + "이 주문 되었습니다");

            } else if (n == 2) {
                if(!queOrder.isEmpty()){

                    System.out.println("== 주문 내역 ==");
                    for (Food food : queOrder) {
                        System.out.println(food.getFoodName() + " " + food.getPrice());
                    }

                    Food orderedMenu = queOrder.poll();
                    System.out.println(orderedMenu.getFoodName() +  "이 주문되었습니다!");
                    System.out.println("주문 한 건이 처리 됐습니다");
                    foodOrderList.add(new Order(Objects.requireNonNull(orderedMenu)));
                }else{
                    System.out.println("현재 주문 내역이 없습니다");
                }

            } else if (n == 3) {
                int amount = 0;
                for (int i = 0; i < foodOrderList.size(); i++) {
                    amount += foodOrderList.get(i).getAmount();
                }

                System.out.println("총액 : " + amount);
            } else if (n == 4) {
                return;
            } else System.out.println("다시 입력하쇼 ~");
        }
    }
}
