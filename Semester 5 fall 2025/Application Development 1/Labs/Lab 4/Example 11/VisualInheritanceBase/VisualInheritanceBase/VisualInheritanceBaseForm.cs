// Fig. 15.45: VisualInheritanceBaseForm.cs
// Base Form for use with visual inheritance.
using System;
using System.Windows.Forms;

namespace VisualInheritanceBase
{
   // base Form used to demonstrate visual inheritance
   public partial class VisualInheritanceBaseForm : Form
   {
      // constructor
      public VisualInheritanceBaseForm()
      {
         InitializeComponent();
      }

      // display MessageBox when Button is clicked
      private void learnMoreButton_Click(object sender, EventArgs e)
      {
         MessageBox.Show(
            "Bugs, Bugs, Bugs is a product of deitel.com",
            "Learn More", MessageBoxButtons.OK,
            MessageBoxIcon.Information);
      }
   }
}


