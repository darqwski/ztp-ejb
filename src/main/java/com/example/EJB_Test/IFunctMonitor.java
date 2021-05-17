package com.example.EJB_Test;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
public interface IFunctMonitor {
    public double f( double x, double y );
}
