package com.codewithjordy.patterns.creational.abstractfactory.example1;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
