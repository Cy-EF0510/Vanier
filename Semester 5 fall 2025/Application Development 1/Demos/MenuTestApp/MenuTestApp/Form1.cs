using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace MenuTestApp
{
    public partial class MenuTestApplication : Form
    {
        public MenuTestApplication()
        {
            InitializeComponent();
        }

        private void aboutToolStripMenu_Click(object sender, EventArgs e)
        {
            MessageBox.Show("this App using Menu to show different choices",
                            "App designed by Cyril Efren Fabro", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void exitToolStripMenu_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }


        private void clearColorCheckMark()
        {
            blackButton.Checked = false;
            blueButton.Checked = false;
            greenButton.Checked = false;
            redButton.Checked = false;
        }

        private void clearFontCheckMark()
        {
            fontComicSansButton.Checked = false;
            fontCourierButton.Checked = false;
            fontTimesNewRomanButton.Checked = false;
        }

        private void blackButton_Click(object sender, EventArgs e) //black item
        {
            clearColorCheckMark();

            msgLabel.ForeColor = Color.Black;
            blackButton.Checked = true;
        }

        private void blueButton_Click(object sender, EventArgs e)
        {
            clearColorCheckMark();

            msgLabel.ForeColor = Color.Blue;
            blueButton.Checked = true;
        }

        private void greenButton_Click(object sender, EventArgs e)
        {
            clearColorCheckMark();

            msgLabel.ForeColor = Color.Green;
            greenButton.Checked = true;
        }
        private void redButton_Click(object sender, EventArgs e)
        {
            clearColorCheckMark();

            msgLabel.ForeColor = Color.Red;
            redButton.Checked = true;
        }

        private void fontComicSansButton_Click(object sender, EventArgs e)
        {
            clearFontCheckMark();
            msgLabel.Font = new Font("Comic Sans MS", 14, Font.Style);
            fontComicSansButton.Checked = true;
        }

        private void fontCourierButton_Click(object sender, EventArgs e)
        {
            clearFontCheckMark();
            msgLabel.Font = new Font("Courier", 14, Font.Style);
            fontCourierButton.Checked = true;
        }

        private void fontTimesNewRomanButton_Click(object sender, EventArgs e)
        {
            clearFontCheckMark();
            msgLabel.Font = new Font("Times New Roman", 14, Font.Style);
            fontTimesNewRomanButton.Checked = true;
        }

        private void fontBoldButton_Click(object sender, EventArgs e)
        {
            msgLabel.Font = new Font(msgLabel.Font, msgLabel.Font.Style ^ FontStyle.Bold);
            fontBoldButton.Checked = !fontBoldButton.Checked;
        }

        private void fontItalicButton_Click(object sender, EventArgs e)
        {
            msgLabel.Font = new Font(msgLabel.Font, msgLabel.Font.Style ^ FontStyle.Italic);
            fontItalicButton.Checked = !fontItalicButton.Checked;
        }
    }
}
