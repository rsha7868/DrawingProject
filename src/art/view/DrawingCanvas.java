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
		this.app = app;
		triangleList = new ArrayList<Polgon>();
		polygonList = new ArrayList<Polgon>();
		ellipseList = new ArrayList<Ellipse>();
		rectangleList = new ArrayList<Rectangle>();
		
		canvasImage = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
		this.setMinimumSize(new Dimension(600, 600));
		this.setPerferredSize(new Dimension(600, 600));
		this.setMaxinumSize(getPerferredSize());
	}
	
}
