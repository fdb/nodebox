package nodebox.client.parameter;

import nodebox.client.PlatformUtils;
import nodebox.client.Theme;
import nodebox.node.Parameter;
import nodebox.node.ParameterValueListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;

public class StringControl extends AbstractParameterControl implements ActionListener {

    private JTextField textField;

    public StringControl(Parameter parameter) {
        super(parameter);
        setLayout(new BorderLayout());
        textField = new JTextField();
        textField.putClientProperty("JComponent.sizeVariant", "small");
        textField.setFont(Theme.SMALL_BOLD_FONT);
        textField.addActionListener(this);
        add(textField, BorderLayout.CENTER);
        setValueForControl(parameter.getValue());
    }

    public void setValueForControl(Object v) {
        if (v == null) return;
        textField.setText(v.toString());
    }

    public void actionPerformed(ActionEvent e) {
        String newValue = textField.getText();
        if (!newValue.equals(parameter.asString())) {
            parameter.set(newValue);
        }
    }

}
