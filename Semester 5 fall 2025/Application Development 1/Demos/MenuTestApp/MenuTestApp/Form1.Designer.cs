namespace MenuTestApp
{
    partial class MenuTestApplication
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
            this.menuStrip2 = new System.Windows.Forms.MenuStrip();
            this.toolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.aboutToolStripMenu = new System.Windows.Forms.ToolStripMenuItem();
            this.exitToolStripMenu = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem2 = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripMenuItem6 = new System.Windows.Forms.ToolStripMenuItem();
            this.blackButton = new System.Windows.Forms.ToolStripMenuItem();
            this.blueButton = new System.Windows.Forms.ToolStripMenuItem();
            this.greenButton = new System.Windows.Forms.ToolStripMenuItem();
            this.redButton = new System.Windows.Forms.ToolStripMenuItem();
            this.fontButton = new System.Windows.Forms.ToolStripMenuItem();
            this.fontComicSansButton = new System.Windows.Forms.ToolStripMenuItem();
            this.fontTimesNewRomanButton = new System.Windows.Forms.ToolStripMenuItem();
            this.fontCourierButton = new System.Windows.Forms.ToolStripMenuItem();
            this.msgLabel = new System.Windows.Forms.Label();
            this.fontBoldButton = new System.Windows.Forms.ToolStripMenuItem();
            this.fontItalicButton = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator3 = new System.Windows.Forms.ToolStripSeparator();
            this.menuStrip2.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip2
            // 
            this.menuStrip2.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripMenuItem1,
            this.toolStripMenuItem2});
            this.menuStrip2.Location = new System.Drawing.Point(0, 0);
            this.menuStrip2.Name = "menuStrip2";
            this.menuStrip2.Size = new System.Drawing.Size(484, 24);
            this.menuStrip2.TabIndex = 0;
            this.menuStrip2.Text = "menuStrip2";
            // 
            // toolStripMenuItem1
            // 
            this.toolStripMenuItem1.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.aboutToolStripMenu,
            this.exitToolStripMenu});
            this.toolStripMenuItem1.Name = "toolStripMenuItem1";
            this.toolStripMenuItem1.Size = new System.Drawing.Size(37, 20);
            this.toolStripMenuItem1.Text = "File";
            // 
            // aboutToolStripMenu
            // 
            this.aboutToolStripMenu.Name = "aboutToolStripMenu";
            this.aboutToolStripMenu.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.F1)));
            this.aboutToolStripMenu.Size = new System.Drawing.Size(153, 22);
            this.aboutToolStripMenu.Text = "&About";
            this.aboutToolStripMenu.Click += new System.EventHandler(this.aboutToolStripMenu_Click);
            // 
            // exitToolStripMenu
            // 
            this.exitToolStripMenu.Name = "exitToolStripMenu";
            this.exitToolStripMenu.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.F10)));
            this.exitToolStripMenu.Size = new System.Drawing.Size(153, 22);
            this.exitToolStripMenu.Text = "E&xit";
            this.exitToolStripMenu.Click += new System.EventHandler(this.exitToolStripMenu_Click);
            // 
            // toolStripMenuItem2
            // 
            this.toolStripMenuItem2.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripMenuItem6,
            this.fontButton});
            this.toolStripMenuItem2.Name = "toolStripMenuItem2";
            this.toolStripMenuItem2.Size = new System.Drawing.Size(57, 20);
            this.toolStripMenuItem2.Text = "Format";
            // 
            // toolStripMenuItem6
            // 
            this.toolStripMenuItem6.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.blackButton,
            this.blueButton,
            this.greenButton,
            this.redButton});
            this.toolStripMenuItem6.Name = "toolStripMenuItem6";
            this.toolStripMenuItem6.Size = new System.Drawing.Size(180, 22);
            this.toolStripMenuItem6.Text = "Color";
            // 
            // blackButton
            // 
            this.blackButton.Checked = true;
            this.blackButton.CheckState = System.Windows.Forms.CheckState.Checked;
            this.blackButton.Name = "blackButton";
            this.blackButton.Size = new System.Drawing.Size(180, 22);
            this.blackButton.Text = "Black";
            this.blackButton.Click += new System.EventHandler(this.blackButton_Click);
            // 
            // blueButton
            // 
            this.blueButton.Name = "blueButton";
            this.blueButton.Size = new System.Drawing.Size(180, 22);
            this.blueButton.Text = "Blue";
            this.blueButton.Click += new System.EventHandler(this.blueButton_Click);
            // 
            // greenButton
            // 
            this.greenButton.Name = "greenButton";
            this.greenButton.Size = new System.Drawing.Size(180, 22);
            this.greenButton.Text = "Green";
            this.greenButton.Click += new System.EventHandler(this.greenButton_Click);
            // 
            // redButton
            // 
            this.redButton.Name = "redButton";
            this.redButton.Size = new System.Drawing.Size(180, 22);
            this.redButton.Text = "Red";
            this.redButton.Click += new System.EventHandler(this.redButton_Click);
            // 
            // fontButton
            // 
            this.fontButton.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.fontComicSansButton,
            this.fontTimesNewRomanButton,
            this.fontCourierButton,
            this.toolStripSeparator3,
            this.fontBoldButton,
            this.fontItalicButton});
            this.fontButton.Name = "fontButton";
            this.fontButton.Size = new System.Drawing.Size(180, 22);
            this.fontButton.Text = "Font";
            // 
            // fontComicSansButton
            // 
            this.fontComicSansButton.Checked = true;
            this.fontComicSansButton.CheckState = System.Windows.Forms.CheckState.Checked;
            this.fontComicSansButton.Name = "fontComicSansButton";
            this.fontComicSansButton.Size = new System.Drawing.Size(180, 22);
            this.fontComicSansButton.Text = "Comic Sans";
            this.fontComicSansButton.Click += new System.EventHandler(this.fontComicSansButton_Click);
            // 
            // fontTimesNewRomanButton
            // 
            this.fontTimesNewRomanButton.Name = "fontTimesNewRomanButton";
            this.fontTimesNewRomanButton.Size = new System.Drawing.Size(180, 22);
            this.fontTimesNewRomanButton.Text = "Times New Roman";
            this.fontTimesNewRomanButton.Click += new System.EventHandler(this.fontTimesNewRomanButton_Click);
            // 
            // fontCourierButton
            // 
            this.fontCourierButton.Name = "fontCourierButton";
            this.fontCourierButton.Size = new System.Drawing.Size(180, 22);
            this.fontCourierButton.Text = "Courier";
            this.fontCourierButton.Click += new System.EventHandler(this.fontCourierButton_Click);
            // 
            // msgLabel
            // 
            this.msgLabel.Font = new System.Drawing.Font("Comic Sans MS", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.msgLabel.Location = new System.Drawing.Point(34, 71);
            this.msgLabel.Name = "msgLabel";
            this.msgLabel.Size = new System.Drawing.Size(286, 70);
            this.msgLabel.TabIndex = 1;
            this.msgLabel.Text = "Use Format menu to change the appearance of this text";
            // 
            // fontBoldButton
            // 
            this.fontBoldButton.Name = "fontBoldButton";
            this.fontBoldButton.Size = new System.Drawing.Size(180, 22);
            this.fontBoldButton.Text = "Bold";
            this.fontBoldButton.Click += new System.EventHandler(this.fontBoldButton_Click);
            // 
            // fontItalicButton
            // 
            this.fontItalicButton.Name = "fontItalicButton";
            this.fontItalicButton.Size = new System.Drawing.Size(180, 22);
            this.fontItalicButton.Text = "Italic";
            this.fontItalicButton.Click += new System.EventHandler(this.fontItalicButton_Click);
            // 
            // toolStripSeparator3
            // 
            this.toolStripSeparator3.Name = "toolStripSeparator3";
            this.toolStripSeparator3.Size = new System.Drawing.Size(177, 6);
            // 
            // MenuTestApplication
            // 
            this.AutoSize = true;
            this.ClientSize = new System.Drawing.Size(484, 261);
            this.Controls.Add(this.msgLabel);
            this.Controls.Add(this.menuStrip2);
            this.MainMenuStrip = this.menuStrip2;
            this.Name = "MenuTestApplication";
            this.Text = "Menu Test Application";
            this.menuStrip2.ResumeLayout(false);
            this.menuStrip2.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem fileToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem formatToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem colorToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem blackToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem blueToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem greenToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem redToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem fontToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem comicSansToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem courierToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem aboutToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem timesNewRomanToolStripMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripMenuItem boldToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem italicToolStripMenuItem;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.MenuStrip menuStrip2;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem1;
        private System.Windows.Forms.ToolStripMenuItem aboutToolStripMenu;
        private System.Windows.Forms.ToolStripMenuItem exitToolStripMenu;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem2;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem6;
        private System.Windows.Forms.ToolStripMenuItem blackButton;
        private System.Windows.Forms.ToolStripMenuItem blueButton;
        private System.Windows.Forms.ToolStripMenuItem greenButton;
        private System.Windows.Forms.ToolStripMenuItem redButton;
        private System.Windows.Forms.ToolStripMenuItem fontButton;
        private System.Windows.Forms.ToolStripMenuItem fontComicSansButton;
        private System.Windows.Forms.ToolStripMenuItem fontTimesNewRomanButton;
        private System.Windows.Forms.ToolStripMenuItem fontCourierButton;
        private System.Windows.Forms.Label msgLabel;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator3;
        private System.Windows.Forms.ToolStripMenuItem fontBoldButton;
        private System.Windows.Forms.ToolStripMenuItem fontItalicButton;
    }
}

