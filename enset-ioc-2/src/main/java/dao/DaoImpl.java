package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {
    @Autowired
    private IDao dao;
    @Override
    public double getData() {
        System.out.println("version base de donnees");

        double temp=Math.random()*40;
        return temp;
    }
}
