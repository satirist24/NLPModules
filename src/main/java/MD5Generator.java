import org.apache.commons.codec.digest.DigestUtils;

import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created on 15.03.15.
 */
public class MD5Generator {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String res = DigestUtils.md5Hex("123".getBytes());
        System.out.println(res);
    }
    
}
