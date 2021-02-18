package com.codewithjordy.patterns.creational.factorymethod.example2;

public class ElfWeapon implements Weapon {
    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void swing() {

    }
}
