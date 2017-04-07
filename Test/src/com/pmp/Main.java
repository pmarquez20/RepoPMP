package com.pmp;
/*
import javax.swing.JFileChooser;

public class Main {
  public static void main(String[] argv) {
	  System.out.println("hola");
    JFileChooser fileChooser = new JFileChooser(".");
    fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
  }
}
*/

import javax.swing.JFileChooser;

public class Main {
  public static void main(String[] argv) {
    JFileChooser chooser = new JFileChooser();
    int result = chooser.showOpenDialog(null);
    switch (result) {
    case JFileChooser.APPROVE_OPTION:
      System.out.println("Approve (Open or Save) was clicked");
      break;
    case JFileChooser.CANCEL_OPTION:
      System.out.println("Cancel or the close-dialog icon was clicked");
      break;
    case JFileChooser.ERROR_OPTION:
      System.out.println("Error new");
      break;
    }
  }
}