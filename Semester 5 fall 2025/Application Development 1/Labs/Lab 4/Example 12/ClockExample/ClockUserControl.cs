// Fig. 15.50: ClockUserControl.cs
// User-defined control with a timer and a Label.
using System;
using System.Windows.Forms;

namespace ClockExample
{
   // UserControl that displays the time on a Label
   public partial class ClockUserControl : UserControl
   {
      // constructor
      public ClockUserControl()
      {
         InitializeComponent();
      } // end constructor

      // update Label at every tick
      private void clockTimer_Tick( object sender, EventArgs e )
      {
         // get current time (Now), convert to string
         displayLabel.Text = DateTime.Now.ToLongTimeString();
      }
   } 
}
