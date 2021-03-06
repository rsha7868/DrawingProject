package art.view;
import javax.swing.JFrame;
import art.controller.ShapeController;
public class ArtFrame extends JFrame
{
	private ArtPanel appPanel;
	public ArtFrame(ShapeController app)
	{
	super();
	appPanel = new ArtPanel(app);
	
	setupFrame();
	}
	private void setupFrame()
	{
		this.setSize(1200, 700);
		this.setContentPane(appPanel);
		this.setTitle("Creating modern art in java");
		this.setVisible(true);
	}

}
