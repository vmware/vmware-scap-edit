package com.g2inc.scap.editor.gui.windows.xccdf;

/* ESCAPE Software   Copyright 2010 G2, Inc. - All rights reserved.
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

import javax.swing.JFrame;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

import com.g2inc.scap.editor.gui.dialogs.editors.EditorDialog;
import com.g2inc.scap.editor.gui.dialogs.editors.oval.datatype.html.HtmlTextEditor;
import com.g2inc.scap.editor.gui.resources.HTMLEditorScrubber;
import com.g2inc.scap.editor.gui.windows.EditorMainWindow;
import com.g2inc.scap.editor.gui.windows.common.ChangeNotifierPanel;
import com.g2inc.scap.library.util.CommonUtil;

public class EditableHtmlPanel extends ChangeNotifierPanel implements ActionListener
{
    private String text = null;
    private JFrame parentWin = null;

    /** Creates new form DefinitionDetailTab */
    public EditableHtmlPanel()
    {
        initComponents();
        initComponents2();
    }
   @Override
   public void actionPerformed(ActionEvent ae)
   {
       Object src = ae.getSource();
       if(src == editButton)
       {
            EditorDialog editor = new EditorDialog(EditorMainWindow.getInstance(), true);
            HtmlTextEditor htmlTextEditor = new HtmlTextEditor();
            editor.setEditorPage(htmlTextEditor);
            htmlTextEditor.setData(text);
            editor.pack();
            editor.setLocationRelativeTo(EditorMainWindow.getInstance());
            editor.setVisible(true);
            if (!editor.wasCancelled())
            {
                text = (String) editor.getData();
                htmlTextEditorPane.setText(CommonUtil.removeXhtmlPrefixes(text));
                HTMLEditorScrubber.scrubJEditorPane(htmlTextEditorPane);
                notifyRegisteredListeners();
            }
       }
   }

    public void initComponents2()
    {
        HTMLEditorKit htmlKit = new HTMLEditorKit();
        htmlTextEditorPane.setEditorKit(htmlKit);
        Document htmlTextDoc = htmlKit.createDefaultDocument();
        htmlTextEditorPane.setDocument(htmlTextDoc);
        htmlTextEditorPane.setEditable(false);
        editButton.addActionListener(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        captionLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        htmlTextScrollPane = new javax.swing.JScrollPane();
        htmlTextEditorPane = new javax.swing.JEditorPane();

        setLayout(new java.awt.GridBagLayout());

        captionLabel.setText("Label");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        add(captionLabel, gridBagConstraints);

        editButton.setText("Edit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 5);
        add(editButton, gridBagConstraints);

        htmlTextScrollPane.setViewportView(htmlTextEditorPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 5, 2, 5);
        add(htmlTextScrollPane, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel captionLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JEditorPane htmlTextEditorPane;
    private javax.swing.JScrollPane htmlTextScrollPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public JFrame getParentWin()
    {
        return parentWin;
    }

    @Override
    public void setParentWin(JFrame parentWin)
    {
        this.parentWin = parentWin;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
        htmlTextEditorPane.setText(CommonUtil.removeXhtmlPrefixes(text));
            HTMLEditorScrubber.scrubJEditorPane(htmlTextEditorPane);
    }

    public void setLabel(String label)
    {
        captionLabel.setText(label);
    }
}
