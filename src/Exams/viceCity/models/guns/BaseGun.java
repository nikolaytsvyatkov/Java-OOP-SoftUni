package Exams.viceCity.models.guns;

import Exams.viceCity.validators.Validator;

import static Exams.viceCity.common.ExceptionMessages.*;

public abstract class BaseGun implements Gun {
    private String name;
    private int bulletsPerBarrel;
    private int totalBullets;

    protected BaseGun(String name, int bulletsPerBarrel, int totalBullets) {
        this.name = name;
        this.bulletsPerBarrel = bulletsPerBarrel;
        this.totalBullets = totalBullets;
    }

    protected void setName(String name) {
        Validator.checkName(name, NAME_NULL);
        this.name = name;
    }
    protected void setBulletsPerBarrel(int bullets) {
        Validator.checkIntegers(bullets, BULLETS_LESS_THAN_ZERO);
        this.bulletsPerBarrel = bullets;
    }
    protected void setTotalBullets(int bullets) {
        Validator.checkIntegers(bullets, TOTAL_BULLETS_LESS_THAN_ZERO);
    }
    public String getName() {
        return this.name;
    }

    public int  getBulletsPerBarrel() {
        return this.bulletsPerBarrel;
    }

    public boolean canFire() {
        if (this.totalBullets > 0) {
            return true;
        }
        return false;
    }

   public int getTotalBullets() {
        return this.totalBullets;
    }

    public abstract int fire();
    protected abstract void rechargeGun();
    protected boolean isBarrelEmpty() {
        return this.bulletsPerBarrel == 0;
    }
}
