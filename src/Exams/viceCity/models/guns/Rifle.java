package Exams.viceCity.models.guns;

public class Rifle extends BaseGun {
    private static final int INITIAL_BULLETS_PER_BARREL = 50;
    private static final int INITIAL_TOTALBULLETS = 500;
    private static final int SHOOTS  = 5;

    public Rifle(String name) {
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
