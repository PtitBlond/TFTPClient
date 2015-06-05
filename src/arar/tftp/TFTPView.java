/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arar.tftp;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.swing.JFileChooser;

/**
 *
 * @author PtitBlond
 */
public class TFTPView extends javax.swing.JFrame
{
    /**
     * Creates new form NewJFrame
     */
    public TFTPView()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sendLocalFilePath = new javax.swing.JTextField();
        browseSendButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sendRemoteFileName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sendServerAddress = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        clearSendButtonLog = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sendLog = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        downloadRemoteFileName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        downloadLocalFilePath = new javax.swing.JTextField();
        browseDownloadButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        downloadServerAddress = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        clearDownloadLogButton = new javax.swing.JButton();
        downloadButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        downloadLog = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TFTP Client");
        setMinimumSize(new java.awt.Dimension(600, 300));
        setPreferredSize(new java.awt.Dimension(600, 300));

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(400, 300));

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setText("Local file path*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(sendLocalFilePath, gridBagConstraints);

        browseSendButton.setText("Browse");
        browseSendButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                browseSend(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 5);
        jPanel1.add(browseSendButton, gridBagConstraints);

        jLabel2.setText("Remote file name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(sendRemoteFileName, gridBagConstraints);

        jLabel3.setText("Server address*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel1.add(sendServerAddress, gridBagConstraints);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        clearSendButtonLog.setText("Clear log");
        clearSendButtonLog.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                clearSendLog(evt);
            }
        });
        jPanel3.add(clearSendButtonLog);

        sendButton.setText("Send file");
        sendButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sendFile(evt);
            }
        });
        jPanel3.add(sendButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        sendLog.setEditable(false);
        sendLog.setColumns(20);
        sendLog.setRows(5);
        jScrollPane1.setViewportView(sendLog);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jTabbedPane1.addTab("Send file", jPanel1);

        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 5, 0, 5, 0};
        jPanel2Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel2.setLayout(jPanel2Layout);

        jLabel4.setText("Remote file name*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel2.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel2.add(downloadRemoteFileName, gridBagConstraints);

        jLabel5.setText("Local file path*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel2.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(downloadLocalFilePath, gridBagConstraints);

        browseDownloadButton.setText("Browse");
        browseDownloadButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                browseDownload(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        jPanel2.add(browseDownloadButton, gridBagConstraints);

        jLabel6.setText("Server address*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(downloadServerAddress, gridBagConstraints);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        clearDownloadLogButton.setText("Clear log");
        clearDownloadLogButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                clearDownloadLog(evt);
            }
        });
        jPanel4.add(clearDownloadLogButton);

        downloadButton.setText("Download file");
        downloadButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                downloadFile(evt);
            }
        });
        jPanel4.add(downloadButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel2.add(jPanel4, gridBagConstraints);

        downloadLog.setEditable(false);
        downloadLog.setColumns(20);
        downloadLog.setRows(5);
        jScrollPane2.setViewportView(downloadLog);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        jTabbedPane1.addTab("Download file", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseSend(java.awt.event.ActionEvent evt)//GEN-FIRST:event_browseSend
    {//GEN-HEADEREND:event_browseSend
        JFileChooser fileDialog = new JFileChooser();
        fileDialog.setDialogTitle("Select which file to send");
        fileDialog.setDialogType(JFileChooser.CUSTOM_DIALOG);
        fileDialog.setApproveButtonText("Select");
        
        if(fileDialog.showDialog(this, null) == JFileChooser.APPROVE_OPTION)
        {
            this.sendLocalFilePath.setText(fileDialog.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_browseSend

    private void browseDownload(java.awt.event.ActionEvent evt)//GEN-FIRST:event_browseDownload
    {//GEN-HEADEREND:event_browseDownload
        JFileChooser fileDialog = new JFileChooser();
        fileDialog.setDialogTitle("Select where to save the file");
        fileDialog.setDialogType(JFileChooser.CUSTOM_DIALOG);
        fileDialog.setApproveButtonText("Select");
        
        if(fileDialog.showDialog(this, null) == JFileChooser.APPROVE_OPTION)
        {
            this.downloadLocalFilePath.setText(fileDialog.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_browseDownload

    private void clearSendLog(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clearSendLog
    {//GEN-HEADEREND:event_clearSendLog
        this.sendLog.setText(null);
    }//GEN-LAST:event_clearSendLog

    private void clearDownloadLog(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clearDownloadLog
    {//GEN-HEADEREND:event_clearDownloadLog
        this.downloadLog.setText(null);
    }//GEN-LAST:event_clearDownloadLog

    private void downloadFile(java.awt.event.ActionEvent evt)//GEN-FIRST:event_downloadFile
    {//GEN-HEADEREND:event_downloadFile
        if(!this.downloadRemoteFileName.getText().isEmpty())
        {
            if(!this.downloadLocalFilePath.getText().isEmpty())
            {
                if(!this.downloadServerAddress.getText().isEmpty())
                {
                    try
                    {
                        int errorCode;
                        
                        this.downloadButton.setEnabled(false);
                        
                        switch(errorCode = TFTPClient.receiveFile(                        
                                this.downloadRemoteFileName.getText(),
                                this.downloadLocalFilePath.getText(),
                                InetAddress.getByName(this.downloadServerAddress.getText()),
                                69
                        ))
                        {
                            case 0:
                                this.downloadLog.append("Successfully downloaded " + this.downloadRemoteFileName.getText() + ".\n");
                            break;
                            
                            case -3:
                                this.downloadLog.append("Local file " + this.downloadLocalFilePath.getText() + " already exists.\n");
                            break;
                                
                            case -6:
                                this.downloadLog.append("Network error.\n");
                            break;
                            
                            case -7:
                                this.downloadLog.append("I/O error.\n");
                            break;
                            
                            default:
                                this.downloadLog.append("TFTP server error " + errorCode + ".\n");
                        }
                        
                        this.downloadButton.setEnabled(true);
                    }
                    catch(UnknownHostException e)
                    {
                        this.downloadLog.append("Couldn't resolve server address: " + e.getMessage() + "\n");
                    }
                }
                else
                {
                    this.downloadLog.append("Server address missing.\n");
                }
            }
            else
            {
                this.downloadLog.append("No local file path indicated.\n");
            }
        }
        else
        {
            this.downloadLog.append("No remote file selected.\n");
        }
    }//GEN-LAST:event_downloadFile

    private void sendFile(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sendFile
    {//GEN-HEADEREND:event_sendFile
        if(!this.sendLocalFilePath.getText().isEmpty())
        {
            if(!this.sendServerAddress.getText().isEmpty())
            {
                String remoteFileName = !this.sendRemoteFileName.getText().isEmpty() ? this.sendRemoteFileName.getText() : (new File(this.sendLocalFilePath.getText())).getName();
                
                try
                {
                    int errorCode;
                    
                    this.sendButton.setEnabled(false);
                    
                    switch(errorCode = TFTPClient.sendFile(                        
                            this.sendLocalFilePath.getText(),
                            remoteFileName,
                            InetAddress.getByName(this.sendServerAddress.getText()),
                            69
                    ))
                    {
                        case 0:
                            this.sendLog.append("Successfully uploaded " + this.sendLocalFilePath.getText() + ".\n");
                        break;
                            
                        case -1:
                            this.sendLog.append(this.sendLocalFilePath.getText() + " doesn't exist.\n");
                        break;
                            
                        case -2:
                            this.sendLog.append(this.sendLocalFilePath.getText() + " can't be read.\n");
                        break;
                            
                        case -4:
                            this.downloadLog.append("Timeout.\n");
                        break;
                        
                        case -5:
                            this.sendLog.append(this.sendLocalFilePath.getText() + " isn't a file.\n");
                        break;
                            
                        case -6:
                            this.downloadLog.append("Network error.\n");
                        break;
                        
                        case -7:
                            this.downloadLog.append("I/O error.\n");
                        break;
                        
                        default:
                            this.sendLog.append("TFTP server error " + errorCode + ".\n");
                    }
                    
                    this.sendButton.setEnabled(true);
                }
                catch(UnknownHostException e)
                {
                    this.sendLog.append("Couldn't resolve server address: " + e.getMessage() + "\n");
                }
            }
            else
            {
                this.sendLog.append("Server address missing.\n");
            }
        }
        else
        {
            this.sendLog.append("No local file selected.\n");
        }
    }//GEN-LAST:event_sendFile

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseDownloadButton;
    private javax.swing.JButton browseSendButton;
    private javax.swing.JButton clearDownloadLogButton;
    private javax.swing.JButton clearSendButtonLog;
    private javax.swing.JButton downloadButton;
    private javax.swing.JTextField downloadLocalFilePath;
    private javax.swing.JTextArea downloadLog;
    private javax.swing.JTextField downloadRemoteFileName;
    private javax.swing.JTextField downloadServerAddress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField sendLocalFilePath;
    private javax.swing.JTextArea sendLog;
    private javax.swing.JTextField sendRemoteFileName;
    private javax.swing.JTextField sendServerAddress;
    // End of variables declaration//GEN-END:variables
}
