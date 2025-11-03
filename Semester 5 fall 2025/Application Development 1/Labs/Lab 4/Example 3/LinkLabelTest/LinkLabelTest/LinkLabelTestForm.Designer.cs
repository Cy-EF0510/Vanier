namespace LinkLabelTest
{
    partial class LinkLabelTestForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.cDriveLinkLabel = new System.Windows.Forms.LinkLabel();
            this.deitelLinkLabel = new System.Windows.Forms.LinkLabel();
            this.notepadLinkLabel = new System.Windows.Forms.LinkLabel();
            this.ctvLinkLabel = new System.Windows.Forms.LinkLabel();
            this.SuspendLayout();
            // 
            // cDriveLinkLabel
            // 
            this.cDriveLinkLabel.AutoSize = true;
            this.cDriveLinkLabel.Location = new System.Drawing.Point(12, 9);
            this.cDriveLinkLabel.Name = "cDriveLinkLabel";
            this.cDriveLinkLabel.Size = new System.Drawing.Size(102, 13);
            this.cDriveLinkLabel.TabIndex = 0;
            this.cDriveLinkLabel.TabStop = true;
            this.cDriveLinkLabel.Text = "Click to browse C://";
            this.cDriveLinkLabel.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.cDriveLinkLabel_LinkClicked);
            // 
            // deitelLinkLabel
            // 
            this.deitelLinkLabel.AutoSize = true;
            this.deitelLinkLabel.Location = new System.Drawing.Point(13, 40);
            this.deitelLinkLabel.Name = "deitelLinkLabel";
            this.deitelLinkLabel.Size = new System.Drawing.Size(141, 13);
            this.deitelLinkLabel.TabIndex = 1;
            this.deitelLinkLabel.TabStop = true;
            this.deitelLinkLabel.Text = "Click to visit www.deitel.com";
            this.deitelLinkLabel.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.deitelLinkLabel_LinkClicked);
            // 
            // notepadLinkLabel
            // 
            this.notepadLinkLabel.AutoSize = true;
            this.notepadLinkLabel.Location = new System.Drawing.Point(13, 67);
            this.notepadLinkLabel.Name = "notepadLinkLabel";
            this.notepadLinkLabel.Size = new System.Drawing.Size(104, 13);
            this.notepadLinkLabel.TabIndex = 2;
            this.notepadLinkLabel.TabStop = true;
            this.notepadLinkLabel.Text = "Click to run Notepad";
            this.notepadLinkLabel.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.notepadLinkLabel_LinkClicked);
            // 
            // ctvLinkLabel
            // 
            this.ctvLinkLabel.AutoSize = true;
            this.ctvLinkLabel.Location = new System.Drawing.Point(13, 102);
            this.ctvLinkLabel.Name = "ctvLinkLabel";
            this.ctvLinkLabel.Size = new System.Drawing.Size(123, 13);
            this.ctvLinkLabel.TabIndex = 3;
            this.ctvLinkLabel.TabStop = true;
            this.ctvLinkLabel.Text = "Click to visit www.ctv.ca";
            this.ctvLinkLabel.LinkClicked += new System.Windows.Forms.LinkLabelLinkClickedEventHandler(this.ctvLinkLabel_LinkClicked);
            // 
            // LinkLabelTestForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(181, 153);
            this.Controls.Add(this.ctvLinkLabel);
            this.Controls.Add(this.notepadLinkLabel);
            this.Controls.Add(this.deitelLinkLabel);
            this.Controls.Add(this.cDriveLinkLabel);
            this.Name = "LinkLabelTestForm";
            this.Text = "LinkLabel Control";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.LinkLabel cDriveLinkLabel;
        private System.Windows.Forms.LinkLabel deitelLinkLabel;
        private System.Windows.Forms.LinkLabel notepadLinkLabel;
        private System.Windows.Forms.LinkLabel ctvLinkLabel;
    }
}

