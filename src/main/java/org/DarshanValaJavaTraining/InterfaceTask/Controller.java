package org.DarshanValaJavaTraining.InterfaceTask;

public class Controller {

    private VideoGame videoGame;
    public Controller(VideoGame videoGame){
        this.videoGame = videoGame;
    }
    public  Controller(){

    }

    public  void setVideoGame(VideoGame game){
        this.videoGame = game;
    }

    public  void startGame(){
        videoGame.play();
    }

    public static void main(String[] args) {

        VideoGame g1 = new PacMan();
        Controller control = new Controller(g1);
        control.startGame();

        VideoGame g2 = new Mario();
        control.setVideoGame(g2);
        control.startGame();

    }
}
