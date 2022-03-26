package mathServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathServer extends UnicastRemoteObject implements MathServerInterface
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2818842844782357528L;

	protected MathServer() throws RemoteException
	{
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int addNumbers(int a, int b) throws RemoteException
	{
		System.out.println("Answering Question...");
		return a + b;
	}

	public static void main(String[] args)
	{

		try
		{
			MathServer m = new MathServer();
			Naming.rebind("MATHS", m);
		} catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
