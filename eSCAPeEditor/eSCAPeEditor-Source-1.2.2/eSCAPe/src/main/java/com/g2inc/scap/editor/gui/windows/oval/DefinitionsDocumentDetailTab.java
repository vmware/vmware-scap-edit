package com.g2inc.scap.editor.gui.windows.oval;
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

import java.lang.ref.WeakReference;

import com.g2inc.scap.editor.gui.windows.common.TabAbstract;
import com.g2inc.scap.library.domain.oval.OvalDefinitionsDocument;

/**
 *
 * @author g2
 */
public class DefinitionsDocumentDetailTab extends TabAbstract
{
    /** Creates new form DefinitionsDocumentDetailTab */
    private WeakReference<OvalDefinitionsDocument> doc = null;

    private void initComponents2()
    {
    }

    public DefinitionsDocumentDetailTab() {
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

        genDetailsPanel = new javax.swing.JPanel();
        filenameCaption = new javax.swing.JLabel();
        filenameLabel = new javax.swing.JLabel();
        ovalDetailsPanel = new javax.swing.JPanel();
        generatorProdNameCaption = new javax.swing.JLabel();
        generatorProdNameLabel = new javax.swing.JLabel();
        generatorProdVerCaption = new javax.swing.JLabel();
        generatorSchemaVersionCaption = new javax.swing.JLabel();
        generatorSchemaVersionLabel = new javax.swing.JLabel();
        generatorTimestampCaption = new javax.swing.JLabel();
        generatorTimestampLabel = new javax.swing.JLabel();
        generatorProdVerLabel = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        genDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "General Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.SystemColor.windowText)); // NOI18N
        genDetailsPanel.setLayout(new java.awt.GridBagLayout());

        filenameCaption.setText("Filename:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.01;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 0);
        genDetailsPanel.add(filenameCaption, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        genDetailsPanel.add(filenameLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        add(genDetailsPanel, gridBagConstraints);

        ovalDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OVAL Generator Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), java.awt.SystemColor.windowText)); // NOI18N
        ovalDetailsPanel.setLayout(new java.awt.GridBagLayout());

        generatorProdNameCaption.setText("Product Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        ovalDetailsPanel.add(generatorProdNameCaption, gridBagConstraints);

        generatorProdNameLabel.setText("N/A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.3;
        ovalDetailsPanel.add(generatorProdNameLabel, gridBagConstraints);

        generatorProdVerCaption.setText("Product Version");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        ovalDetailsPanel.add(generatorProdVerCaption, gridBagConstraints);

        generatorSchemaVersionCaption.setText("OVAL Schema Version");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 19);
        ovalDetailsPanel.add(generatorSchemaVersionCaption, gridBagConstraints);

        generatorSchemaVersionLabel.setText("N/A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.2;
        ovalDetailsPanel.add(generatorSchemaVersionLabel, gridBagConstraints);

        generatorTimestampCaption.setText("Timestamp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.99;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        ovalDetailsPanel.add(generatorTimestampCaption, gridBagConstraints);

        generatorTimestampLabel.setText("N/A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.2;
        ovalDetailsPanel.add(generatorTimestampLabel, gridBagConstraints);

        generatorProdVerLabel.setText("N/A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        ovalDetailsPanel.add(generatorProdVerLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.2;
        add(ovalDetailsPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel filenameCaption;
    private javax.swing.JLabel filenameLabel;
    private javax.swing.JPanel genDetailsPanel;
    private javax.swing.JLabel generatorProdNameCaption;
    private javax.swing.JLabel generatorProdNameLabel;
    private javax.swing.JLabel generatorProdVerCaption;
    private javax.swing.JLabel generatorProdVerLabel;
    private javax.swing.JLabel generatorSchemaVersionCaption;
    private javax.swing.JLabel generatorSchemaVersionLabel;
    private javax.swing.JLabel generatorTimestampCaption;
    private javax.swing.JLabel generatorTimestampLabel;
    private javax.swing.JPanel ovalDetailsPanel;
    // End of variables declaration//GEN-END:variables

    public OvalDefinitionsDocument getDoc() {
        return doc.get();
    }

    public void setDoc(OvalDefinitionsDocument document)
    {
        this.doc = new WeakReference<OvalDefinitionsDocument>(document);
        
        filenameLabel.setText(doc.get().getFilename());

        if(doc.get().getGeneratorProduct() != null)
        {
            generatorProdNameLabel.setText(doc.get().getGeneratorProduct());
        }

        if(doc.get().getGeneratorProductVersion() != null)
        {
            generatorProdVerLabel.setText(doc.get().getGeneratorProductVersion());
        }
        
        generatorSchemaVersionLabel.setText(doc.get().getSchemaVersion());
        generatorTimestampLabel.setText(doc.get().getGeneratorRawDate());
    }
}
