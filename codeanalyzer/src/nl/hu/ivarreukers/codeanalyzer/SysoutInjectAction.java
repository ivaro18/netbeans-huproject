/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hu.ivarreukers.codeanalyzer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "nl.hu.ivarreukers.codeanalyzer.SysoutInjectAction"
)
@ActionRegistration(
        displayName = "#CTL_SysoutInjectAction"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_SysoutInjectAction=Generate Sysout")
public final class SysoutInjectAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}