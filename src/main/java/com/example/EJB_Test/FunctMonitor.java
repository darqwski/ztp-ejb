package com.example.EJB_Test;

import javax.ejb.Stateless;

@Stateless
public class FunctMonitor implements IFunctMonitor{
    @Override
    public double f(double x, double y) {
        return x*x+y*y;
    }
}
