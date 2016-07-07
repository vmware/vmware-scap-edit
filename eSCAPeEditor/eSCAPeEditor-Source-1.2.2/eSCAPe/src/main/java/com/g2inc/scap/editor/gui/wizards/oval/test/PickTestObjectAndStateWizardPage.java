package com.g2inc.scap.editor.gui.wizards.oval.test;
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

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.log4j.Logger;

import com.g2inc.scap.editor.gui.windows.common.GenericSourceDetailTab;
import com.g2inc.scap.editor.gui.wizards.Wizard;
import com.g2inc.scap.editor.gui.wizards.WizardPage;
import com.g2inc.scap.library.domain.oval.OvalTest;

public class PickTestObjectAndStateWizardPage extends WizardPage implements ChangeListener
{
    private static final Logger log = Logger.getLogger(PickTestObjectAndStateWizardPage.class);
    private static final long serialVersionUID = 1L;
    private OvalTest ovalTest = null;
    String lastTypeChosen = null;
    private GenericSourceDetailTab sourceTab = null;
    private NewTestWizard parentWiz = null;


    private void initComponents2()
    {
        testDetailDisplayPanel1.setModalParent(true);
        testDetailDisplayPanel1.addChangeListener(this);
    }

    /** Creates new form DefinitionDetailTab */
    public PickTestObjectAndStateWizardPage(NewTestWizard wiz)
    {
        setWizard(wiz);
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

        testDetailDisplayPanel1 = new com.g2inc.scap.editor.gui.windows.oval.test.TestDetailDisplayPanel();

        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(testDetailDisplayPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.g2inc.scap.editor.gui.windows.oval.test.TestDetailDisplayPanel testDetailDisplayPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setVisible(boolean visible)
    {
        super.setVisible(visible);
        if (visible)
        {
            if (lastTypeChosen == null || !lastTypeChosen.equals(parentWiz.getChosenType()))
            {
                lastTypeChosen = parentWiz.getChosenType();
                ovalTest = parentWiz.getOvalTest();
                if (ovalTest == null)
                {
                    ovalTest = parentWiz.getOvalDefDoc().createTest(parentWiz.getChosenPlatform(), lastTypeChosen);
                    parentWiz.setOvalTest(ovalTest);
                }
                
                testDetailDisplayPanel1.setOvalTest(ovalTest);
                setSatisfied(true);
            }

            parentWiz.enableNextButton();
        }
    }

    @Override
    public void setWizard(Wizard wizard)
    {
        parentWiz = (NewTestWizard) wizard;
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
    public String getPageTitle()
    {
        return "Object and State";
    }

    public GenericSourceDetailTab getSourceTab()
    {
        return sourceTab;
    }

    public void setSourceTab(GenericSourceDetailTab sourceTab)
    {
        this.sourceTab = sourceTab;
    }

    @Override
    public void performFinish()
    {
//    	String comment = testCommentTextField.getText();
//    	log.debug("WizardPage performFinish called, comment = " + comment);
//    	if (comment != null && ovalTest != null) {
//    		ovalTest.setComment(comment);
//    	}
//        String check = (String) checkComboBox.getSelectedItem();
//        ovalTest.setCheck(check);
    }


    @Override
    public void stateChanged(ChangeEvent ce)
    {
        Object src = ce.getSource();

        if(src == testDetailDisplayPanel1)
        {
            // the testDetailDisplayPanel panel is telling us something changed, let's ask him if he's still valid.
            log.debug("Receiving ChangeEvent from testDetailDisplayPanel.");
            if(!testDetailDisplayPanel1.allDataOK())
            {
                parentWiz.disableNextButton();
            }
            else
            {
                parentWiz.enableNextButton();
            }
        }
    }
}
