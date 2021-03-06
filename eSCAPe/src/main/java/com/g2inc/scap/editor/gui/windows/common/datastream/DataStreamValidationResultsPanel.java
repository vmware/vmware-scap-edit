package com.g2inc.scap.editor.gui.windows.common.datastream;
/* ESCAPE Software Copyright 2010 G2, Inc. - All rights reserved.
 *
 * ESCAPE is open source software distributed under GNU General Public License Version 3.  ESCAPE is not in the public domain 
 * and G2, Inc. holds its copyright.  Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:

 * 1. Redistributions of ESCAPE source code must retain the above copyright notice, this list of conditions and the following disclaimer. 
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the ESCAPE Software distribution. 
 * 3. Neither the name of G2, Inc. nor the names of any contributors may be used to endorse or promote products derived from this software without specific prior written permission. 

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL G2, INC., THE AUTHORS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY,
 * OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.

 * You should have received a copy of the GNU General Public License Version 3 along with this program. 
 * If not, see http://www.gnu.org/licenses/ for a copy.
 */

//import gov.nist.scap.validation.core.ValidationInfo;
//import gov.nist.scap.validation.core.ValidationMessage;
import com.g2inc.scap.editor.gui.windows.common.bundle.*;
import java.io.File;
import java.net.URL;

import org.apache.log4j.Logger;

import com.g2inc.scap.editor.gui.dialogs.editors.IDisplayPage;
import com.g2inc.scap.editor.gui.resources.HTMLEditorScrubber;
import com.g2inc.scap.library.domain.SCAPValidationResult;

/**
 * This panel is very seldom used. It is only called if a browser window cannot
 * be launched to display the validation results. Launching the default browser
 * does not work on some Unix systems, so this is provided for Unix. On Windows
 * this panel is never shown.
 *
 * @author glenn.strickland
 *
 */
public class DataStreamValidationResultsPanel extends javax.swing.JPanel implements IDisplayPage {

    private static final long serialVersionUID = 1L;
    private static Logger log = Logger.getLogger(DataStreamValidationResultsPanel.class);
    public static final String WINDOW_TITLE = "Validation Results";

    public DataStreamValidationResultsPanel() {
        initComponents();
    }

    @Override
    public void setData(Object obj) {
        SCAPValidationResult valResult = (SCAPValidationResult) obj;
        File htmlFile = valResult.getHtmlFile();
        if (!htmlFile.exists() || htmlFile.length() == 0) {
            String errorString = valResult.getErrorMessage();
            htmlEditorPane.setText(errorString);
            HTMLEditorScrubber.scrubJEditorPane(htmlEditorPane);
        } else {
            URL htmlURL = null;
            try {
                htmlURL = htmlFile.toURI().toURL();
                htmlEditorPane.setPage(htmlURL);
                HTMLEditorScrubber.scrubJEditorPane(htmlEditorPane);
            } catch (Exception e) {
                htmlEditorPane.setText("Error encountered getting SCAP validation information, see log");
                HTMLEditorScrubber.scrubJEditorPane(htmlEditorPane);
                log.error("Error converting File to URL: " + htmlFile.getAbsolutePath());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        InfoPanel = new javax.swing.JPanel();
        implementationCaption = new javax.swing.JLabel();
        implementationLabel = new javax.swing.JLabel();
        resourceIdCaption = new javax.swing.JLabel();
        resourceIdLabel = new javax.swing.JLabel();
        scapVersionCaption = new javax.swing.JLabel();
        scapVersionLabel = new javax.swing.JLabel();
        ovalVersionCaption = new javax.swing.JLabel();
        ovalVersionLabel = new javax.swing.JLabel();
        usecaseCaption = new javax.swing.JLabel();
        usecaseLabel = new javax.swing.JLabel();
        htmlScrollPanel = new javax.swing.JScrollPane();
        htmlEditorPane = new javax.swing.JEditorPane();

        setMinimumSize(new java.awt.Dimension(375, 477));
        setPreferredSize(new java.awt.Dimension(375, 477));
        setLayout(new java.awt.GridBagLayout());

        InfoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Validation Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.SystemColor.windowText));
        InfoPanel.setLayout(new java.awt.GridBagLayout());

        implementationCaption.setLabelFor(implementationLabel);
        implementationCaption.setText("ImplementationInfo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        InfoPanel.add(implementationCaption, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.7;
        InfoPanel.add(implementationLabel, gridBagConstraints);

        resourceIdCaption.setText("Resource Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        InfoPanel.add(resourceIdCaption, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.7;
        InfoPanel.add(resourceIdLabel, gridBagConstraints);

        scapVersionCaption.setText("SCAP Version:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        InfoPanel.add(scapVersionCaption, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.7;
        InfoPanel.add(scapVersionLabel, gridBagConstraints);

        ovalVersionCaption.setText("OVAL Version:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        InfoPanel.add(ovalVersionCaption, gridBagConstraints);

        ovalVersionLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ovalVersionLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.7;
        InfoPanel.add(ovalVersionLabel, gridBagConstraints);

        usecaseCaption.setText("Use Case:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        InfoPanel.add(usecaseCaption, gridBagConstraints);

        usecaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usecaseLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        InfoPanel.add(usecaseLabel, gridBagConstraints);

        htmlScrollPanel.setViewportView(htmlEditorPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        InfoPanel.add(htmlScrollPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 5, 6);
        add(InfoPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JEditorPane htmlEditorPane;
    private javax.swing.JScrollPane htmlScrollPanel;
    private javax.swing.JLabel implementationCaption;
    private javax.swing.JLabel implementationLabel;
    private javax.swing.JLabel ovalVersionCaption;
    private javax.swing.JLabel ovalVersionLabel;
    private javax.swing.JLabel resourceIdCaption;
    private javax.swing.JLabel resourceIdLabel;
    private javax.swing.JLabel scapVersionCaption;
    private javax.swing.JLabel scapVersionLabel;
    private javax.swing.JLabel usecaseCaption;
    private javax.swing.JLabel usecaseLabel;
    // End of variables declaration//GEN-END:variables
}
