package sample;

import com.kuldiegor.recognize.DefaultHero;
import com.kuldiegor.recognize.HRecognize;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Controller {
    public void onActionScreenShot(){
        DefaultHero defaultHero = new DefaultHero("Images/",0);
        try {
            //Делаем скриншот
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            //Производим распознавание
            HRecognize hRecognize = new HRecognize(image,defaultHero);
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
    public void onActionSavetoFile(){
        DefaultHero defaultHero = new DefaultHero("Images/",0);
        defaultHero.SaveToFile("convolutions.txt");
    }
}
