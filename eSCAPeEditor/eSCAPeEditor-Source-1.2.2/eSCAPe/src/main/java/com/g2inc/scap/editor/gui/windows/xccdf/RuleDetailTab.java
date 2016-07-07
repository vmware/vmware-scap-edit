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

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.log4j.Logger;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import com.g2inc.scap.editor.gui.util.EditorUtil;
import com.g2inc.scap.editor.gui.windows.EditorMainWindow;
import com.g2inc.scap.editor.gui.windows.common.GenericSourceDetailTab;
import com.g2inc.scap.library.domain.SCAPDocumentTypeEnum;
import com.g2inc.scap.library.domain.SCAPElement;
import com.g2inc.scap.library.domain.xccdf.Check;
import com.g2inc.scap.library.domain.xccdf.Rule;

public class RuleDetailTab extends javax.swing.JPanel implements ChangeListener
{
    private static final long serialVersionUID = 1L;
    private Rule rule = null;
    private JFrame parentWin = null;
    private GenericSourceDetailTab sourceTab = null;
    private static final Logger log = Logger.getLogger(RuleDetailTab.class);

    private ItemReferenceDetailTab itemRefTab = null;
    private ItemAttributesDetailTab itemAttributesTab = null;
    private SelectableItemDetailTab selItemTab = null;
    private RuleAttributesDetailTab ruleAttributesTab = null;
    private ItemMetadataDetailTab itemMetadataTab = null;
    private FixAndFixTexlTab fixTab = null;
    private CheckListPanel checkListPanel = null;

    /** Creates new form DefinitionDetailTab */
    public RuleDetailTab()
    {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        itemDetailPanel1 = new com.g2inc.scap.editor.gui.windows.xccdf.ItemDetailPanel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.SystemColor.windowText)); // NOI18N
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(itemDetailPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.g2inc.scap.editor.gui.windows.xccdf.ItemDetailPanel itemDetailPanel1;
    // End of variables declaration//GEN-END:variables

    public JFrame getParentWin()
    {
        return parentWin;
    }

    public void setParentWin(JFrame parentWin)
    {
        this.parentWin = parentWin;
    }

    public Rule getDoc()
    {
        rule = (Rule) itemDetailPanel1.getDoc();
        return rule;
    }

    public void setDoc(Rule rule)
    {
        this.rule = rule;
	itemDetailPanel1.setDoc(rule);
        itemDetailPanel1.addChangeListener(this);
    }

    public void setTabs(JTabbedPane detailTabPane)
    {
        detailTabPane.addTab("General", this);

        itemRefTab = new ItemReferenceDetailTab();
        itemRefTab.setDoc(rule);
        itemRefTab.addChangeListener(this);
        detailTabPane.addTab("References", itemRefTab);

        itemAttributesTab = new ItemAttributesDetailTab();
        itemAttributesTab.setDoc(rule);
        itemAttributesTab.addChangeListener(this);
        detailTabPane.addTab("Attributes", itemAttributesTab);

        selItemTab = new SelectableItemDetailTab();
        selItemTab.setDoc(rule);
        selItemTab.addChangeListener(this);
        detailTabPane.addTab("Selectable Item", selItemTab);
        selItemTab.setParentWin(parentWin);

        ruleAttributesTab = new RuleAttributesDetailTab();
        ruleAttributesTab.setDoc(rule);
        ruleAttributesTab.addChangeListener(this);
        detailTabPane.addTab("Role/Severity", ruleAttributesTab);
        
        if (((SCAPElement)rule).getSCAPDocument().getDocumentType() == SCAPDocumentTypeEnum.XCCDF_12) {
            itemMetadataTab = new ItemMetadataDetailTab();
            itemMetadataTab.setDoc(rule);
            itemMetadataTab.addChangeListener(this);
            detailTabPane.addTab("Metadata", itemMetadataTab);
        }
        
        fixTab = new FixAndFixTexlTab();
        fixTab.setDoc(rule);
        fixTab.addChangeListener(this);
        detailTabPane.addTab("Fix", fixTab);

        checkListPanel = new CheckListPanel();
        List<Check> checkList = rule.getCheckList();
        checkListPanel.setDoc(checkList);
        checkListPanel.addChangeListener(this);
        detailTabPane.add("Checks", checkListPanel);
    }

    public GenericSourceDetailTab getSourceTab()
    {
        return sourceTab;
    }

    public void setSourceTab(GenericSourceDetailTab sourceTab)
    {
        this.sourceTab = sourceTab;
    }

    private void updateSource()
    {
        StringWriter sw = new StringWriter();
        XMLOutputter xmlo = new XMLOutputter(Format.getPrettyFormat());

        try
        {
            xmlo.output(rule.getElement(), sw);
            sourceTab.setXMLSource(sw.toString());
            sw.close();
        }
        catch (IOException ioe)
        {
        }
    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        
        Object src = e.getSource();
        log.debug("stateChange called, eventSource is " + src.getClass().getName());

        if(src == itemAttributesTab
                || src == itemDetailPanel1
                || src == itemRefTab
                || src == itemMetadataTab
                || src == selItemTab
                || src == fixTab
                || src == ruleAttributesTab)
        {
            log.debug("stateChange calling updateSource");
            updateSource();
            EditorUtil.markActiveWindowDirty(EditorMainWindow.getInstance(), true);
        }
        else if(src == checkListPanel)
        {
            rule.setCheckList(checkListPanel.getDoc());
            updateSource();
            EditorUtil.markActiveWindowDirty(EditorMainWindow.getInstance(), true);
        }
    }
}