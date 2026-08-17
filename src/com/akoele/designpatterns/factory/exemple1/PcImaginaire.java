package com.akoele.designpatterns.factory.exemple1;

public class PcImaginaire extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public PcImaginaire(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
