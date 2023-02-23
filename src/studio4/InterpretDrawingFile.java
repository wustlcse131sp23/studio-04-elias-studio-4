package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapetype= in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double paramOne = in.nextDouble();
		double paramTwo = in.nextDouble();
		double paramThree = in.nextDouble();
		double paramFour = in.nextDouble();

		StdDraw.setPenColor(red,green,blue);
		if (shapetype.equals("rectangle"))
		{
			if (isFilled==true)
				StdDraw.filledRectangle(paramOne, paramTwo, paramThree, paramFour);
			else
				StdDraw.rectangle(paramOne,paramTwo,paramThree,paramFour);
		}
		if (shapetype.equals("ellipse"))
		{
			if (isFilled==true)
				StdDraw.filledEllipse(paramOne, paramTwo, paramThree, paramFour);
			else
				StdDraw.ellipse(paramOne,paramTwo,paramThree,paramFour);
		}
		else
		{
			double paramFive = in.nextDouble();
		double paramSix = in.nextDouble();
		double [] x = { paramOne,paramThree,paramFive};
		double [] y = { paramTwo,paramFour,paramSix};
		if (isFilled==true)
			StdDraw.filledPolygon(x, y);
		else
			StdDraw.polygon(x,y);
		}
	}
}
