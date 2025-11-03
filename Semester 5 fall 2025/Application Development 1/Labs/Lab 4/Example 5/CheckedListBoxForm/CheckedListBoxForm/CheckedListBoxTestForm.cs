using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CheckedListBoxForm
{
    public partial class CheckedListBoxTestForm : Form
    {
        public CheckedListBoxTestForm()
        {
            InitializeComponent();
        }

        // item checked or uchecked
        // add or remove from display ListBox
        private void itemCheckedListBox_ItemCheck(
         object sender, ItemCheckEventArgs e)
        {
            // obtain reference of selected item
            string item = itemCheckedListBox.SelectedItem.ToString();

            // if item checked, add to ListBox
            // otherwise remove from ListBox
            if (e.NewValue == CheckState.Checked)
            {
                displayListBox.Items.Add(item);
            }
            else
            {
                displayListBox.Items.Remove(item);
            }
        }
    }
}
