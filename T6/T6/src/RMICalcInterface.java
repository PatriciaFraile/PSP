import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMICalcInterface extends Remote {
    public int suma(int a, int b) throws RemoteException;

}
