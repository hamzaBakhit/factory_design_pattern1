package com.company.encryption;

public class publicKeyEncryption implements EncryptionAlgorithm {

    float encryptFactor;
    float compressionFactor;

    public publicKeyEncryption(float encryptFactor, float compressionFactor) {
        this.encryptFactor = encryptFactor;
        this.compressionFactor = compressionFactor;
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
