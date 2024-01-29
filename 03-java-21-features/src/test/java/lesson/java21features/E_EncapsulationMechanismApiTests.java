package lesson.java21features;

import org.junit.jupiter.api.Test;

import javax.crypto.SecretKey;
import java.security.KeyPair;

import static org.junit.jupiter.api.Assertions.*;

// Assuming a suitable provider is configured for RSA-KEM
class E_EncapsulationMechanismApiTests {

    @Test
    void testKeyPairGeneration() throws Exception {
        KeyPair keyPair = E_EncapsulationMechanismApi.getKeyPair();
        assertNotNull(keyPair, "Generated key pair should not be null");
        assertNotNull(keyPair.getPublic(), "Public key should not be null");
        assertNotNull(keyPair.getPrivate(), "Private key should not be null");
    }

    @Test
    void testDecapsulator() throws Exception {
        byte[] encapsulation = E_EncapsulationMechanismApi.sampleEncapsulator().getEncoded();
        SecretKey secretKey = E_EncapsulationMechanismApi.sampleDecapsulator(encapsulation);
        assertNotNull(secretKey, "Decapsulated secret key should not be null");
    }

    @Test
    void testEncapsulator() throws Exception {
        SecretKey secretKey = E_EncapsulationMechanismApi.sampleEncapsulator();
        assertNotNull(secretKey, "Encapsulated secret key should not be null");
    }

    @Test
    void testDecapsulatorWithParameters() throws Exception {
        byte[] encapsulation = E_EncapsulationMechanismApi.sampleEncapsulator(0, 10, "AES").getEncoded(); // Example parameters
        SecretKey secretKey = E_EncapsulationMechanismApi.sampleDecapsulator(encapsulation, 0, 10, "AES");
        assertNotNull(secretKey, "Decapsulated secret key with parameters should not be null");
    }

    @Test
    void testEncapsulatorWithParameters() throws Exception {
        SecretKey secretKey = E_EncapsulationMechanismApi.sampleEncapsulator(0, 10, "AES");
        assertNotNull(secretKey, "Encapsulated secret key with parameters should not be null");
    }
}
