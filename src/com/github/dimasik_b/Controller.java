package com.github.dimasik_b;

import com.github.dimasik_b.model.Raffle;
import com.github.dimasik_b.model.Toy;
import com.github.dimasik_b.model.ToyStorage;

import java.util.Scanner;

public class Controller {
    Raffle raffle;
    ToyStorage toyStorage;
    View view;
    Scanner scanner;

    public Controller() {
        this.toyStorage = new ToyStorage();
        this.view = new View();
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        while (true){
            view.showMainActions();
            switch (scanner.nextInt()){
                case 1:
                    workWithCatalog();
                    break;
                case 2:
                    startRaffle();
                    break;
                case 3:
                    System.exit(0);
            }


        }
    }

    public void workWithCatalog(){
        while (true){
            view.showCatalogActions();
            switch (scanner.nextInt()){
                case 1:
                    view.showToyCreatorInfo();
                    toyStorage.addToy(new Toy(scanner.next(), scanner.next(), scanner.next()));
                    break;
                case 2:
                    view.showCatalog(toyStorage.getStorage());
                    break;
                case 3:
                    view.showDeleteToyInfo();
                    toyStorage.deleteToy(scanner.next());
                    break;
                case 4:
                    view.showChangeDropChanceInfo();
                    toyStorage.changeToyDropChance(scanner.next(), scanner.next());
                    break;
                case 5:
                    return;
            }
        }
    }

    public void startRaffle(){
        if(toyStorage.getToysCount() == 0){
            view.showEmptyCatalogAttention();
            workWithCatalog();
        }
        raffle = new Raffle(toyStorage);
        while (true){
            view.showRaffleActions();
            switch (scanner.nextInt()){
                case 1:
                    view.showRuffleResult(raffle.doRaffle());
                    break;
                case 2:
                    return;
            }
        }
    }

}
