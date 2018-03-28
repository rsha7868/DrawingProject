package art.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Hashtable;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import art.controller.DrawingController;


public class ArtPanel extends JPanel
{
	private final int MINIMUM_EDGE = 5;
	private final int MANIMUM_EDGE = 20;
	private final int MINIMUM_Scale = 20;
	private final int MANIMUM_Scale = 100;
	
	private DrawingController app;
	
	private SpringLayout appLayout;
	private DrawingCanvas canvas;
	private JPanel buttonPanel;
	private JPanel slidePanel;
	private JSlider scaleSlider;
	private JSlider edgeSlider;
	private JButton triangleButton;
	private JButton rectangleButton;
	private JButton polygonButton;
	private JButton elliseButton;
	private JButton clearButton;
	private JButton saveButton;
	private JButton colorButton;
	
	private int currentEdgeCount;
	private int currentScale;
	
	public ArtPanel(DrawingController app)
	{
		
	}
}
