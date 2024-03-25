package Lession.T2.Animal;

import Lession.T2.Obstacle.Obstacle;

public abstract class Animal {

    abstract boolean run(Obstacle obstacle);

    abstract boolean swimm(Obstacle obstacle);

    abstract boolean jump(Obstacle obstacle);
}
