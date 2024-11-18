package diviceController;

import GUI.FaceTesst;

public class AppRunner2 implements Runnable{
    static FaceTesst app = new FaceTesst();

    public AppRunner2() {
    }

    public void run() {
        app.setVisible(true);
    }

    public FaceTesst getApp() {
        return app;
    }
}
