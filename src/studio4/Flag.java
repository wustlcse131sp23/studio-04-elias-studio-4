package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(.5, .5, .3, .2);
		StdDraw.setPenColor(231,178,198);
		StdDraw.filledCircle(.465,.5,.0465);
		StdDraw.filledCircle(.535,.5,.0465);
		double [] x = {.415,.585,.5};
		double [] y = {.5,.5,.35};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenRadius(.01);
		StdDraw.setPenColor(255,0,0);
		StdDraw.arc(.5,.5,.2,000,180);
		StdDraw.setPenColor(255,150,0);
		StdDraw.arc(.5,.5,.19,000,180);
		}
	}
