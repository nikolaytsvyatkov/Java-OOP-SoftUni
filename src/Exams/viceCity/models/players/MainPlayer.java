package Exams.viceCity.models.players;

import Exams.viceCity.models.guns.Gun;
import Exams.viceCity.repositories.interfaces.Repository;

public class MainPlayer extends BasePlayer {
    private final static int INITIAL_LIFE_POINTS = 100;
    private final static String INITIAL_NAME = "Tommy Vercetti";
    public MainPlayer() {
        super(INITIAL_NAME, INITIAL_LIFE_POINTS);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getLifePoints() {
        return 0;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public Repository<Gun> getGunRepository() {
        return null;
    }
}
