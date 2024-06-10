package kosa.oopAbstract;

public class MyService {
    private OracleDao oracleDao;
    private MySQLDao mySQLDao;
    private Dao dao;

    public MyService(){}

    public MyService(Dao dao){
        this.dao = dao;
    }
    public void insertService(){
        dao.insert();
    }

    public OracleDao getOracleDao() {
        return oracleDao;
    }

    public void setOracleDao(OracleDao oracleDao) {
        this.oracleDao = oracleDao;
    }
}
