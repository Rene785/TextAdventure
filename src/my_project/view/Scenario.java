package my_project.view;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Scenario extends GraphicalObject {

    private String text;

    public Scenario(){

    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(0,0,255,255);
        drawTool.drawFilledRectangle(100,100,1100,300);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawRectangle(100,100,1100,300);

        drawTool.formatText("Arial",2,30);
        drawTool.drawText(300,200,text);
    }

    @Override
    public void update(double dt) {

    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }
}
