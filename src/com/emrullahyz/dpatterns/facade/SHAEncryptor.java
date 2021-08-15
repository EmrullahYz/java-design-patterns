package com.emrullahyz.dpatterns.facade;

class SHAEncryptor {

    public void encrypt(String text, String key, boolean tip){
        if (tip)
            System.out.println("<SHA>" + key + text+"</SHA>");
        else
            System.out.println("<SHA>" + text + key + "</SHA>");
    }
}
