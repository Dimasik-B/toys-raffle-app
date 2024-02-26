package com.github.dimasik_b.model;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ToyMachine {

    int toysCount;

    Queue<Toy> toyMachineStorage;

    public ToyMachine() {
        this.toysCount = 0;
        this.toyMachineStorage = new PriorityQueue<>();
    }

    public void loadMachine(List<Toy> toys){
        toyMachineStorage.addAll(toys);
        toysCount = toyMachineStorage.size();
    }

    public Toy getToy(){
        toysCount--;
        return toyMachineStorage.poll();
    }

    public int getToysCount() {
        return toysCount;
    }
}
