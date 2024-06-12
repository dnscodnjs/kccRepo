package kosa.thread;

public class MultiThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SmallLetters());
        thread.start();
/*        char[] arr = {'ㄱ', 'ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ'};
        
        for (char c : arr){
            System.out.println("c = " + c);
        }*/
    }
}
