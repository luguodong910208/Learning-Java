package chapter11.chapter11_8;

import javax.imageio.ImageIO;

public class ImageIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] readFormat = ImageIO.getReaderFormatNames();
		System.out.println("-----Image�ܶ�������ͼ���ļ���ʽ-----");
		for(String tmp : readFormat) {
			System.out.println(tmp);
		}
		String[] writeFormat = ImageIO.getWriterFormatNames();
		System.out.println("-----Image��д������ͼ���ļ���ʽ-----");
		for(String tmp : writeFormat) {
			System.out.println(tmp);
		}
	}

}
