package org.elhachemykaoutar.metier;

import org.elhachemykaoutar.dao.DataImpl;
import org.elhachemykaoutar.dao.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
@Autowired
@Qualifier("data")
private IData datacall;
    @Override
    public double clacule() {
         double data = datacall.gatData();
         double result=data*15.6;
         return result;

    }
    public void setDatacall(DataImpl datacall)
    {
        this.datacall=datacall;
    }
}
