import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

import javax.imageio.ImageIO;

public class AlphaMask {
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Image File Name: ");
		String imgFileName = in.next();
		File imgFile = new File(imgFileName);
		
		System.out.print("\n\nMask File Name: ");
		String maskFileName = in.next();
		File maskFile = new File(maskFileName);
		
		BufferedImage img = ImageIO.read(imgFile);
		Raster raster = img.getData();
		
		int width = raster.getWidth();
		int height = raster.getHeight();
		int bands = raster.getNumBands();
		int[] imgPixels = new int[width*height*bands];
		int[][][] pixelMat = new int[width][height][bands];
		imgPixels = raster.getPixels(0, 0, width, height, imgPixels);
		
		BufferedImage mask = ImageIO.read(maskFile);
		Raster maskRaster = mask.getData();
		
		int maskWidth = maskRaster.getWidth();
		int maskHeight = maskRaster.getHeight();
		int maskBands = maskRaster.getNumBands();
		
		int[] maskPixels = new int[maskWidth*maskHeight*maskBands];
		int[][][] maskPixelMat = new int[maskWidth][maskHeight][maskBands];
		maskPixels = maskRaster.getPixels(0, 0, maskWidth, maskHeight, maskPixels);
		
		WritableRaster writeRaster = maskRaster.createCompatibleWritableRaster();
		
		int[] outputPixels = new int[width*height*4];
		
		for (int i = 0; i < maskPixels.length; i++) {
			int pos = i/maskBands;
			int row = pos/maskWidth;
			int col = pos%maskWidth;
			int rgba = i%maskBands;
			int j = i-((i+(maskBands-bands))/maskBands);
			
			if (j >= imgPixels.length) {
				break;
			}
			
			maskPixelMat[row][col][rgba] = maskPixels[i];

			if (rgba != 3) {
				pixelMat[row][col][rgba] = imgPixels[j];
				outputPixels[i] = imgPixels[j];
			} else {
				int rgbSum = maskPixelMat[row][col][0] + maskPixelMat[row][col][1] + maskPixelMat[row][col][2];
				if (rgbSum == 0) {
					pixelMat[row][col] = new int[] {0, 0, 0};
				}
				
				outputPixels[i-3] = imgPixels[j-2] = pixelMat[row][col][0];
				outputPixels[i-2] = imgPixels[j-1] = pixelMat[row][col][1];
				outputPixels[i-1] = imgPixels[j] = pixelMat[row][col][2];
				outputPixels[i] = 255;
			}
		}
		
		writeRaster.setPixels(0, 0, width, height, outputPixels);
		BufferedImage outputImg = new BufferedImage(mask.getColorModel(), writeRaster, false, null);
		
		System.out.print("\n\nOutput File Name: ");
		String outFileName = in.next();
		File outputImgFile = new File(outFileName);
		ImageIO.write(outputImg, "png", outputImgFile);
	}
}