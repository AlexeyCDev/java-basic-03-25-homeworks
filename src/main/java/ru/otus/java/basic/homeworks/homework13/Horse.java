package ru.otus.java.basic.homeworks.homework13;

public class Horse implements Transport {
    private int stamina;

    public Horse(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public boolean canMove(TerrainType terrain) {
        return terrain != TerrainType.SWAMP;
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        if (!canMove(terrain)) {
            System.out.print("Лошадь не может идти по " + terrain + ". ");
            return false;
        }

        int consumption = distance * 2;
        if (stamina >= consumption) {
            stamina -= consumption;
            System.out.printf("Лошадь прошла %d км по %s. Осталось сил: %d. ", distance, terrain, stamina);
            return true;
        }
        System.out.printf("Лошадь устала! Нужно сил: %d, осталось: %d. ", consumption, stamina);
        return false;
    }
}
