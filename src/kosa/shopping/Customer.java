package kosa.shopping;
import java.util.LinkedList;
import java.util.Queue;

public class Customer {
    String id;
    String pwd;
    String name;
    String address;
    Queue<Order> orders = new LinkedList<>();
}