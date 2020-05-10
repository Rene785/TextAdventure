package my_project.view;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Antwortmoeglichkeit extends GraphicalObject {

    private String text1;
    private String text2;
    private String text3;
    private String text4;

    public Antwortmoeglichkeit(){

    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(255,0,0,255);
        drawTool.drawFilledRectangle(100,600,200,100);
        drawTool.drawFilledRectangle(400,600,200,100);
        drawTool.drawFilledRectangle(700,600,200,100);
        drawTool.drawFilledRectangle(1000,600,200,100);

        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(100,600,200,100);
        drawTool.drawRectangle(400,600,200,100);
        drawTool.drawRectangle(700,600,200,100);
        drawTool.drawRectangle(1000,600,200,100);

        drawTool.formatText("Arial",2,15);
        drawTool.drawText(150,650,"Nein");
        drawTool.drawText(450,650,"Ja");
     //   drawTool.drawText(750,650,text3);
       // drawTool.drawText(1050,650,text4);
    }

    @Override
    public void update(double dt) {

    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }

    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }
}
