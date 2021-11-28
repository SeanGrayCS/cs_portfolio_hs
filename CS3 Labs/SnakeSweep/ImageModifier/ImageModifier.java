import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class ImageModifier {

	public static void main(String[] args) throws IOException {

		String dirStr = "images";
		
		File dir = new File(dirStr);
		
		for (File file : dir.listFiles()) {
			BufferedImage img = ImageIO.read(file);
			for (int i = img.getMinX(); i < img.getWidth(); i++) {
				if (i == img.getMinX() || i == img.getWidth() - img.getMinX() - 1) {
					for (int j = img.getMinY(); j < img.getHeight(); j++) {
						img.setRGB(i, j, 0xFF333333);
					}
				} else {
					img.setRGB(i, img.getMinY(), 0xFF333333);
					img.setRGB(i, img.getHeight() - img.getMinY() - 1, 0xFF333333);
				}
			}
			ImageIO.write(img, "png", file);
		}

	}

}