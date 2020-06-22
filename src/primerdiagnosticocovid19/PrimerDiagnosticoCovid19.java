package primerdiagnosticocovid19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PrimerDiagnosticoCovid19 {

    public static void main(String[] args) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        boolean prueba = true;
        String nombre = "", t_seca = "", fiebre = "", c_nasal = "", d_garganta = "",
                d_respirar = "", d_cabeza = "", d_muscular = "", estornudos = "", fatiga = "",
                diarrea = "", credito = "", resultado = "";
        archivo = new File("diagnostico.txt");
        while (prueba) {
            if (!archivo.exists()) {
                try {
                    archivo.createNewFile();
                    nombre = JOptionPane.showInputDialog(null, "Responda si o no a las siguientes preguntas....Ingresa el Nombre",
                            "Solicitando datos", 3);
                    t_seca = JOptionPane.showInputDialog(null, "Tiene tos seca?",
                            "Solicitando datos", 3);
                    fiebre = JOptionPane.showInputDialog(null, "Fiebre Alta?",
                            "Solicitando datos", 3);
                    c_nasal = JOptionPane.showInputDialog(null, "Congestion Nasal?",
                            "Solicitando datos", 3);
                    d_garganta = JOptionPane.showInputDialog(null, "Dolor de Garganta?",
                            "Solicitando datos", 3);
                    d_respirar = JOptionPane.showInputDialog(null, "Dificultad al respirar?",
                            "Solicitando datos", 3);
                    d_cabeza = JOptionPane.showInputDialog(null, "Dolor de cabeza",
                            "Solicitando datos", 3);
                    d_muscular = JOptionPane.showInputDialog(null, "Dolor muscular?",
                            "Solicitando datos", 3);
                    estornudos = JOptionPane.showInputDialog(null, "Estornuda frecuentemente",
                            "Solicitando datos", 3);
                    fatiga = JOptionPane.showInputDialog(null, "Tiene Fatiga?",
                            "Solicitando datos", 3);
                    diarrea = JOptionPane.showInputDialog(null, "Tiene Diarrea",
                            "Solicitando datos", 3);
                    if (t_seca.equals("si") && fiebre.equals("si") && d_respirar.equals("si") && estornudos.equals("no")) {
                        resultado = "75% Covid-19";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre + " Sintomas:");
                        linea.print(" Tos Seca,");
                        linea.print(" Fiebre,");
                        linea.print(" Dificultad de respirar");
                        linea.print(" Su diagnostico es :" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }
                    } else if (d_muscular.equals("si") && d_garganta.equals("si") && c_nasal.equals("si")
                            && estornudos.equals("si") && diarrea.equals("no") && d_respirar.equals("no")
                            && fiebre.equals("no") && d_cabeza.equals("no")) {
                        resultado = "Resfriado";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre + "Sintomas:");
                        linea.print(" Dolor muscular,");
                        linea.print(" Dolor de garganta,");
                        linea.print(" Congestion Nasal,");
                        linea.print(" Estornudos");
                        linea.print(" Su diagnostico es :" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico ?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }
                    } else if (d_muscular.equals("si") && d_garganta.equals("si")
                            && d_respirar.equals("si") && d_cabeza.equals("si")
                            && fatiga.equals("si")) {
                        resultado = "Requiere Cuarentena";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre + " Sintomas:");
                        linea.print(" Dolor muscular,");
                        linea.print(" Dolor de garganta,");
                        linea.print(" Dificultad a respirar,");
                        linea.print(" Dolor de cabeza,");
                        linea.print(" Fatiga");
                        linea.print(" Su diagnostico es:" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico ?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }
                    } else if (d_muscular.equals("si") && d_cabeza.equals("si")
                            && fatiga.equals("si") && t_seca.equals("si") && fiebre.equals("si")
                            && d_respirar.equals("no") && estornudos.equals("no")) {
                        resultado = "Gripe";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre + " Sintomas:");
                        linea.print(" Dolor muscular,");
                        linea.print(" Dolor de garganta,");
                        linea.print(" Fatiga,");
                        linea.print(" Tos Seca,");
                        linea.print("Fiebre");
                        linea.print(" Su diagnostico es :" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico ?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }

                    } else {
                        resultado = "Presenta sintomas leves......";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre);
                        //linea.print(" Tos Seca:" + t_seca);
                        //linea.print(" Fiebre:" + fiebre);
                        linea.print(" Su diagnostico es :" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico ?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(PrimerDiagnosticoCovid19.class.getName()).log(Level.SEVERE, null, ex);
                }
                ////////////////////////////////////////////////////////////////////////////////////////////////
            } else {
                try {
                    nombre = JOptionPane.showInputDialog(null, "Responda si o no a las siguientes preguntas....Ingresa el Nombre",
                            "Solicitando datos", 3);
                    t_seca = JOptionPane.showInputDialog(null, "Tiene tos seca?",
                            "Solicitando datos", 3);
                    fiebre = JOptionPane.showInputDialog(null, "Fiebre Alta?",
                            "Solicitando datos", 3);
                    c_nasal = JOptionPane.showInputDialog(null, "Congestion Nasal?",
                            "Solicitando datos", 3);
                    d_garganta = JOptionPane.showInputDialog(null, "Dolor de Garganta?",
                            "Solicitando datos", 3);
                    d_respirar = JOptionPane.showInputDialog(null, "Dificultad al respirar?",
                            "Solicitando datos", 3);
                    d_cabeza = JOptionPane.showInputDialog(null, "Dolor de cabeza",
                            "Solicitando datos", 3);
                    d_muscular = JOptionPane.showInputDialog(null, "Dolor muscular?",
                            "Solicitando datos", 3);
                    estornudos = JOptionPane.showInputDialog(null, "Estornuda frecuentemente",
                            "Solicitando datos", 3);
                    fatiga = JOptionPane.showInputDialog(null, "Tiene Fatiga?",
                            "Solicitando datos", 3);
                    diarrea = JOptionPane.showInputDialog(null, "Tiene Diarrea",
                            "Solicitando datos", 3);
                    if (t_seca.equals("si") && fiebre.equals("si") && d_respirar.equals("si") && estornudos.equals("no")) {
                        resultado = "75% Covid-19";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre + " Sintomas:");
                        linea.print(" Tos Seca,");
                        linea.print(" Fiebre,");
                        linea.print(" Dificultad de respirar ");
                        linea.print(" Su diagnostico es :" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }
                    } else if (d_muscular.equals("si") && d_garganta.equals("si") && c_nasal.equals("si")
                            && estornudos.equals("si") && diarrea.equals("no") && d_respirar.equals("no")
                            && fiebre.equals("no") && d_cabeza.equals("no")) {
                        resultado = "Resfriado";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre + " Sintomas:");
                        linea.print(" Dolor muscular,");
                        linea.print(" Dolor de garganta,");
                        linea.print(" Congestion Nasal,");
                        linea.print(" Estornudos");
                        linea.print(" Su diagnostico es :" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico ?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }
                    } else if (d_muscular.equals("si") && d_garganta.equals("si")
                            && d_respirar.equals("si") && d_cabeza.equals("si")
                            && fatiga.equals("si")) {
                        resultado = "Requiere Cuarentena";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre + " Sintomas:");
                        linea.print(" Dolor muscular,");
                        linea.print(" Dolor de garganta,");
                        //linea.print(" Tos seca:" + t_seca);
                        linea.print(" Dificultad a respirar,");
                        //linea.print(" Fiebre:" + fiebre);
                        linea.print(" Dolor de cabeza,");
                        linea.print(" Fatiga");
                        linea.print(" Su diagnostico es:" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico ?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }
                    } else if (d_muscular.equals("si") && d_cabeza.equals("si")
                            && fatiga.equals("si") && t_seca.equals("si") && fiebre.equals("si")
                            && d_respirar.equals("no") && estornudos.equals("no")) {
                        resultado = "Gripe";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre + " Sintomas:");
                        linea.print(" Dolor muscular,");
                        linea.print(" Dolor de garganta,");
                        linea.print(" Fatiga,:");
                        linea.print(" Tos Seca,");
                        linea.print("Fiebre");
                        linea.print(" Su diagnostico es :" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico ?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }

                    } else {
                        resultado = "Presenta sintomas leves...";
                        JOptionPane.showMessageDialog(null, nombre + " su diagnostico es : " + resultado);
                        escribir = new FileWriter(archivo, true);
                        linea = new PrintWriter(escribir);
                        linea.println();
                        linea.print("Nombre:" + nombre);
                        //linea.print(" Tos Seca:" + t_seca);
                        //linea.print(" Fiebre:" + fiebre);
                        linea.print(" Su diagnostico es :" + resultado);
                        linea.close();
                        escribir.close();
                        int resp = JOptionPane.showConfirmDialog(null, "¿Desea hacer otro diagnostico ?",
                                "Alerta!", JOptionPane.YES_NO_OPTION);
                        if (resp == 1) {
                            prueba = false;
                        } else {
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(PrimerDiagnosticoCovid19.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
