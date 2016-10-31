package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController,DigitalController {

    AnalogControllerImpl anaCont=new AnalogControllerImpl();
    DigitalControllerImpl digiCont = new DigitalControllerImpl();
    @Override
    public void up() {
        digiCont.up();

    }
    @Override
    public void down() {
        digiCont.down();

    }
    @Override
    public void left() {
        digiCont.left();

    }
    @Override
    public void right() {
        digiCont.right();

    }
    @Override
    public void up(double percentage) {
        anaCont.up(percentage);

    }
    @Override
    public void down(double percentage) {
        anaCont.down(percentage);

    }
    @Override
    public void left(double percentage) {
        anaCont.left(percentage);

    }
    @Override
    public void right(double percentage) {
        anaCont.right(percentage);

    }
    @Override
        public Point getPosition() {
         Point pointAna = anaCont.getPosition();
         Point pointDigi = digiCont.getPosition();
             return new Point(
                     (int)pointAna.getX() + (int)pointDigi.getX(),
                     (int)pointAna.getY() + (int)pointDigi.getY());

        }


}
