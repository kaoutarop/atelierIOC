package org.elhachemykaoutar.dao;

import org.springframework.stereotype.Component;

@Component("data")
public class DataImpl implements IData{
    @Override
    public double gatData() {
        double data=10;
        System.out.println("Recuperation la base donnes");
        return data;
    }
}
