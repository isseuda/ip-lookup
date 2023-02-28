/* Commonly used methods
   Below is a sample code using getByName() method: */

package com.company;

import java.net.InetAddress;
import java.net.UnknownHostException;

hostname = "placeholder"

public class GetIpAddress {
   public static void main(String[]args) throws UnknownHostException{
        InetAddress address = InetAddress.getAllByName(hostname);

        System.out.println("my local machine: " + address);
    }
}

// Output:

// my local machine: www.microsoft.com/2.21.100.214
