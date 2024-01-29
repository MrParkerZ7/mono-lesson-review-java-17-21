package lesson.java21features;

import javax.crypto.KEM;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class E_EncapsulationMechanismApi {

    public static String algorithm = "RSA-KEM";

    public static KeyPair getKeyPair() throws Exception {
        KEM kem = KEM.getInstance(algorithm);

        KeyPairGenerator kpg = KeyPairGenerator.getInstance(algorithm);
        KeyPair keyPair = kpg.generateKeyPair();
        return keyPair;
    }

    public static KEM getKEM() throws Exception {
        return KEM.getInstance(algorithm);
    }

    public static KEM.Decapsulator getDecapsulator() throws Exception {
        return getKEM().newDecapsulator(getKeyPair().getPrivate());
    }

    public static KEM.Encapsulator getEncapsulator() throws Exception {
        return getKEM().newEncapsulator(getKeyPair().getPublic());
    }

    public static SecretKey sampleDecapsulator(byte[] encapsulation) throws Exception {
        return getDecapsulator().decapsulate(encapsulation);
    }

    public static SecretKey sampleDecapsulator(byte[] encapsulation, int from, int to, String algorithm) throws Exception {
        return getDecapsulator().decapsulate(encapsulation, from, to, algorithm);
    }

    public static SecretKey sampleEncapsulator() throws Exception {
        return getEncapsulator().encapsulate().key();
    }

    public static SecretKey sampleEncapsulator(int from, int to, String algorithm) throws Exception {
        return getEncapsulator().encapsulate(from, to, algorithm).key();
    }
}
