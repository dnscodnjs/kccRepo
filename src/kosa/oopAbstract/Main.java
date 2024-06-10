package kosa.oopAbstract;

public class Main {
    public static void main(String[] args) {
        OracleDao dao = new OracleDao();
        MySQLDao mySQLDao = new MySQLDao();

        MyService service = new MyService(dao);
        service.insertService();

        MyService service2 = new MyService(mySQLDao);
        service2.insertService();

        MyService service3 = new MyService(new Dao() {
            @Override
            void insert() {
                System.out.println("dao 호출 !");
            }
        });
        service3.insertService();

    }
}
