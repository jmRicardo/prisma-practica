package com.moby.prisma.jmr.prismapractica.models;

public enum DniType {

    DNI("DNI"),
    LE("LE"),
    LC("LC");

    private final String string;

    DniType(final String string)
    {
        this.string = string;
    }

    public String getType()
    {
        return string;
    }
}
