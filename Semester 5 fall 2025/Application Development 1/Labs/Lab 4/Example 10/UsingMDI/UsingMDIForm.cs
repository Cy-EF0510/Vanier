// Fig. 15.43: UsingMDIForm.cs
// Demonstrating an MDI parent and MDI child windows.
using System;
using System.Windows.Forms;

namespace UsingMDI
{
   // Form demonstrates the use of MDI parent and child windows
   public partial class UsingMDIForm : Form
   {
      // constructor
      public UsingMDIForm()
      {
         InitializeComponent();
      }

      // create Lavender Flowers image window
      private void lavenderToolStripMenuItem_Click(
         object sender, EventArgs e)
      {
         // create new child
         var child = new ChildForm(
             "Lavender Flowers", "lavenderflowers");
         child.MdiParent = this; // set parent       
         child.Show(); // display child              
      }

      // create Purple Flowers image window
      private void purpleToolStripMenuItem_Click(
         object sender, EventArgs e)
      {
         // create new child
         var child = new ChildForm(
             "Purple Flowers", "purpleflowers");
         child.MdiParent = this; // set parent   
         child.Show(); // display child          
      }

      // create Yellow Flowers image window
      private void yellowToolStripMenuItem_Click(
         object sender, EventArgs e)
      {
         // create new child
         var child = new ChildForm(
             "Yellow Flowers", "yellowflowers");
         child.MdiParent = this; // set parent   
         child.Show(); // display child          
      }

      // exit app
      private void exitToolStripMenuItem_Click(
         object sender, EventArgs e)
      {
         Application.Exit();
      }

      // set Cascade layout
      private void cascadeToolStripMenuItem_Click(
         object sender, EventArgs e)
      {
         this.LayoutMdi(MdiLayout.Cascade);
      }

      // set TileHorizontal layout
      private void tileHorizontalToolStripMenuItem_Click(
         object sender, EventArgs e)
      {
         this.LayoutMdi(MdiLayout.TileHorizontal);
      }

      // set TileVertical layout
      private void tileVerticalToolStripMenuItem_Click(
         object sender, EventArgs e)
      {
         this.LayoutMdi(MdiLayout.TileVertical);
      }
   }
}


