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


import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.log4j.Logger;

import com.g2inc.scap.editor.gui.windows.common.ChangeNotifierPanel;
import com.g2inc.scap.library.domain.xccdf.Rule;


public class FixAndFixTexlTab extends ChangeNotifierPanel implements ChangeListener
{
    private Rule rule = null;
    private JFrame parentWin = null;
	private static Logger log = Logger.getLogger(FixAndFixTexlTab.class);

    /** Creates new form DefinitionDetailTab */
    public FixAndFixTexlTab()
    {
        initComponents();
        fixTextListPanel1.addChangeListener(this);
        fixListPanel1.addChangeListener(this);
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

        fixListPanel1 = new com.g2inc.scap.editor.gui.windows.xccdf.FixListPanel();
        fixTextListPanel1 = new com.g2inc.scap.editor.gui.windows.xccdf.FixTextListPanel();

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        add(fixListPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        add(fixTextListPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.g2inc.scap.editor.gui.windows.xccdf.FixListPanel fixListPanel1;
    private com.g2inc.scap.editor.gui.windows.xccdf.FixTextListPanel fixTextListPanel1;
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

    @Override
    public void stateChanged(ChangeEvent ce)
    {
        Object eventSource = ce.getSource();
        if (eventSource == fixTextListPanel1)
        {
            rule.setFixTextList(fixTextListPanel1.getDoc());
            notifyRegisteredListeners();
        }
        if (eventSource == fixListPanel1)
        {
            rule.setFixList(fixListPanel1.getDoc());
            notifyRegisteredListeners();
        }        
    }

    public void setDoc(Rule rule) 
    {
        this.rule = rule;
        fixTextListPanel1.setDoc(rule.getFixTextList());
        fixListPanel1.setDoc(rule.getFixList());
    }
}
