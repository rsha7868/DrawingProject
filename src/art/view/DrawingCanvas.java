package art.view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JPanel;

import art.controller.DrawingController;


public class DrawingCanvas
{
	private ArrayList<Polygon> TriangleList;
	private ArrayList<Polygon> polgonList;
	private ArrayList<Ellipse> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	private DrawingController app;
	
	private BufferedImage canvasImage;
	
	public DrawingCanvas(DrawingController app)
	{
		super();
		
	}
	
}
