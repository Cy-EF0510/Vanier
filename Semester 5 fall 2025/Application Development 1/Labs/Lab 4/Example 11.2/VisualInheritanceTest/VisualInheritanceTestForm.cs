// Fig. 15.48: VisualInheritanceTestForm.cs
// Derived Form using visual inheritance.
using System;
using System.Windows.Forms;

namespace VisualInheritanceTest
{
   // derived form using visual inheritance
   public partial class VisualInheritanceTestForm : 
      VisualInheritanceBase.VisualInheritanceBaseForm
   {
      // constructor
      public VisualInheritanceTestForm()
      {
         InitializeComponent();
      } 

      // display MessageBox when Button is clicked
      private void aboutButton_Click( object sender, EventArgs e )
      {
         MessageBox.Show(
            "This program was created by Deitel & Associates.",
            "About This Program", MessageBoxButtons.OK,
            MessageBoxIcon.Information );
      } 
   }
}

