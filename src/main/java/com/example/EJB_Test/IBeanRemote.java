package com.example.EJB_Test;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
public interface IBeanRemote {
    double solve(int n);
}
