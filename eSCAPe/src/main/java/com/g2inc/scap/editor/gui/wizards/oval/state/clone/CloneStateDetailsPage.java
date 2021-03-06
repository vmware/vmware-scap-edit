package com.g2inc.scap.editor.gui.wizards.oval.state.clone;
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

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.g2inc.scap.editor.gui.wizards.Wizard;
import com.g2inc.scap.editor.gui.wizards.WizardPage;
import com.g2inc.scap.library.domain.oval.OvalState;

public class CloneStateDetailsPage extends WizardPage
{
    private CloneStateWizard parentWiz = null;
    private OvalState existingSte = null;
    private OvalState newSte = null;

    private void initTextFields()
    {
        String comment = existingSte.getComment();
        if(existingSte.getComment() != null)
        {
            commentTextField.setText("(Copy) " + comment);
        }
        else
        {
            commentTextField.setText("Copy of " + existingSte.getId());
        }

        commentTextField.getDocument().addDocumentListener(new DocumentListener()
        {
            private void common(DocumentEvent de)
            {
                String text = commentTextField.getText();

                if(text.length() == 0)
                {
                    satisfied = false;
                    parentWiz.disableNextButton();
                }
                else
                {
                    satisfied = true;
                    parentWiz.enableNextButton();
                }
            }
            
            public void insertUpdate(DocumentEvent arg0)
            {
                common(arg0);
            }

            
            public void removeUpdate(DocumentEvent arg0)
            {
                common(arg0);
            }

            
            public void changedUpdate(DocumentEvent arg0)
            {
                common(arg0);
            }
        });
    }

    private void initComponents2()
    {
        initTextFields();
    }

    public CloneStateDetailsPage(CloneStateWizard wiz, OvalState existing)
    {
        initComponents();
        parentWiz = wiz;
        existingSte = existing;
        
        initComponents2();
    }

    
    @Override
	public Object getData()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    @Override
	public void setData(Object data)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    @Override
	public void setWizard(Wizard wizard)
    {
        parentWiz = (CloneStateWizard) wizard;
    }

    
    @Override
	public String getPageTitle()
    {
        return "Details";
    }

    
    @Override
	public void performFinish()
    {
        newSte = existingSte.clone();
        newSte.setComment(commentTextField.getText());
    }

    public OvalState getExistingState()
    {
        return existingSte;
    }

    public void setExistingState(OvalState existingState)
    {
        this.existingSte = existingState;
    }

    public OvalState getNewState()
    {
        return newSte;
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

        commentCaption = new javax.swing.JLabel();
        commentTextField = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        commentCaption.setText("Comment");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(8, 5, 0, 10);
        add(commentCaption, gridBagConstraints);

        commentTextField.setText("jTextField1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 9);
        add(commentTextField, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel commentCaption;
    private javax.swing.JTextField commentTextField;
    // End of variables declaration//GEN-END:variables
}
