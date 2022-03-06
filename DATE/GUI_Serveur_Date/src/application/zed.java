package application;

import java.rmi.*;
import java.util.Date;

public interface zed extends Remote {
  public double conversion(double mt) throws RemoteException;
  public Date getServerDate() throws RemoteException;
   
}
