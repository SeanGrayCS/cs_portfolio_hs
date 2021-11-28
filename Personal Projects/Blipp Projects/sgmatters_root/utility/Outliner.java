import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

import javax.imageio.ImageIO;

public class Outliner {
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Image File Name: ");
		String imgFileName = in.next();
		File imgFile = new File(imgFileName);
		
		BufferedImage img = ImageIO.read(imgFile);
		Raster raster = img.getData();
		WritableRaster writeRaster = raster.createCompatibleWritableRaster();
		
		int width = raster.getWidth();
		int height = raster.getHeight();
		
		int[] imgPixels = new int[width*height*4];
		int[][][] pixelMat = new int[width][height][4];
		imgPixels = raster.getPixels(0, 0, width, height, imgPixels);
		
		int[][][] newPixelMat = new int[width][height][4];
		for (int i = 0; i < imgPixels.length; i++) {
			int pos = i/4;
			int row = pos/width;
			int col = pos%width;
			int rgba = i%4;
			
			pixelMat[row][col][rgba] = imgPixels[i];
			if (newPixelMat[row][col][rgba] != 255) {
				newPixelMat[row][col][rgba] = imgPixels[i];
			}
			
			if (rgba == 3) {
				int rgbSum = pixelMat[row][col][0] + pixelMat[row][col][1] + pixelMat[row][col][2];
				if (rgbSum != 0) {
					int c = col-1;
					for (int rep = 0; rep < 2; rep++) {
						for (int r = row-1; r < pixelMat.length; r++) {
							if (r > row+1) {
								r = row-1;
								c++;
							}
							if (c >= col+2) {
								break;
							}
							if (r <= -1 || c <= -1 || r >= pixelMat.length || c >= pixelMat[0].length) {
								continue;
							}
							
							// Right and top only on the second iteration
							if (rep == 1) {
								if (r > row || c < col) {
									continue;
								}
							}
							
							newPixelMat[r][c] = new int[] {255, 255, 255, 255};
						}
					}
				}
			}
		}
		
		int pos = 0;
		for (int i = 0; i < pixelMat.length; i++) {
			for (int j = 0; j < pixelMat[0].length; j++) {
				for (int k = 0; k < pixelMat[0][0].length; k++) {
					imgPixels[pos] = newPixelMat[i][j][k];
					pos++;
				}
			}
		}
		
		writeRaster.setPixels(0, 0, width, height, imgPixels);
		BufferedImage outputImg = new BufferedImage(img.getColorModel(), writeRaster, false, null);
		
		System.out.print("\n\nOutput File Name: ");
		String outFileName = in.next();
		File outputImgFile = new File(outFileName);
		ImageIO.write(outputImg, "png", outputImgFile);
	}
	
	/*
	public static int[][][] outlinePixel(int row, int col, int[][][] pixelMat) {
		int[][][] newPixelMat = new int[pixelMat.length][pixelMat[0].length][pixelMat[0][0].length];
		int c = col-1; System.out.println("new");
		for (int r = row-1; r < pixelMat.length; r++) {
			if (r > row+1) {
				r = row-1;
				c++;
			}
			if (c >= col+2) {
				break;
			}
			if (r <= -1 || c <= -1 || r >= pixelMat.length || c >= pixelMat[0].length) {
				continue;
			}
			
			// Right and top only
			
			if (r > row || c < col) {
				continue;
			}
			
			
			// Bottom only
			
			if (r < row+1) {
				continue;
			}
			
			
			newPixelMat[r][c] = new int[] {255, 255, 255, 255}; System.out.println("row: " + r + ", col: " + c);
		}
		return newPixelMat;
	}
	*/
	
}