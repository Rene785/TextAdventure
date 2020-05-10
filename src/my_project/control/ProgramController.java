package my_project.control;

import KAGO_framework.control.ViewController;

import java.awt.event.MouseEvent;

import KAGO_framework.model.abitur.datenstrukturen.BinaryTree;
import my_project.view.Antwortmoeglichkeit;
import my_project.view.Scenario;
import my_project.model.Spieler;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.
    private Antwortmoeglichkeit aM;
    private Scenario scenarioView;
    private Spieler spieler;
    private BinaryTree<String> scenario;

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param ViewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController ViewController){
        this.viewController = ViewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen. Achtung: funktioniert nicht im Szenario-Modus
     */
    public void startProgram() {
        aM = new Antwortmoeglichkeit();
        viewController.draw(aM);

        scenarioView = new Scenario();
        viewController.draw(scenarioView);
        scenarioView.setText("Du bist wach geworden möchtest du noch liegen bleiben?");

        spieler = new Spieler(this);
        viewController.register(spieler);
        //scenario = new BinaryTree<>(fillTree());
    }

    /**
     * Sorgt dafür, dass zunächst gewartet wird, damit der SoundController die
     * Initialisierung abschließen kann. Die Wartezeit ist fest und damit nicht ganz sauber
     * implementiert, aber dafür funktioniert das Programm auch bei falscher Java-Version
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){
        if(spieler.isLinkesFeld()){
            scenario.getLeftTree();
            scenarioView.setText(scenario.getLeftTree().getContent());
        }
        if(spieler.isMitteLinkesFeld()){
            scenario.getRightTree();
            scenarioView.setText(scenario.getRightTree().getContent());
        }
    }

    public void mouseClicked(MouseEvent e){}

    public void fillTree(){
        BinaryTree<String> b1 = new BinaryTree<>("Du hast einen wirklich tollen Tag in der Schule und du kommst mega gut gelaunt nach Hause");
        BinaryTree<String> b2 = new BinaryTree<>("Du isst stattdessen noch mehr und hast am Ende des Tages durchfall.");

        BinaryTree<String> b3 = new BinaryTree<>("Die Leute reagieren zwar komisch wenn du an ihnen vorbei gehst aber das ist dir ziemlich egal.");
        BinaryTree<String> b4 = new BinaryTree<>("Du zockst weiter und siehst das deine Freunde genau das gleiche machen. Dann zockt ihr den ganzen Tag zusammen und habt einen schönen Tag bis deine Mutter mit einem Verweis von der Schule nach Hause kommt.");

        BinaryTree<String> b5 = new BinaryTree<>("Die Lehrerin hat dich zwar angeschrien, weil du zu spät warst aber trotzdem war dein Crush von dir angetan.");
        BinaryTree<String> b6 = new BinaryTree<>("Stattdessen gehst du in die Stadt und triffst dich mit Freunden aber ihr werdet von einem Lehrer erwischt und fliegt von der Schule.");

        BinaryTree<String> b7 = new BinaryTree<>("Alle gucken dich komisch an weil du zu spät bist und gehen dir aus dem Weg weil du so komisch riechst. Das macht dir zu schaffen und du bist für den Rest des Tages traurig.");
        BinaryTree<String> b8 = new BinaryTree<>("Du warst schon die letzten 6 Monate nicht mehr in der Schule. Deswegen hast du ein Verweis bekommen und wegen deiner Pflege wurdest du von deinen Eltern aus dem Haus geschmissen.");


        BinaryTree<String> b9 = new BinaryTree<>("Du fühlst dich wunderbar und hast sogar noch Zeit zum Frühstücken gehabt trotzdem fängt so langsam die Schule an. Möchtest du hin?",b2,b1);
        BinaryTree<String> b10 = new BinaryTree<>("Du stinkst zwar aber du nutzt deine Zeit sinnvoll und zockst noch ein paar Runden aber so langsam fängt die Schule an. Willst du hin?",b4,b3);

        BinaryTree<String> b11 = new BinaryTree<>("Du fühlst dich frisch und bist total motiviert trotzdem steht die Zeit nicht still denn die Schule hat bereits angefangen. Möchtest du trotzdem noch zur Schule gehen?",b6,b5);
        BinaryTree<String> b12 = new BinaryTree<>("Du stinkst nach den Fritten die du am Gestern gemacht hast und du bist spät dran. Willst du zur Schule?",b8,b7);


        BinaryTree<String> b14 = new BinaryTree<>("Du hast noch eine Menge Zeit. Möchtest du dich fertig machen?",b10,b9);
        BinaryTree<String> b13= new BinaryTree<>("Da du liegen geblieben bist hast du nur noch wenig Zeit. Möchtest du dich noch fertig machen?",b12,b11);


        BinaryTree<String> b15 = new BinaryTree<>("Du bist wach geworden möchtest du direkt aufstehen?",b14,b13);

    }

}
