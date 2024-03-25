package Lession.T2.Animal;

import Lession.T2.Obstacle.Obstacle;

public class Bird extends Animal{
    private final String name;
    private final long powerOfRun = 450;
    private final long powerOfSwimm = 5;
    private final double powerOfJump = 3.5;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public boolean run(Obstacle obstacle) {
        return powerOfRun + Randomize.longRate(powerOfRun) >= obstacle.getObstacleValueLong();
    }

    @Override
    public boolean swimm(Obstacle obstacle) {
        return powerOfSwimm + Randomize.longRate(powerOfSwimm) >= obstacle.getObstacleValueLong();
    }

    @Override
    public boolean jump(Obstacle obstacle) {
        return powerOfJump + Randomize.doubleRate(powerOfJump) >= obstacle.getObstacleValueHigh();
    }

    public String getName() {
        return name;
    }

    public long getPowerOfRun() {
        return powerOfRun;
    }

    public long getPowerOfSwimm() {
        return powerOfSwimm;
    }

    public double getPowerOfJump() {
        return powerOfJump;
    }
}
