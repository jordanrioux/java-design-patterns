package com.codewithjordy.patterns.creational.factorymethod.example2;

public class OrcBlacksmith implements Blacksmith {
    public Weapon createWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}
