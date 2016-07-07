package com.g2inc.scap.editor.gui.dialogs.editors.oval.object.selectparms;
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

import java.util.List;
import java.util.Set;

import javax.swing.DefaultListModel;

import com.g2inc.scap.editor.gui.dialogs.editors.EditorDialog;
import com.g2inc.scap.editor.gui.dialogs.editors.IEditorPage;
import com.g2inc.scap.library.domain.oval.OvalEntity;

public class PickObjectParmsToAddPage extends javax.swing.JPanel implements IEditorPage
{
    private EditorDialog parentEditor = null;
    private Set<String> existing = null;
    
    private void initList()
    {
        parmList.setModel(new DefaultListModel());
    }
    private void initComponents2()
    {
        initList();
    }

    /** Creates new form RegexDatatypeEditor */
    public PickObjectParmsToAddPage()
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

        operatorCaption = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        parmList = new javax.swing.JList();

        setLayout(new java.awt.GridBagLayout());

        operatorCaption.setText("Available parameters");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 5);
        add(operatorCaption, gridBagConstraints);

        parmList.setMaximumSize(null);
        parmList.setMinimumSize(null);
        parmList.setPreferredSize(null);
        jScrollPane1.setViewportView(parmList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(8, 8, 8, 8);
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel operatorCaption;
    private javax.swing.JList parmList;
    // End of variables declaration//GEN-END:variables

    public Object getData()
    {
        return parmList.getSelectedValues();
    }

    public void setEditorDialog(EditorDialog editorDialog)
    {
        parentEditor = editorDialog;
    }

    public void setExisting(Set<String> alreadyAddedParms)
    {
        existing = alreadyAddedParms;
    }

    public void setData(Object data)
    {
        DefaultListModel model = (DefaultListModel) parmList.getModel();

        List<OvalEntity> validOptions = (List<OvalEntity>) data;

        for(int x = 0; x < validOptions.size(); x++)
        {
            OvalEntity oe = validOptions.get(x);
            if(!existing.contains(oe.getName()))
            {
                model.addElement(validOptions.get(x));
            }
        }

        int [] selection = new int[model.size()];

        for(int x = 0; x < model.size(); x++)
        {
            selection[x] = x;
        }

        parmList.setSelectedIndices(selection);
    }
}
