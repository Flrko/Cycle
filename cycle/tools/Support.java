/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle.tools;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author user
 */
public class Support {
    
    public static void centerWindow(Component component) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();

        Dimension dlgSize = component.getSize();

        component.setLocation((screenSize.width - dlgSize.width) / 2,
                (screenSize.height - dlgSize.height) / 2);
    }
    
}
