
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class GrayScale {

    public static void main(String[] args) {

        BufferedImage img = null;
        File f = null;

        try {
            f = new File("/Users/erick/Desktop/foto.png");
            img = ImageIO.read(f);
        } catch(IOException e) {
            System.out.println(e.toString());
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for(int x = 0; x < width; x++) {
            for(int y = 0; y < height; y++) {

                int p = img.getRGB(x, y);

                int a = (p>>24) & 0xff;
                int r = (p>>16) & 0xff;
                int g = (p>>8) & 0xff;
                int b = (p) & 0xff;

                int avg = (r + g + b) / 3;

                p = (a << 24) | (avg << 16) | (avg << 8) | (avg);

                img.setRGB(x, y, p);

            }
        }

        try {
            f = new File("/Users/erick/Desktop/foto_bn.png");
            ImageIO.write(img, "png", f);
            System.out.println("Image saved!!!");
        } catch(IOException e) {
            System.out.println(e.toString());
        }

    }

}
