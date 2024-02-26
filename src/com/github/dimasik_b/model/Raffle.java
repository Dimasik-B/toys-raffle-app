package com.github.dimasik_b.model;

public class Raffle {
    ToyMachine toyMachine;
    ToyStorage toyStorage;
    LogWriter logWriter;

    public Raffle(ToyStorage toyStorage) {
        this.toyMachine = new ToyMachine();
        this.toyStorage = toyStorage;
        this.logWriter = new LogWriter();
    }

    private void prepareRaffle(){
        toyMachine.loadMachine(toyStorage.prepareRaffleToySet(10 - toyMachine.getToysCount()));
    }

    public String doRaffle(){
        if(toyMachine.getToysCount() == 0) prepareRaffle();
        Toy prizeToy = toyMachine.getToy();
        logWriter.writePrizeInFile(prizeToy);
        return prizeToy.toString();
    }
}
