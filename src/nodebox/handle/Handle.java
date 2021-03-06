package nodebox.handle;


import nodebox.client.Viewer;
import nodebox.graphics.GraphicsContext;
import nodebox.graphics.Point;
import nodebox.node.Node;

public interface Handle {

    public void setViewer(Viewer viewer);

    public Viewer getViewer();

    //public List<Parameter> getParameters();

    public Node getNode();

    public void update();

    public void draw(GraphicsContext ctx);

    public void setVisible(boolean visible);

    public boolean isVisible();

    //// Mouse events ////

    public void mouseClicked(Point pt);

    public void mousePressed(Point pt);

    public void mouseReleased(Point pt);

    public void mouseEntered(Point pt);

    public void mouseExited(Point pt);

    public void mouseDragged(Point pt);

    public void mouseMoved(Point pt);

    public void keyTyped(int keyCode, int modifiers);

    public void keyPressed(int keyCode, int modifiers);

    public void keyReleased(int keyCode, int modifiers);

}
