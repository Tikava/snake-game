package com.game.snake;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class KeyContoller {

    @FXML
    private Pane root;
    private final Image headIMG = new Image("C:\\Users\\Toilybay\\IdeaProjects\\Snake\\src\\main\\resources\\com\\game\\snake\\snake-head.png");
    private final ImageView snakeHead = new ImageView(headIMG);

    public void initialize() {
        root.getChildren().add(snakeHead);
        snakeHead.setX(280);
        snakeHead.setY(280);
        root.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP:
                    break;
                case DOWN:
                    break;
                case RIGHT:
                    break;
                case LEFT:
                    break;
            }
        });
    }
}