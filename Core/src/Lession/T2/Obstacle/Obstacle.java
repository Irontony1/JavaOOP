package Lession.T2.Obstacle;

public class Obstacle {
    private final double obstacleValueHigh;
    private final long obstacleValueLong;

    public Obstacle(long obstacleValueLong, double obstacleValueHigh) {
        this.obstacleValueLong = obstacleValueLong;
        this.obstacleValueHigh = obstacleValueHigh;
    }

    public double getObstacleValueHigh() {
        return obstacleValueHigh;
    }

    public long getObstacleValueLong() {
        return obstacleValueLong;
    }
}
