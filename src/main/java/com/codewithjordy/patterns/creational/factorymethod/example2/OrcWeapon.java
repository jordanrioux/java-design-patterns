package com.codewithjordy.patterns.creational.factorymethod.example2;

public class OrcWeapon implements Weapon {
    private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public void swing() {

    }
}
