package com.zlfinfo.test;

import com.zlfinfo.util.Encryption;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2016/8/29.
 */
public class EncryptionTest {

    @Test
    public void testEncypt() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String str = Encryption.encrypt("admin");
        System.out.println(str);
    }
}
