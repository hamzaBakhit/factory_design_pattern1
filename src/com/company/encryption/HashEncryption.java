package com.company.encryption;

public class HashEncryption implements EncryptionAlgorithm{

    float toleranceFactory;
    float hashKey;

    public HashEncryption(float hashKey) {
        this.hashKey = hashKey;
    }

    @Override
    public String encryptionText(String text) {
        return "text encrypted by public key";
    }

    @Override
    public String decryptionText(String text) {
        return "text decrypted by public key algorithm";
    }

}
