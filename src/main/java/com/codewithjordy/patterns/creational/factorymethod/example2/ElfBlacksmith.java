package com.codewithjordy.patterns.creational.factorymethod.example2;

public class ElfBlacksmith implements Blacksmith {
    public Weapon createWeapon(WeaponType weaponType) {
        return new ElfWeapon(weaponType);
    }
}
