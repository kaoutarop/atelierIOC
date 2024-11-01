package org.elhachemykaoutar.presentation;

import org.elhachemykaoutar.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigPresentation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.elhachemykaoutar.dao","org.elhachemykaoutar.metier");
        IMetier metier = (IMetier) applicationContext.getBean(IMetier.class);
        System.out.println(metier.clacule());
    }
}
