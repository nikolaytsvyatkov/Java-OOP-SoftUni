package Exams.viceCity.models.players;

import Exams.viceCity.models.guns.Gun;
import Exams.viceCity.repositories.interfaces.Repository;
import Exams.viceCity.validators.Validator;

import static Exams.viceCity.common.ExceptionMessages.PLAYER_LIFE_POINTS_LESS_THAN_ZERO;
import static Exams.viceCity.common.ExceptionMessages.PLAYER_NULL_USERNAME;

public abstract class BasePlayer implements Player {
    private String name;
    private int lifePoints;
    private Repository<Gun> gunRepository;

    protected BasePlayer(String name, int lifePoints) {
        this.setName(name);
        this.setLifePoints(lifePoints);
    }

    protected void setName(String name) {
        Validator.checkName(name, PLAYER_NULL_USERNAME);
        this.name = name;
    }
    protected void setLifePoints(int points)   {
        Validator.checkIntegers(points, PLAYER_LIFE_POINTS_LESS_THAN_ZERO);
        this.lifePoints = points;
    }

    public void takeLifePoints(int lifePoints) {
        int pointsToSet = this.lifePoints - lifePoints;
        if (this.lifePoints-lifePoints<0){
            this.lifePoints = 0;
        }
        this.lifePoints-=lifePoints;

    }

}
