package kosa.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListExam {
    public static void main(String[] args) throws IOException {

        Random random = new Random();

        int[] arr = new int[6];
        int j = 0;
        while(true){
            int n = random.nextInt(45) + 1;

            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == n) flag = false;
            }

            if(flag) {
                arr[j] = n;
                j++;
            }
            if(j == 5) break;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //ArrayList

        List<Integer> ar = new ArrayList<>();

        while(true){
            int n = random.nextInt(45) + 1;
            if(!ar.contains(n)) ar.add(n);

            if(ar.size() == 6) break;
        }

        Collections.sort(ar);
        System.out.println(ar);

        // set 자료구조
        HashSet<Integer> hs = new HashSet<>();

        while(true){
            hs.add(random.nextInt(45) + 1);
            if(hs.size() == 6) break;
        }

        List<Integer> ar2 = new ArrayList<>(hs);
        Collections.sort(ar2);
        System.out.println(ar2);

        List<String> list = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("1. 데이터 추가 2. 데이터 삭제 3. 데이터 출력 4. 종료");
            System.out.print("입력 : ");
            int n = Integer.parseInt(br.readLine());

            if(n == 1){
                System.out.print("추가할 단어 입력 : ");
                String str = br.readLine();
                list.add(str);
            } else if (n == 2) {
                System.out.print("삭제할 단어 입력 : ");
                String str = br.readLine();
                list.remove(str);
            } else if (n == 3) {
                Iterator<String> iter = list.iterator();
                while(iter.hasNext()){
                    System.out.print(iter.next());
                }
                System.out.println(list);
            } else if (n == 4) {
                break;
            }else System.out.println("다시 입력해라");
        }

    }
}
