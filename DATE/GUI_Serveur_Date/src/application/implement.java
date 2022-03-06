package application;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class implement extends UnicastRemoteObject implements zed {

	protected implement() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public double conversion(double mt) throws RemoteException {
		// TODO Auto-generated method stub
		return 11*mt;
	}

	public Date getServerDate() throws RemoteException {
		// TODO Auto-generated method stub
		return new Date();
	}

}