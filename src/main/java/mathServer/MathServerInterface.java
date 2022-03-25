package mathServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MathServerInterface extends Remote
{
	// returns the sum of two numbers
	public int addNumbers(int a, int b) throws RemoteException;

}
