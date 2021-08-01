import java.awt.*;

public class MouseThread extends Thread {
    private boolean isRunning;

    public void stopThread() {
        isRunning = false;
    }

    public void run() {
        try {
            Robot r = new Robot();
            isRunning = true;
            while (isRunning) {
                Point p = MouseInfo.getPointerInfo().getLocation();
                r.mouseMove(p.x - 1, p.y - 1);
                Thread.sleep(500);
                r.mouseMove(p.x + 1, p.y + 1);
                Thread.sleep(500);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
