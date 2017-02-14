package com.prem.s;

import java.security.*;
import java.util.Scanner;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.*;

public class AESencrp {
    
     private static final String ALGO = "AES";
    private static final byte[] keyValue = 
        new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't',
'S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };

public static String encrypt(String Data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);
        return encryptedValue;
    }
private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGO);
        return key;
}
    public static void main(String args[]) throws Exception{
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Input 1:");
    	String s1=scanner.next();
    	System.out.println("\nInput 2:");
    	String s2=scanner.next();
    	String a =encrypt(s1.concat(s2));
    	System.out.println(a);
    	
    }
}
