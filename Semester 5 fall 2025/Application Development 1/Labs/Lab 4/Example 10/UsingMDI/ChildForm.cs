// Fig. 15.44: ChildForm.cs
// Child window of MDI parent.

using System.Drawing;
using System.Windows.Forms;

namespace UsingMDI
{
   public partial class ChildForm : Form
   {
      public ChildForm(string title, string resourceName)
      {
         // Required for Windows Form Designer support
         InitializeComponent();

         Text = title; // set title text

         // set image to display in PictureBox
         displayPictureBox.Image =
            (Image)(Properties.Resources.ResourceManager.GetObject(
               resourceName));
      }
   }
}


