package com.g2inc.scap.editor.gui.dialogs.editors.oval.datatype.string;
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

import java.util.regex.Pattern;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.g2inc.scap.editor.gui.dialogs.editors.EditorDialog;
import com.g2inc.scap.editor.gui.dialogs.editors.IEditorPage;

public class NCNameDatatypeEditor extends javax.swing.JPanel implements IEditorPage
{
    private EditorDialog parentEditor = null;
	private DocumentListener documentListener = null;
    public static final Pattern NCNAME_PATTERN = Pattern.compile("[_A-Za-z][-._A-Za-z0-9]*");

    private void initTextFields()
    {
	stringValueTextField.getDocument().addDocumentListener(new DocumentListener()
        {
            private void common(DocumentEvent de)
            {
                String text = stringValueTextField.getText();
                if (text.length() > 0)
                {
                    if (!NCNAME_PATTERN.matcher(text).matches())
                    {
                            statusLabel.setText("NCName string entered is invalid. See character restrictions above");
                    }
                    else
                    {
                            statusLabel.setText("NCName is valid");
                    }
                }
            }

            @Override
            public void insertUpdate(DocumentEvent de)
            {
                common(de);
            }

            public void removeUpdate(DocumentEvent de)
            {
                common(de);
            }

            public void changedUpdate(DocumentEvent de)
            {
                common(de);
            }
	});

	stringValueTextField.getDocument().addDocumentListener(documentListener);
    }

    private void initComponents2()
    {
        initTextFields();
    }

    /** Creates new form RegexDatatypeEditor */
    public NCNameDatatypeEditor()
    {
        initComponents();
        initComponents2();
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

        infoLabel = new javax.swing.JLabel();
        stringValueCaption = new javax.swing.JLabel();
        stringValueTextField = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        infoLabel.setText("<html>Enter an \"NCName\" which specifies the id field of another XCCDF element (such as a Group, Profile, Rule, or Value) in this document. The first character of an NCName must be a letter or underscore. All subsequent characters may be letters, digits, underscores or dashes.</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 5);
        add(infoLabel, gridBagConstraints);

        stringValueCaption.setText("NCName:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 5);
        add(stringValueCaption, gridBagConstraints);

        stringValueTextField.setPreferredSize(new java.awt.Dimension(255, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 5, 6);
        add(stringValueTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        add(statusLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel stringValueCaption;
    private javax.swing.JTextField stringValueTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getData()
    {
        return stringValueTextField.getText();
    }

    @Override
    public void setEditorDialog(EditorDialog editorDialog)
    {
        parentEditor = editorDialog;
        parentEditor.setTitle("NCName Editor");
    }

    @Override
    public void setData(Object data)
    {
        if (data == null)
        {
            stringValueTextField.setText("");
        } else
        {
            stringValueTextField.setText((String) data);
        }

        stringValueTextField.requestFocus();
    }
}
