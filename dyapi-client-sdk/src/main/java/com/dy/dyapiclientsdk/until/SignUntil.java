package com.dy.dyapiclientsdk.until;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

public class SignUntil {
    public static String genSign(String body,String secretKey){
        Digester md5 = new Digester(DigestAlgorithm.MD5);
        String testStr =body+"."+secretKey;

        String digestHex = md5.digestHex(testStr);
        return digestHex;
    }
}
