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
	private final int MAXIMUM_EDGE = 20;
	private final int MINIMUM_SCALE = 20;
	private final int MAXIMUM_SCALE = 100;
	
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
		appLayout = new SpringLayout();
		
		currentScale = MINIMUM_SCALE;
		currentEdgeCount = MINIMUM_EDGE;
		scaleSlider = new JSlider(MINIMUM_SCALE, MAXINUM_SCALE);
		
		canvas = new DrawingCanvas(app);
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
		scaleLabels.put(MAXIMUM_SCALE + MINIMUM_SCALE)/ 2, new JLabel("\"<HTML>Medium<BR>Shape</HTML>\""));
		scaleLabels.put(MINIMUM_SCALE, new JLable("<HTML>Large<BR>Shape</HTML>"));
		
		edgeLabels.put(MiNINUM_EDGE, new JLabel("Edges: " + MINIMUM_EDGE));
		edgeLabels.put(MAXINUM_EDGE, new JLabel("Edges: " + MAXIMUM_EDGE));
		
		scaleSLider.setLabelTable(scaleLable);
		scaleSLider.setOrientation(JSlider.VERTICAL);
		scaleSLider.setSnapTTicks(true);
		scaleSLider.setMajarTickSpacing(3);
		scaleSLider.setMinorTickSpacing(1);
		scaleSLider.setPaintTicks(true);
		scaleSLider.setPaintLabels(true);
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
	private boolean coinFlip()
	{
		return (int) (Math.random() * 2) == 0;
	}
	private Polygon createPolygon(int sides)
	{
		Polygon currentShape = new Polygon();
		
		int originX = (int) (math.random() * 600);
		int originY = (int) (math.random() * 600);
		
		for(int index = 0; index < sides; index++)
		{
			int minus = coinFlip() ? -1 : 1;
			int shiftX = (int) (math.random() * currentScale) * minus;
			minus = coinFlip() ? -1 : 1;
			int shift = (int) (Math.random() * currentScale) * minus;
			currentShape.addPoint(orginX + shiftX, orginX + shiftY)0;
		}
		return currentShape;
		
	}
	private Rectangle createRectangle()
	{
		Rectangle currentRectangle;
		
		int cornerX = (int) (Math.random() * 600);
		int cornerY = (int) (Math.Random() * 600);
		int width = (int)(Math.random() * currentScale) + 1;
		if(coinFlip())
		{
			currentRectangle = new Rectangle(cornerX, cornerY, width, height);
		}
		else
		{
			int height  = (int)(Math.random() * currentScale) + 1;
			currentRectangle = new Rectangle(cornerX, CornerY, width,height);
		}
		return Current Rectangle;
	}
	private Ellipse2D createEllipse2D()
	{
	Ellipse2D ellipse = new Ellipse2D.Double();
	
	int cornerX = (int) (Math.random() * 600);
	int cornerY = (int) (Math.Random() * 600);
	double width = (int)(Math.random() * currentScale) + 1;
	if(coinFlip())
	{
		ellipse.setFrame(cornerX, cornerY, width, height);
	}
	else
	{
		double height  = (int)(Math.random() * currentScale) + 1;
		ellipse.setFrame(cornerX, CornerY, width,height);
	}
	return ellipse;
	}
	private void setupListeners()
	{
		retangleButton.addActionListener(new ActionListener()
				{
					public void actionPreformed(ActionEvent click)
					{
						Rectangle rectangle = creatingRectangle();
						canvas.addShape(rectangle);
					}	
				});
			triangleButton.addActionListener(new ActionListener()
					{
						public void actionPreformed(ActionEvent click)
						{
							Polygon triangle = creatingPolyon(3);
							canvas.addShape(polygon);
						}	
					});
			polygonButton.addActionListener(new ActionListener()
			{
				public void actionPreformed(ActionEvent click)
				{
					Polygon triangle = creatingPolyon(currentEdgeCount);
					canvas.addShape(polygon);
				}	
			});
			retangleButton.addActionListener(new ActionListener()
			{
				public void actionPreformed(ActionEvent click)
				{
					Rectangle rectangle = creatingRectangle();
					canvas.addShape(rectangle);
				}	
			});
			retangleButton.addActionListener(new ActionListener()
			{
				public void actionPreformed(ActionEvent click)
				{
					Rectangle rectangle = creatingRectangle();
					canvas.addShape(rectangle);
				}	
			});

			clearButton.addActionListener(click -> canvas.clear());
			
			saveButton.addActionListener(click -> canvas.save());
			
			colorButton.addActionListener(click -> canvas.changeBackground());
			
			scaleSlider.addChangeListener(new ChangeListener()
					{
						@orverride
						public void stateChanged(ChangeEvent e)
						{
							if(!scaleSlider.getValueIsAdjusting())
							{
								currentScale = scaleSlider.getValue();
							}
						}
					});
			edgeSlider.addChangeListener(new ChangeListener()
			
			{
				@override
				public void stateChanged(changeEvent e)
				{
					if(!edgeSlider.getValueIsAdjusting())
					{
						currentEdgeCount = edgeSlider.getValue();
					}
				}
				
			});
			
	}
	
	
	
}
	
