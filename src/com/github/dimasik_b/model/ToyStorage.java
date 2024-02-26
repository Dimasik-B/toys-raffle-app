package com.github.dimasik_b.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStorage {

    int toysCount;

    List<Toy> storage;

    public ToyStorage() {
        this.toysCount = 0;
        this.storage = new ArrayList<>();
    }

    public void addToy(Toy toy){
        storage.add(toy);
        toysCount++;
    }

    public void deleteToy(String id){
        storage.remove(findToy(id));
        toysCount--;
    }

    public void changeToyDropChance(String id, String dropChance){
        findToy(id).setDropChance(dropChance);
    }

    private Toy getToy(int index){
        return storage.get(index);
    }

    private Toy findToy(String id){
        for (Toy toy : storage){
            if(toy.getId().equals(id)){
                return toy;
            }
        }
        return null;
    }

    public List<Toy> prepareRaffleToySet(int count){
        List<Toy> raffleToySet = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++){
            boolean flag = true;
            while (flag){
                int ratio = random.nextInt(101);
                int index = random.nextInt(storage.size());
                if(Integer.parseInt(storage.get(index).getDropChance()) >= ratio){
                    raffleToySet.add(getToy(index));
                    flag = false;
                }
            }
        }
        return raffleToySet;
    }

    public int getToysCount() {
        return toysCount;
    }

    public List<Toy> getStorage() {
        return storage;
    }

}
