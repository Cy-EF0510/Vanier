using System;
using System.Windows.Forms;

namespace LinkLabelTest
{
    public partial class LinkLabelTestForm : Form
    {
        public LinkLabelTestForm()
        {
            InitializeComponent();
        }

        // browse C:\ drive
        private void cDriveLinkLabel_LinkClicked(object sender, 
            LinkLabelLinkClickedEventArgs e)
        {
            // change LinkColor after it has been clicked
            cDriveLinkLabel.LinkVisited = true;

            System.Diagnostics.Process.Start(@"C:\");
        }

        // load www.deitel.com in web browwser
        private void deitelLinkLabel_LinkClicked(object sender,
            LinkLabelLinkClickedEventArgs e)
        {
            //change LinkColor after it has been clicked
            deitelLinkLabel.LinkVisited = true;

            System.Diagnostics.Process.Start("https://www.deitel.com");
        }

        // run app Notepad
        private void notepadLinkLabel_LinkClicked(object sender,
            LinkLabelLinkClickedEventArgs e)
        {
            // change LinkColor after it has been clicked
            notepadLinkLabel.LinkVisited = true;

            // program called as if in run
            // menu and full path not needed
            System.Diagnostics.Process.Start("notepad");
        }

        // load ctv.cs
        private void ctvLinkLabel_LinkClicked(object sender, 
            LinkLabelLinkClickedEventArgs e)
        {
            //change LinkColor after it has been clicked
            ctvLinkLabel.LinkVisited = true;

            System.Diagnostics.Process.Start("https://www.ctv.ca/");
        }
    }
}
