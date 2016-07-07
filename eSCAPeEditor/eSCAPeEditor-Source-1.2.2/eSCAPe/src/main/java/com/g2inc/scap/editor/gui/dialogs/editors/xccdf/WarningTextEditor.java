package com.g2inc.scap.editor.gui.dialogs.editors.xccdf;
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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;
import javax.swing.text.html.HTMLEditorKit;

import org.apache.log4j.Logger;

import com.g2inc.scap.editor.gui.dialogs.editors.EditorDialog;
import com.g2inc.scap.editor.gui.dialogs.editors.IEditorPage;
import com.g2inc.scap.editor.gui.resources.HTMLEditorScrubber;
import com.g2inc.scap.library.domain.xccdf.Warning;
import com.g2inc.scap.library.domain.xccdf.WarningCategoryEnum;

public class WarningTextEditor extends javax.swing.JPanel implements IEditorPage {

    private Warning warning;
    private EditorDialog parentEditor = null;
    private HTMLEditorKit htmlKit = null;
    private static final Logger LOG = Logger.getLogger(WarningTextEditor.class);

    private void initTextFields() {
        htmlKit = new HTMLEditorKit();
        htmlTextEditorPane.setEditorKit(htmlKit);
        Document htmlTextDoc = htmlKit.createDefaultDocument();
        htmlTextEditorPane.setDocument(htmlTextDoc);
        htmlTextEditorPane.setEditable(false);
        plainTextArea.setDocument(new PlainDocument());
        plainTextArea.getDocument().addDocumentListener(new DocumentListener() {
            public void common() {
                String plainText = plainTextArea.getText();
                LOG.debug("DocumentListener called, plain text lenth=" + plainText.length());
                htmlTextEditorPane.setText(plainText.replaceAll("xhtml:", ""));
                HTMLEditorScrubber.scrubJEditorPane(htmlTextEditorPane);
            }

            public void insertUpdate(DocumentEvent arg0) {
                common();
            }

            public void removeUpdate(DocumentEvent arg0) {
                common();
            }

            public void changedUpdate(DocumentEvent arg0) {
                common();
            }
        });
    }

    private void initComboBox() {
        warningCategoryCombo.removeAllItems();
        WarningCategoryEnum[] statusEnums = WarningCategoryEnum.values();
        for (int i = 0; i < statusEnums.length; i++) {
            warningCategoryCombo.addItem(statusEnums[i]);
        }
        warningCategoryCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                WarningCategoryEnum selected = (WarningCategoryEnum) warningCategoryCombo.getSelectedItem();
                warning.setCategory(selected);
            }
        });
    }

    private void initComponents2() {
        initTextFields();
        initComboBox();
    }

    /**
     * Creates new form RegexDatatypeEditor
     */
    public WarningTextEditor() {
        initComponents();
        initComponents2();
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

        stringValueCaption = new javax.swing.JLabel();
        htmlCaption = new javax.swing.JLabel();
        plainTextAreaPane = new javax.swing.JScrollPane();
        plainTextArea = new javax.swing.JTextArea();
        htmlTextEditorScrollPane = new javax.swing.JScrollPane();
        htmlTextEditorPane = new javax.swing.JEditorPane();
        categoryCaption = new javax.swing.JLabel();
        warningCategoryCombo = new javax.swing.JComboBox();
        langOverridePanel1 = new com.g2inc.scap.editor.gui.windows.xccdf.LangOverridePanel();

        setLayout(new java.awt.GridBagLayout());

        stringValueCaption.setText("String Text:");
        stringValueCaption.setAlignmentY(0.0F);
        stringValueCaption.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        add(stringValueCaption, gridBagConstraints);

        htmlCaption.setLabelFor(htmlTextEditorScrollPane);
        htmlCaption.setText("HTML Text:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        add(htmlCaption, gridBagConstraints);

        plainTextArea.setColumns(20);
        plainTextArea.setRows(5);
        plainTextAreaPane.setViewportView(plainTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 5);
        add(plainTextAreaPane, gridBagConstraints);

        htmlTextEditorScrollPane.setViewportView(htmlTextEditorPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 5, 5);
        add(htmlTextEditorScrollPane, gridBagConstraints);

        categoryCaption.setText("Category:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(categoryCaption, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(3, 10, 0, 5);
        add(warningCategoryCombo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(langOverridePanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryCaption;
    private javax.swing.JLabel htmlCaption;
    private javax.swing.JEditorPane htmlTextEditorPane;
    private javax.swing.JScrollPane htmlTextEditorScrollPane;
    private com.g2inc.scap.editor.gui.windows.xccdf.LangOverridePanel langOverridePanel1;
    private javax.swing.JTextArea plainTextArea;
    private javax.swing.JScrollPane plainTextAreaPane;
    private javax.swing.JLabel stringValueCaption;
    private javax.swing.JComboBox warningCategoryCombo;
    // End of variables declaration//GEN-END:variables

    public Object getData() {
        String tagName = warning.getElement().getName();
        warning.setElementFromStringWithHtml(tagName, plainTextArea.getText());
        return warning;
    }

    public void setEditorDialog(EditorDialog editorDialog) {
        parentEditor = editorDialog;
        parentEditor.setTitle("HTML Text Editor");
    }

    public void setData(Object data) {
        warning = (Warning) data;
        String string = warning.toStringWithHtml();
        if (data == null) {
            plainTextArea.setText("");
        } else {
            plainTextArea.setText(string);
//			langOverridePanel1.setData(warning);
        }
        plainTextArea.requestFocus();
    }
}
