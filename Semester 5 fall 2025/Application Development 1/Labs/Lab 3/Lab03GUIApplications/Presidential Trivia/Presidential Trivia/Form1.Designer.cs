namespace Presidential_Trivia
{
    partial class Form1
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
            this.questionLabel = new System.Windows.Forms.Label();
            this.answerLabel = new System.Windows.Forms.Label();
            this.showAnswerButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // questionLabel
            // 
            this.questionLabel.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.questionLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F);
            this.questionLabel.Location = new System.Drawing.Point(68, 42);
            this.questionLabel.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.questionLabel.Name = "questionLabel";
            this.questionLabel.Size = new System.Drawing.Size(232, 48);
            this.questionLabel.TabIndex = 0;
            this.questionLabel.Text = "What Former U.S. president is known for going on an African safari?";
            this.questionLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // answerLabel
            // 
            this.answerLabel.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.answerLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F);
            this.answerLabel.Location = new System.Drawing.Point(68, 111);
            this.answerLabel.Margin = new System.Windows.Forms.Padding(2, 0, 2, 0);
            this.answerLabel.Name = "answerLabel";
            this.answerLabel.Size = new System.Drawing.Size(233, 51);
            this.answerLabel.TabIndex = 1;
            this.answerLabel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // showAnswerButton
            // 
            this.showAnswerButton.Location = new System.Drawing.Point(128, 193);
            this.showAnswerButton.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.showAnswerButton.Name = "showAnswerButton";
            this.showAnswerButton.Size = new System.Drawing.Size(110, 19);
            this.showAnswerButton.TabIndex = 2;
            this.showAnswerButton.Text = "Show the Answer";
            this.showAnswerButton.UseVisualStyleBackColor = true;
            this.showAnswerButton.Click += new System.EventHandler(this.showAnswerButton_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(356, 272);
            this.Controls.Add(this.showAnswerButton);
            this.Controls.Add(this.answerLabel);
            this.Controls.Add(this.questionLabel);
            this.Margin = new System.Windows.Forms.Padding(2, 2, 2, 2);
            this.Name = "Form1";
            this.Text = "Presidential Trivia";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label questionLabel;
        private System.Windows.Forms.Label answerLabel;
        private System.Windows.Forms.Button showAnswerButton;
    }
}

