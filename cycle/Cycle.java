/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cycle;

import cycle.gui.MainForm;
import cycle.objects.logics.Project;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Cycle {
    
    private final List<Project> projects = new ArrayList<>();

    public List<Project> getProjects() {
        return projects;
    }
    
    public void addProject(Project project) {
        projects.add(project);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Factory factory = new Factory();
//        
//        Fert fert = new Fert("Red Etisso");
//        fert.addElement(Factory.N, 7.1);
//        fert.addElement(Factory.P, 4.2);
//        fert.addElement(Factory.K, 6.1);
//        
//        System.out.println(fert);
        
        
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
    }
    
}
