package Enums;

import java.util.Arrays;

public enum Faculty {
    Computer_Science,
    Economic,
    Biology,
    Chemistry,
    Ecology,
    Foreign_Languages,
    Geology,
    History,
    IER_TB,
    Law,
    Mathematics_Computer_Sciences,
    Medicine,
    Philology,
    Philosophy,
    Physics,
    Physics_Energy,
    Physics_Technology,
    Psychology,
    Radiophysics,
    Sociology,
    KBS;

    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
    }
}
