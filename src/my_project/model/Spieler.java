package my_project.model;

import KAGO_framework.control.Interactable;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;

import java.awt.event.MouseEvent;

public class Spieler implements Interactable {

    private boolean linkesFeld;
    private boolean mitteLinkesFeld;
    private boolean mitteRechtesFeld;
    private boolean rechtesFeld;

    private ProgramController pC;

    public Spieler(ProgramController pC){
        linkesFeld = false;
        mitteLinkesFeld = false;
        mitteRechtesFeld = false;
        rechtesFeld = false;
        this.pC = pC;
    }

    @Override
    public void keyPressed(int key) {

    }

    @Override
    public void keyReleased(int key) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX() >100 && e.getX()< 300 && e.getY()>600 && e.getY()<700){
            linkesFeld = true;

        }
        if(e.getX() >400 && e.getX()< 600 && e.getY()>600 && e.getY()<700){
            mitteLinkesFeld = true;
        }
        if(e.getX() >700 && e.getX()< 900 && e.getY()>600 && e.getY()<700){
            mitteRechtesFeld = true;
        }
        if(e.getX() >1000 && e.getX()< 1200 && e.getY()>600 && e.getY()<700){
            rechtesFeld = true;
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        linkesFeld = false;
        mitteLinkesFeld = false;
        mitteRechtesFeld = false;
        rechtesFeld = false;
    }

    public boolean isLinkesFeld() {
        return linkesFeld;
    }

    public boolean isMitteLinkesFeld() {
        return mitteLinkesFeld;
    }

    public boolean isMitteRechtesFeld() {
        return mitteRechtesFeld;
    }

    public boolean isRechtesFeld() {
        return rechtesFeld;
    }
}
