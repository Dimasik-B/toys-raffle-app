package com.github.dimasik_b;

import java.util.List;

public class View {

    public void showMainActions(){
        System.out.println("""
                1. Открыть каталог
                2. Начать розыгрырш
                3. Выйти""");
    }

    public void showCatalogActions(){
        System.out.println("""
                1. Добавить игрушку
                2. Показать каталог
                3. Удалить игрушку
                4. Изменить шанс выпадения игрушки
                5. Назад""");
    }

    public void showRaffleActions(){
        System.out.println("""
                1. Сыграть
                2. Назад""");
    }

    public void showEmptyCatalogAttention(){
        System.out.println("В каталоге нет игрушек, невозможно начать розыгрыш!");
    }

    public void showToyCreatorInfo(){
        System.out.println("Введите id, название и шанс выпадения игрушки,\nкаждый ввод подтвердите нашатем клавиши Enter");
    }

    public void showCatalog(List<?> list){
        for (Object obj : list){
            System.out.println(obj.toString());
        }
    }

    public void showDeleteToyInfo(){
        System.out.println("Введите id игрушки, которую хотите удалить");
    }

    public void showChangeDropChanceInfo(){
        System.out.println("Введите id игрушки и новый шанс выпадения,\nкаждый ввод подтвердите нашатем клавиши Enter");
    }

    public void showRuffleResult(String string){
        System.out.println("Поздравляем! Вы выиграли: " + string);
    }
}
