package com.company.encryption;
import com.company.delivery.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("choose encryption algorithm: \n 1.public key 2.hash alg.");
        int choice = s.nextInt();
        EncryptionAlgorithm a = EncryptionFactory.createEncryptionAlgorithm(choice);
        String e = a.encryptionText("dnfkjn");
    }
}
