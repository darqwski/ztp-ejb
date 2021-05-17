package com.example.EJB_Test;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Random;

@Stateless
public class Bean implements IBeanRemote{
    @EJB
    IFunctMonitor monitor;
    @Override
    public double solve(int n) {
        double max = 1;
        double min = 0;
        double diff = max - min;
        Random r = new Random();
        int hitted = 0;
        int itterations = (int) Math.pow(10, (int)( (1/Math.sqrt(n))+1));
        for (int i = 0; i < itterations; i++)
        {
            double rvalX = r.nextDouble();
            double rvalY = r.nextDouble();
            if(monitor.f(rvalX,rvalY) <=1){
                hitted++;
            }
        }
        double ans = diff*diff * hitted / itterations;
        return ans;
    }
}
