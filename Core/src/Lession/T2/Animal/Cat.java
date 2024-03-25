package Lession.T2.Animal;

import Lession.T2.Obstacle.Obstacle;

public class Cat extends Animal{
    private final String name;
    private final long powerOfRun = 3500;
    private final long powerOfSwimm = 10;
    private final double powerOfJump = 1.5;

    public Cat(String name) {
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
