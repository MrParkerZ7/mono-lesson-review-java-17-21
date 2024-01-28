package lesson.java17features;

import java.util.random.RandomGenerator;

public class I_RandomeGenrator {

    Integer nextInt() {
        RandomGenerator generator = RandomGenerator.getDefault();
        return generator.nextInt(100);
    }

    boolean of() {
        RandomGenerator generator = RandomGenerator.of("L32X64MixRandom");
        return generator.nextBoolean();
    }
}
