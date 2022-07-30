package com.company.encryption;

public interface EncryptionAlgorithm {
    public String encryptionText(String text);
    public String decryptionText(String text);
}
