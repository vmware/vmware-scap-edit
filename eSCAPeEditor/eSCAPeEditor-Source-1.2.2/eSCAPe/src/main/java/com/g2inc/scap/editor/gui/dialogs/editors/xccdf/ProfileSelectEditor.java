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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.g2inc.scap.editor.gui.choosers.xccdf.GroupChooser;
import com.g2inc.scap.editor.gui.choosers.xccdf.RuleChooser;
import com.g2inc.scap.editor.gui.dialogs.editors.EditorDialog;
import com.g2inc.scap.editor.gui.dialogs.editors.IEditorPage;
import com.g2inc.scap.editor.gui.util.EditorUtil;
import com.g2inc.scap.editor.gui.windows.EditorMainWindow;
import com.g2inc.scap.library.domain.xccdf.Group;
import com.g2inc.scap.library.domain.xccdf.ProfileSelect;
import com.g2inc.scap.library.domain.xccdf.Remark;
import com.g2inc.scap.library.domain.xccdf.Rule;

public class ProfileSelectEditor extends JPanel implements IEditorPage, ChangeListener
{
    private EditorDialog parentEditor = null;
    private ProfileSelect profileSelect = null;

    private void initButtons()
    {
        chooseRuleButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                RuleChooser chooser = new RuleChooser(true);
                chooser.setSource(profileSelect.getSCAPDocument(), null, null);
                chooser.setVisible(true);

                if(!chooser.wasCancelled())
                {
                    Rule rule = (Rule) chooser.getChosen();
                    selectedIdLabel.setText(rule.getId());
					profileSelect.setIdRef(rule.getId());
                    parentEditor.enableOkButton();
                }
            }
        });
        chooseGroupButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                GroupChooser chooser = new GroupChooser(true);
//                chooser.setSource(varComp.getParentDocument(), null, null);
                chooser.setVisible(true);

                if(!chooser.wasCancelled())
                {
                    Group group = (Group) chooser.getChosen();
                    selectedIdLabel.setText(group.getId());
					profileSelect.setIdRef(group.getId());
                    parentEditor.enableOkButton();
                }
            }
        });
    }

    private void initCheckBox() {
		selectCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				profileSelect.setSelected(e.getStateChange() == ItemEvent.SELECTED);
			}
		});
    }

    private void initComponents2()
    {
        initButtons();
		initCheckBox();
    }

    public ProfileSelectEditor()
    {
        initComponents();
        initComponents2();
		remarkListPanel1.addChangeListener(this);
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

        selectedIdCaption = new javax.swing.JLabel();
        selectedIdLabel = new javax.swing.JLabel();
        chooseRuleButton = new javax.swing.JButton();
        chooseGroupButton = new javax.swing.JButton();
        remarkListPanel1 = new com.g2inc.scap.editor.gui.windows.xccdf.RemarkListPanel();
        selectCheckBox = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());

        selectedIdCaption.setText("Selected Id:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 2);
        add(selectedIdCaption, gridBagConstraints);

        selectedIdLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        selectedIdLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        selectedIdLabel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        selectedIdLabel.setMinimumSize(new java.awt.Dimension(128, 255));
        selectedIdLabel.setPreferredSize(new java.awt.Dimension(128, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.6;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 4, 4);
        add(selectedIdLabel, gridBagConstraints);

        chooseRuleButton.setText("Choose Rule");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 5, 5);
        add(chooseRuleButton, gridBagConstraints);

        chooseGroupButton.setText("Choose Group");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 5, 5);
        add(chooseGroupButton, gridBagConstraints);

        remarkListPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remarks", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.SystemColor.windowText)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 10, 3, 5);
        add(remarkListPanel1, gridBagConstraints);

        selectCheckBox.setText("selected");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 8, 3, 0);
        add(selectCheckBox, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseGroupButton;
    private javax.swing.JButton chooseRuleButton;
    private com.g2inc.scap.editor.gui.windows.xccdf.RemarkListPanel remarkListPanel1;
    private javax.swing.JCheckBox selectCheckBox;
    private javax.swing.JLabel selectedIdCaption;
    private javax.swing.JLabel selectedIdLabel;
    // End of variables declaration//GEN-END:variables

    public ProfileSelect getData() {
		return profileSelect;
    }

    public void setEditorDialog(EditorDialog editorDialog)
    {
        parentEditor = editorDialog;
        parentEditor.setTitle("Profile Select Editor");
    }

    public void setData(Object data)
    {
		profileSelect = (ProfileSelect) data;
		if (profileSelect != null) {
			String selectedId = profileSelect.getIdRef();
			if (selectedId != null) {
				selectedIdLabel.setText(selectedId);
			}
			selectCheckBox.setSelected(profileSelect.isSelected());
			List<Remark> list = profileSelect.getRemarkList();
			remarkListPanel1.setDoc(list);
		}
    }

    public void stateChanged(ChangeEvent ce) {
		Object eventSource = ce.getSource();
        if (eventSource == remarkListPanel1) {
            if(remarkListPanel1.hasChanged()) {
				profileSelect.setRemarkList(remarkListPanel1.getDoc());
                EditorUtil.markActiveWindowDirty(EditorMainWindow.getInstance(), true);
            }
        }
    }
}
