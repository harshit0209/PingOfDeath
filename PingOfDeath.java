import java.io.*;
import java.net.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
public class PingOfDeath
{
public static void main(String args[])throws Exception
{
System.out.println("PingOfDeath Started...");
long s=System.currentTimeMillis();
System.out.println(s);
for(int i=0;i<Integer.parseInt(args[1]);i++) {
sendPingRequest(args[0]);}
System.out.println(System.currentTimeMillis()-s);

}


public static void sendPingRequest(String ipAddress)
              throws UnknownHostException, IOException
  {
    InetAddress geek = InetAddress.getByName(ipAddress);
    System.out.println("Sending Ping Request to " + ipAddress);
    if (geek.isReachable(5000))
      System.out.println("Host is reachable");
    else
      System.out.println("Sorry ! We can't reach to this host");
  }


}

