package mathServer;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MathClient
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			MathServerInterface ms = (MathServerInterface) 
					Naming.lookup("rmi://127.0.0.1/MATHS");
			
			int answer = ms.addNumbers(5, 6);
			System.out.println("Answer is " + answer);
			
		} catch (MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
