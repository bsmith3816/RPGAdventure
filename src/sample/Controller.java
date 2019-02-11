package sample;


import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Controller {
    public Button melee;
    public Button magic;
    public Button defend;
    public Button useItem;
    public Button flee;
    public Label HP;
    public Label MP;
    public Label Attack;
    public Label Defense;

    @FXML
    private ImageView playerImage = new ImageView();

    public void initData()
    {
        Image img1 = new Image("thanos.png");
        playerImage.setImage(img1);
    }

    public void Melee(){

    }
    public void Magic(){

    }
    public void Defend(){

    }
    public void UseItem(){

    }
    public void Flee(){

    }
}
