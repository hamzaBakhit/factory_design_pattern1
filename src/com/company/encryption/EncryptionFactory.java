package com.company.encryption;

public class EncryptionFactory {
    public static EncryptionAlgorithm createEncryptionAlgorithm(int  id){
        if (id ==1){
            return new publicKeyEncryption(0.3f,0.5f);
        }else if (id==2){
            return new HashEncryption(5f);
        }else {
            throw new IllegalArgumentException("enc. id");
        }
    }
}
