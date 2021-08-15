package com.emrullahyz.dpatterns.facade;

public class EncryptorFacade {
    private AESEncryptor aesEncryptor = new AESEncryptor();
    private MD5Encryptor md5Encryptor = new MD5Encryptor();
    private SHAEncryptor shaEncryptor = new SHAEncryptor();

    public void encrypt(String text, EncType type){
        switch (type){
            case AES: aesEncryptor.encrypt(text); break;
            case MD5: md5Encryptor.encrypt(text, "KEY"); break;
            case SHA: shaEncryptor.encrypt(text, "KEY", true); break;
            default: throw new IllegalArgumentException(type.toString());
        }
    }
    public enum EncType{
        SHA,
        MD5,
        AES;
    }
}
