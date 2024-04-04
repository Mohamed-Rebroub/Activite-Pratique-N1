package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version BD");
        double temp =Math.random()*100;
        return temp;
    }
}
