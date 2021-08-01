import javax.swing.*;

public class MouseJigglerForm {
    private JCheckBox JiggleCheckBox;
    private JPanel panel1;
    private final MouseThread mouseThread;

    public MouseJigglerForm() {
        mouseThread = new MouseThread();

        JiggleCheckBox.addActionListener(event -> {
            if (JiggleCheckBox.isSelected()) {
                mouseThread.start();
            }
            else {
                mouseThread.stopThread();
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }
}
