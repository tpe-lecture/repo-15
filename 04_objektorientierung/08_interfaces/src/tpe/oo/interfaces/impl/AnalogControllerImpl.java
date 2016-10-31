package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

    private Point position = new Point(0, 0);
    double x;
    double y;

    /**
     *
     */
    @Override
    public void up(double percantage) {
    y=y-percantage;
    }

    /**
     *
     */
    @Override
    public void down(double percantage) {
        y=y+percantage;
    }

    /**
     *
     */
    @Override
    public void left(double percantage) {
        x = x-percantage;
    }

    /**
     *
     */
    @Override
    public void right(double percantage) {
        x=x+percantage;
    }

    /**
     *
     */
    @Override
    public Point getPosition() {
        position.setLocation((int)x,(int) y);
        return (Point) position.clone();
    }
}
