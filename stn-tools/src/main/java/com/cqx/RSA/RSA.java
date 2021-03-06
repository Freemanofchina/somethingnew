package com.cqx.RSA;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.Base64;

/**
 * Created by Shan on 2017/2/23.
 */
public class RSA {

    /**
     * 生成秘钥对
     * @return
     * @throws NoSuchAlgorithmException
     */
    public KeyPair keyGenerate() throws NoSuchAlgorithmException {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");   //设置使用的算法
        generator.initialize(2048, new SecureRandom()); //设置生成的长度

        KeyPair keyPair = generator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        System.out.println(publicKey.getFormat());
        System.out.println(privateKey.getFormat());
        System.out.println(publicKey.getEncoded());
        System.out.println(privateKey.getEncoded());
        System.out.println(new String(Base64.getEncoder().encode(publicKey.getEncoded())));
        System.out.println(new String(Base64.getEncoder().encode(privateKey.getEncoded())));
        return keyPair;
    }

    /**
     * 公钥加密
     * @param key
     * @param content
     * @return
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeyException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     */
    public byte[] encrypt(PublicKey key, String content) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        cipher.update(content.getBytes());
        byte[] bytes = cipher.doFinal();
        return bytes;
    }

    /**
     * 私钥解密
     * @param privateKey
     * @param bytes
     * @throws InvalidKeyException
     * @throws NoSuchPaddingException
     * @throws NoSuchAlgorithmException
     * @throws BadPaddingException
     * @throws IllegalBlockSizeException
     */
    public void decrypt(PrivateKey privateKey, byte[] bytes) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        cipher.update(bytes);
        System.out.print(new String(cipher.doFinal()));
    }


    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher = Cipher.getInstance("RSA");
//        cipher.init(Cipher.DECRYPT_MODE, new PrivateKey() {
//            @Override
//            public String getAlgorithm() {
//                return null;
//            }
//
//            @Override
//            public String getFormat() {
//                return null;
//            }
//
//            @Override
//            public byte[] getEncoded() {
//                return new byte[0];
//            }
//        });
//        cipher.update(bytes);
//        System.out.print(new String(cipher.doFinal()));
//        try {
//            KeyPair keyPair = rsa.keyGenerate();
//            byte[] bytes = rsa.encrypt(keyPair.getPublic(), "你妈妈咪");
//            rsa.decrypt(keyPair.getPrivate(), bytes);
//
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        } catch (BadPaddingException e) {
//            e.printStackTrace();
//        } catch (IllegalBlockSizeException e) {
//            e.printStackTrace();
//        } catch (NoSuchPaddingException e) {
//            e.printStackTrace();
//        } catch (InvalidKeyException e) {
//            e.printStackTrace();
//        }
    }
}
