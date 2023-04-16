module com.game.snake {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game.snake to javafx.fxml;
    exports com.game.snake;
}