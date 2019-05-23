/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengirimanbarang;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author PLJC-PC
 */
public class md5 {
        public static String enkripsi(String value){
        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(value.getBytes());
            byte byteData[] = md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i=0; i < byteData.length; i++){
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        }
        catch (NoSuchAlgorithmException e){
            throw new RuntimeException(e);
        }
    }
}
