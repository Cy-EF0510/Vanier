namespace ClockExample
{
   partial class Clock
   {
      /// <summary>
      /// Required designer variable.
      /// </summary>
      private System.ComponentModel.IContainer components = null;

      /// <summary>
      /// Clean up any resources being used.
      /// </summary>
      /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
      protected override void Dispose( bool disposing )
      {
         if ( disposing && ( components != null ) )
         {
            components.Dispose();
         }
         base.Dispose( disposing );
      }

      #region Windows Form Designer generated code

      /// <summary>
      /// Required method for Designer support - do not modify
      /// the contents of this method with the code editor.
      /// </summary>
      private void InitializeComponent()
      {
            this.clockUserControl1 = new ClockExample.ClockUserControl();
            this.SuspendLayout();
            // 
            // clockUserControl1
            // 
            this.clockUserControl1.BackColor = System.Drawing.Color.White;
            this.clockUserControl1.Location = new System.Drawing.Point(14, 14);
            this.clockUserControl1.Name = "clockUserControl1";
            this.clockUserControl1.Size = new System.Drawing.Size(180, 85);
            this.clockUserControl1.TabIndex = 0;
            // 
            // Clock
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(208, 114);
            this.Controls.Add(this.clockUserControl1);
            this.Font = new System.Drawing.Font("Segoe UI", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Name = "Clock";
            this.Text = "Clock";
            this.ResumeLayout(false);

      }

      #endregion

      private ClockUserControl clockUserControl1;
    }
}


