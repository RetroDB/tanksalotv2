package org.academiadecodigo.vimdiesels.handgame;

import java.net.Socket;

public class Player implements Runnable {

    private String name;
    private Socket serverSocket;

    public Player(Socket serverSocket){
        this.name = name;
        this.serverSocket = serverSocket;
    }

    public Game.GameHand chooseHand(){
        return Game.GameHand.LIZARD; //need implementation!
    }

    @Override
    public void run() {

    }
}
