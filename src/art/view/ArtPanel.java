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
		super();
		this.app = app;
		appLayout = newSpringLayout();
		
		currentScale = MINMUM_SCALE;
		currentEdgeCount = MINMUM_EDGE;
		scaleSlider = new JSlider(MINIMUM_SCALE, MAXINUM_SCALE);
		edgeSlider = new JSlider(MINIMUM_EDGE, MAXIMUM_EDGE);
		
		canvas = new drawingCanvas(app);
		sliderPanel = new JPanel();
		buttonPanel = new JPanel(new GridLayout(0,1));
		
		triangleButton = new JButton("add Triangle");
		rectangleButton = new JButton("add rectangle");
		ellipseButton = new JButton("add ellipse");
		polygonButton = new JButton("add polygon");
		clearButton = new JButton("clear image");
		saveButton = new JButton("save image");
		colorButton = new JButton("change color");
		
		setupSliders();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	private void setupSliders()
	{
		HashTable<Integer, JLable> scaleLabels = new HashTable<Integer, JLable>();
		HashTable<Integer, JLable> edgeLabels = new HashTable<Integer, JLable>();
		
		scaleLabels.put(MINIMUM_SCALE, new JLable("<HTML>Small<BR>Shape</HTML>"));
		ScaleLabels.put(MAXIMUM_SCALE + MINIMUM_SCALE)/ 2, new JLable("\"<HTML>Medium<BR>Shape</HTML>\""));
		scaleLabels.put(MINIMUM_SCALE, new JLable("<HTML>Large<BR>Shape</HTML>"));
		
		edgeLabels.put(MiNINUM_EDGE, new JLabel("Edges: " + MINIMUM_EDGE));
		edgeLabels.put(MAXINUM_EDGE, new JLabel("Edges: " + MAXIMUM_EDGE));
		
		ScaleSLider.setLabelTable(scaleLable);
		ScaleSLider.setOrientation(JSlider.VERTICAL);
		ScaleSLider.setSnapTTicks(true);
		ScaleSLider.setMajarTickSpacing(3);
		ScaleSLider.setMinorTickSpacing(1);
		ScaleSLider.setPaintTicks(true);
		ScaleSLider.setPaintLabels(true);
	}
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(Color.DARK_GREY);
		this.setPerferredSize(new Dimension(1020, 768));
		this.add(canvas);
		
		buttonPanel.setPreferredSize(new Dimension(200, 450));
		buttonPanel.add(triangleButton);
		buttonPanel.add(rectangleButton);
		buttonPanel.add(ellipseButton);
		buttonPanel.add(polygonButton);
		buttonPanel.add(clearButton);
		buttonPanel.add(colorButton);
		buttonPanel.add(saveButton);
		
		sliderPanel.setPreferredSize(new Dimension(250, 450));
		sliderPanel.add(scaleSlider);
		sliderPanel.add(edgeSlider);
		
		this.add(buttonPanel);
		this.add(sliderPanel);
	}
}
