package com.codewithjordy.patterns.creational.abstractfactory.example1;

public class FactoryMaker {
    public enum KingdomType {
        ELF, ORC
    }

    public static KingdomFactory makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                // TODO: Complete the Orc factory
                //return new OrcKingdomFactory();
            default:
                throw new UnsupportedOperationException("Unsupported kingdom type for: " + type);
        }
    }
}