package Exams.viceCity.models.guns;

public class Pistol extends BaseGun {
    private static final int INITIAL_BULLETS_PER_BARREL = 10;
    private static final int INITIAL_TOTALBULLETS = 100;
    private static final int SHOOTS = 1;

    public Pistol(String name) {
        super(name, INITIAL_BULLETS_PER_BARREL, INITIAL_TOTALBULLETS);
    }


    @Override
    public int fire() {
        if (super.isBarrelEmpty()) {
            rechargeGun();
        }

        super.setBulletsPerBarrel(super.getBulletsPerBarrel()-SHOOTS);

        return SHOOTS;
    }

    @Override
    protected void rechargeGun() {
        super.setTotalBullets(this.getTotalBullets() - SHOOTS);
        super.setBulletsPerBarrel(SHOOTS);
    }
}
